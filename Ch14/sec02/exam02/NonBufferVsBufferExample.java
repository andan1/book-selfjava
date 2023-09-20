package Ch14.sec02.exam02;

import java.io.*;

// 파일 복사 성능 테스트(성능 향상 보조 스트림)
public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		// 기본 스트림 생성
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 버퍼 보조 스트림 연결
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// FileInputStream, FileOutputStream을 이용한 복사 시간 측정
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때 : \t" + nonBufferTime + "ns");
		
		// BufferedInputStream, BufferedOutputStream을 이용한 복사 시간 측정
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 : \t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		// 시작 시간 저장
		long start = System.nanoTime();
		// 파일 복사, 원본 파일에서 읽은 1byte를 타깃 파일로 바로 출력
		while (true) {
			data = is.read();
			if (data == -1) break;
			os.write(data);
		}
		os.flush();
		// 끝 시간 저장
		long end = System.nanoTime();
		// 복사에 걸린 시간 리턴
		return (end - start);
	}

}
// 성능 향상 보조 스트림
// 메모리 버퍼와 작업함으로써 실행 성능을 향상시킬 수 있다
// 프로그램은 직접 하드디스크에 데이터를 보내지 않고 메모리 버퍼에 데이터를 보냄으로써 쓰기 속도가 향상
// 버퍼는 데이터가 쌓이기를 기다렸다가 꽉 차게 되면 데이터를 한꺼번에 
// 하드디스크로 보냄으로써 출력 횟수를 줄여준다

