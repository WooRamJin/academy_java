package ch11;

//다형성
//자동타입변환(Promotion) : 자손타입->조상타입(Up-casting) : 형변환생략가능
//실행메소드


class A{}


class B extends A{} //자손타입B -> 조상타입A
class C extends A{}	//자손타입C -> 조상타입A

class D extends B{}	//자손타입D -> 조상타입B
class E extends C{}	//자손타입E -> 조상타입C

public class PromotionEx {

	public static void main(String[] args) {

		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
		//부모타입으로 자동타입변환되었다
		//자동타입변환 된 이후에는 부모클래스에 선언된 필드, 메소드만 접근가능하다.
		//변수가 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정된다.
		//예외적으로 자식클래스에서 메소드가 오버라이딩 되었다면
		//자식클래스의 메소드가 (부모클래스에 선언된 메소드 대신에) 호출된다 => Child01, Parent01 참고
		A	a1=b; //b 객체는 A부모 타입으로 자동타입변환
		A	a2=c; //o 좌측이 부모 우측이 자식
		A	a3=d; //o
		A	a4=e; //o
		
		B b1 = d; //d객체는 B부모타입으로 자동타입변환
		C c2 = e; //
		
		//B b2 = e; //x 상속관계가 아니라 컴파일 에러 발생
		//C c2 = d; //x
	}

}
