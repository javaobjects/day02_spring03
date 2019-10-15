package spring.factory;

import spring.IUserDao;
import spring.UserDaoImpl;

/**
 * 
* <p>Title: DaoNonStaticFactory</p>  
* <p>
*	Description: 
* 	实例工厂:方法不使用static修饰
*   
* </p> 
* @author xianxian 
* @date 2019年10月14日
 */
public class DaoNonStaticFactory {

	public IUserDao createUserDao()
	{
		return new UserDaoImpl();
	}

}
