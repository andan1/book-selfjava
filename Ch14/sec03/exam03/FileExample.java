package Ch14.sec03.exam03;

import java.io.*;
import java.text.*;
import java.util.*;

// File 클래스를 이용한 파일 및 폴더 정보 출력
public class FileExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		if (dir.exists() == false) { dir.mkdirs(); }
		if (file1.exists() == false) { file1.createNewFile(); }
		if (file2.exists() == false) { file2.createNewFile(); }
		if (file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}
// File 클래스 : 파일 및 폴더 정보를 제공해주는 역할
// createNewFile() : 새로운 파일을 생성
// mkdir() : 새로운 폴더를 생성
// mkdirs() : 경로상에 없는 모든 폴더를 생성
// delete() : 파일 또는 폴더를 삭제
// canExecute() : 실행할 수 있는 파일인지 여부를 확인
// canRead() : 읽을 수 있는 파일인지 여부를 확인
// canWrite() : 수정 및 저장할 수 있는 파일인지 여부를 확인
// getName() : 파일의 이름을 리턴
// getParent() : 부모 폴더를 리턴
// getParentFile() : 부모 폴더를 File 객체로 생성 후 리턴
// getPath() : 전체 경로를 리턴
// isDirectory() : 폴더인지 여부를 확인
// isFile() : 파일인지 여부를 확인
// isHidden() : 숨김 파일인지 여부를 확인
// lastModified() : 마지막 수정 날짜 및 시간을 리턴
// length() : 파일의 크기를 리턴
// list() : 폴더에 포함된 파일 및 서브 폴더 목록 전부를 String 배열로 리턴
// list(FilenameFilter filter) : 맞는 것만 String 배열로 리턴
// listFiles() : 폴더에 포함된 파일 및 서브 폴더 목록 전부를 File 배열로 리턴
// listFiles(FilenameFilter filter) : 맞는것만 File 배열로 리턴