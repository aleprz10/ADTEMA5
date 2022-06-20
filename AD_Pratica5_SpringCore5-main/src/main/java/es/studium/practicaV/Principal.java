package es.studium.practicaV;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Principal {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		Casa casa = appContext.getBean("casa", Casa.class);
		
		System.out.println(casa.toString());
		
		((ConfigurableApplicationContext) appContext).close();	
		}

}
