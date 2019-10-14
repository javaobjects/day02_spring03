package spring.factory;

import spring.IUserDao;
import spring.UserDaoImpl;

/**
 * 静态工厂:方法使用static修饰
 */
public class DaoStaticFactory {

	public static IUserDao createUserDao()
	{
		return new UserDaoImpl();
	}
	
}
