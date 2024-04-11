package com.javaex.io.bytestream;

import java.io.File;

public class FileClassEx {
	// files의 경로 (실제)위치
	private static String rootPath=System.getProperty("user.dir") + "\\files";
	
	public static void main(String[] args) {
		System.out.println("루트 경로:" + rootPath);
		
		File f=new File(rootPath); // 파일명으로 파일 정보 객체 생성
		System.out.println(rootPath + ":" + (f.exists() ? "exist" : "none"));
		
		
		// 디렉터리
		// files 디렉터리 아래 files\\subdir\\subdir2 -> 디렉터리 생성
		File newDir = new File(rootPath + "\\subdir\\subdir2"); // 파일 정보
		if(!newDir.exists()) {
			if(newDir.mkdir()) {
				System.out.println(newDir + "을 생성했습니다");
			}
		}
		
		// 새로 생성한 files\\subdir 디렉터리에 새파일 myfile.teㅅ를 만들어 봅시다
		File newFile=new File(rootPath + "\\subdir\\myfile.txt");
		// 파일 객체 생성 -> 정보객체 생성하는 것, 파일을 만드는 것은 아니다
		if(!newFile.exists()) {
			try {
				newFile.createNewFile(); // 실제 파일 생성
			}
			catch (IOException e){
				System.err.println("파일을 만들지 못했어요");
			}
		}
		printFileInfo(f);
		
		// 파일 삭제
		newFile.delete();
	}
	
	private static void printFileInfo(File f) {
		System.out.println("---------------");
		
		// 전달 받은 파일 객체가 디렉토리인가?
		if(f.isDirectory()) { // 디렉터라면 목록 출력
			System.out.println("디렉터리:" +f.getName());
			
			// 파일 목록 가죠오기
			File[] files = f.listFiles();
			
			// 목록정보 출력
			// f rwz
			// d rwz
			
			for(File file:files) {
				System.out.println(file.isDirectory() ? "d " : "f " );
				System.out.println(file.canRead() ? "r " : ". " );
				System.out.println(file.canWrite() ? "w " : ". " );
				System.out.println(file.canExecute() ? "x " : ". " );
				
				System.out.println(" " + file.getName()); // 파일명
				System.out.println("\t" + file.length()); // 파일 사이즈
			}
		}
		else {  // 파일 -> 간략 정보
			System.out.println("File:");
			// 간략한 파일 정보
			System.out.println(f.getName() + "\t"); // 파일명
			System.out.println(f.canRead() ? "r" : "."); // 읽을 수 있는 파일인가?
			System.out.println(f.canWrite() ? "w" : "."); // 기록할 수 있는 파일인가
			System.out.println(f.canExecute() ? "x" : "."); // 실행할 수 있는 파일인가?
			System.out.println();
		}
	}
}
