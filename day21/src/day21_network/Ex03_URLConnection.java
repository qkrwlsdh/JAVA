package day21_network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Ex03_URLConnection {
	public static void main(String[] args) throws Exception {	// 예외의 최상위 클래스
																// 발생하는 모든 예외를 전가하겠다
		String urlstr = "http://221.164.9.222/image/dora.png";	// urlstr에 주소를 담고
		URL url = new URL(urlstr);								// 주소를 담은 urlstr을 URL자료형으로 생성
		String downloadName = url.getFile().replace("/", "");	// 그 주소 중에 파일부분 /image/dora.png를 가져오고
																// replace로 /~/ 부분을 공백으로 바꾼다
		
		InputStream is = url.openStream();							// URL의 자원을 가져오는 스트림
		BufferedInputStream bis = new BufferedInputStream(is);		// 버퍼로 가져올 수 있도록
		FileOutputStream fos = new FileOutputStream(downloadName);	// 가져온 파일을 대상으로 출력
		
		byte[] ba = new byte[1024];		// 1024byte = 1KB, 버퍼
		int n = 0;						// 한번에 버퍼에 담긴 크기
		int count = 0;					// 누적하여 다운로드 받은 크기
		
		URLConnection uc = url.openConnection();
		int fileSize = uc.getContentLength();		// 전체 파일 크기
		
		while((n = bis.read(ba)) != -1) {	// -1 : end of file, 더이상 내용이 없다
			fos.write(ba, 0, n);
			count += n;
			fos.flush();
			System.out.println("n : " + n + ", count : " + count);
			System.out.println(count * 100 / fileSize + " %");
		}
		System.out.println("파일 크기 : " + fileSize);
		System.out.println("컨텐트 타입 : " + uc.getContentType());
		
		fos.close();
		bis.close();
		is.close();		// 열어준 역순으로 닫아준다
	}
}
