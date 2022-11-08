package ex3_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//1. 스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex3_autowiring/applicationContext.xml");
		//2. DI - 스프링 컨테이너에서 빈을 가져오기
		MessageBean bean = (MessageBean)context.getBean("message");
		bean.sayHello();
	}

}
