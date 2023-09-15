package Ch10.sec01.exam05;
// ClassCastExceptionExample
public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		// if (animal instanceof Dog) {
				Dog dog = (Dog) animal;
		//}
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
// 타입 변환은 상위하위 클래스 간에 구현 클래스와 인터페이스 간에도 발생
// 이러한 관계가 아니라면 클래스는 다른 타입으로 변활할 수 없기 때문에 발생
// 대입된 객체가 아닌 다른 클래스 타입으로 타입 변환하면 발생
// 타입 변환 전에 변환이 가능한지 instanceof 연산자로 확인하는 것이 좋음