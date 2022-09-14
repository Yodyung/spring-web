package Chapter09.EX04;

class B{
	int m=3;		//인스턴스 필드 : 객체마다 다르게 적용, heap 영역에 변수와 값이 저장됨 
	static int n=5;	//정적 필드 : 모든 객체에서 공통으로 적용, 클래스 영역에 변수와 값이 저장
	
}

public class Test_B {

	public static void main(String[] args) {
		// 객체 생성
		B b1=new B();
		B b2=new B();

		//인스턴스 필드의 값 변경 (객체 내부에 저장되어 있어 각각 적용되어 있다.)
		b1.m=5;		//둘 다 각각 변경되는걸 확인할 수 있음.
		b2.m=6;
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		
		//정적 필드 값 수정 : 모든 객체에서 공유해서 사용하는 필드
		b1.n=7;
		b2.n=777;
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		
		//정적 필드 수정 : 객체 없이 클래스 명으로 수정
		B.n=9;
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		
	}

}
