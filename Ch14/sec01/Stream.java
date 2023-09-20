package Ch14.sec01;

public class Stream {

}
// 자바에서 데이터는 스트림을 통해 입출력된다
// 스트림 : 단일 방향으로 연속적으로 흘러가는 것
// 바이트기반 스트림 : 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력할 때 사용
// 문자기반 스트림 : 문자 데이터를 읽고 출력할 때 사용
// 최상위 클래스를 보면 구분 가능
//						바이트기반 스트림					문자기반 스트림
//				입력 스트림			출력 스트림				입력 스트림	출력 스트림
// 최상위 클래스 : InputStream		OutputStream		Reader		Writer
// 하위 클래스 :	XXXInputStream	XXXOutputStream		XXXReader	XXXWriter