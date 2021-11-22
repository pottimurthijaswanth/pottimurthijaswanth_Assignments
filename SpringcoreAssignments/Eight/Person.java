package Eigth;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements DisposableBean, InitializingBean {

	private String name;

	Person() {
		System.out.println("Constructor of Person Bean Have Been Invoked");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void afterPropertiesSet() throws Exception {
		

	}

	
	public void destroy() throws Exception {
		

	}

}
