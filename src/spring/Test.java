package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){

		//1.加载并且解析applicationContext.xml
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.获取工厂中的IUserDao对象了
		IUserDao userDao = (IUserDao)factory.getBean("userDao"); 
		IUserDao userDao2 = (IUserDao)factory.getBean("userDao2"); 
		IUserDao userDao3 = (IUserDao)factory.getBean("userDao3"); 
		
		//3.调用方法
		//userDao.selectUser();
		//userDao2.selectUser();
		userDao3.selectUser();
		
		//4.销毁对象
		factory.close();
	}

}
