package ex2_annotation;

import org.springframework.stereotype.Component;

//@는 뭐다? 포스트잇이다.
@Component
public class MemberBean {
		
	private String name = "김거니";
	private int age = 27;
	private String message = "0 30 <( 쫍 )";
	//---------------------------
	public void output() {
		System.out.println(name+"["+age+"]"+message);
	}
	
	//constructor 인자 없는 생성자 함수 꼭!꼭! 만들기
//	public MemberBean() {
//		System.out.println("기본 생성자");
//	}
	
//	public MemberBean(String name, int age, String message) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.message = message;
//		System.out.println("인자 있는 생성자");
//	}
//
//	//setter, getter
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//
//	public String getMessage() {
//		return message;
//	}


//	public void setMessage(String message) {
//		this.message = message;
//	}
	
	
	
	

}