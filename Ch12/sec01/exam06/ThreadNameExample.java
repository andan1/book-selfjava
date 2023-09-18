package Ch12.sec01.exam06;
// 메인 스레드 이름 출력 및 UserThread 생성 및 시작
public class ThreadNameExample {

    public static void main(String[] args) {
        // 이 코드를 실행하는 스레드 객체 얻기
        Thread thread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름 : " + thread.getName());

        // ThreadA 생성 및 시작
        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름 : " + threadA.getName());
        threadA.start();

        // ThreadB 생성 및 시작
        ThreadB threadB = new ThreadB();
        System.out.println("작업 스레드 이름 : " + threadB.getName());
        threadB.start();
    }

}
// 스레드 이름
// 디버깅할 때 어떤 스레드가 어떤 작업을 하는지 조사할 목적으로 가끔 사용 
// 메인 스레드 : main이란 이름을 가지고 있음
// 직접 생성한 스레드는 자동으로 Thread-n이라는 이름으로 설정
// 이름을 설정하고 싶다면 setName() 메소드로 변경