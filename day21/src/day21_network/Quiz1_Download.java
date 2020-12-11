package day21_network;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Quiz1_Download {
	/*
	 * 사용자에게 URL 경로를 직접 입력받아서
	 * 원하는 파일을 현재 위치에 다운로드하는 프로그램을 작성하세요
	 * 파일의 크기, 파일 이름, 타입, 다운로드 진행상황을 보여줘야 합니다
	 * 
	 * http://221.164.9.222/img/iu.jpg
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("다운받을 주소를 입력 : ");
		String str = sc.nextLine();
		URL url = null;
		try {
			url = new URL(str);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		String downloadName = url.getFile().replace("/", "");
		
		InputStream is = null;
		try {
			is = url.openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedInputStream bis = new BufferedInputStream(is);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(downloadName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		byte[] ba = new byte[1048576];	// 1024 * 1024
		int n = 0;
		int count = 0;
		
		URLConnection uc = null;
		try {
			uc = url.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int fileSize = uc.getContentLength();
		
		try {
			while((n = bis.read(ba)) != -1) {
				fos.write(ba, 0, n);
				count += n;
				fos.flush();
				System.out.println(count * 100 / fileSize + " %");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 크기 : " + fileSize);
		System.out.println("컨텐트 타입 : " + uc.getContentType());
		
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
