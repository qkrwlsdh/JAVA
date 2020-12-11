package teacher_code;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Quiz1_Download {
	// 사용자에게 URL 경로를 직접 입력받아서
	// 원하는 파일을 현재 위치에 다운로드 하는 프로그램을 작성하세요
	// 파일의 크기, 파일 이름, 타입, 다운로드 진행상황을 보여줘야 합니다

	// http://221.164.9.222/img/iu.jpg
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		URL url = null;
		while(true) {
			try {
				System.out.print("다운로드 받으실 파일의 URL : ");
				String urlstr = sc.nextLine();
				url = new URL(urlstr);
				break;
			} catch (MalformedURLException e) {
				System.out.println("잘못된 URL : " + e);
			}
		}
		
		System.out.println(url);
		System.out.println(url.getFile());
		String[] arr = url.getFile().split("/");	// "/" 로 구분하여 각 단어를 배열로 저장
		String downloadName = arr[arr.length - 1];	// 배열의 가장 마지막번째 글자를 다운로드이름으로 저장
		System.out.println("다운받을 파일의 이름 : " + downloadName);
		
		InputStream is = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null; 
		
		try {
			is = url.openStream();
			bis = new BufferedInputStream(is);
			fos = new FileOutputStream(downloadName);
			
			byte[] ba = new byte[1048576];	// 2KB
			int n = 0;
			int count = 0;
			
			URLConnection uc = url.openConnection();
			int fileSize = uc.getContentLength();
			
			while((n = bis.read(ba)) != -1) {
				fos.write(ba, 0, n);
				fos.flush();
				count += n;
				System.out.println(count * 100 / fileSize + " %");
			}
			System.out.println("파일 크기 : " + fileSize);
			System.out.println("컨텐트 타입 : " + uc.getContentType());
			
		} catch (IOException e) {
			System.out.println("입출력 예외 : " + e);
		} finally {
			sc.close();
			try { if(fos != null) fos.close(); } catch (IOException e) {}
			try { if(bis != null) bis.close(); } catch (IOException e) {}
			try { if(is != null)  is.close();  } catch (IOException e) {}
		}
		
		
		
		
				
		
	}
}