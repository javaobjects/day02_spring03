package spring.factory;

import spring.IUserDao;
import spring.UserDaoImpl;


/**
 * 
* <p>Title: DaoStaticFactory</p>  
* <p>
*	Description: 
* 	静态工厂:方法使用static修饰
*   
* </p> 
* @author xianxian 
* @date 2019年10月14日
 */
public class DaoStaticFactory {

	public static IUserDao createUserDao()
	{
		return new UserDaoImpl();
	}
	
}
