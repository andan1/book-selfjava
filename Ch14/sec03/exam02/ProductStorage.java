package Ch14.sec03.exam02;

import java.util.*;

// Scanner로 입력된 문자열 얻기
public class ProductStorage {
	// List 컬렉션 생성
	private List<Product> list = new ArrayList<>();
	// 키보드 입력 Scanner 생성
	private Scanner scanner = new Scanner(System.in);
	// pno 제공 카운터
	private int counter;
	
	public void showMenu() {
		while (true) {
			System.out.println("------------------------");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료");
			System.out.println("------------------------");
			
			System.out.println("선택 : ");
			// 번호 일기
			String selectNo = scanner.nextLine();
			switch (selectNo) {
				// Product 등록
				case "1" : registerProduct(); break;
				// 등록된 모든 Product 정보 보기
				case "2" : showProducts(); break;
				// 프로그램 종료
				case "3" : return;
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			// pno 세팅
			product.setPno(++counter);
			
			System.out.println("상품명 : ");
			// 이름을 읽고 세팅
			product.setName(scanner.nextLine());
			
			System.out.println("가격 : ");
			// 가격을 읽고 세팅
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("재고 : ");
			// 재고를 읽고 세팅
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			// list에 Product 저장
			list.add(product);
		} catch (Exception e) {
			System.out.println("등록 에러 : " + e.getMessage());
		}
	}
	
	public void showProducts() {
		// list에 저장된 모든 Product 정보를 모니터에 출력
		for (Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() +
					"\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
}
