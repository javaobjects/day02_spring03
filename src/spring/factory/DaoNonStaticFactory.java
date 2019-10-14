package spring.factory;

import spring.IUserDao;
import spring.UserDaoImpl;

/**
 * 实例工厂:方法不使用static修饰
 */
public class DaoNonStaticFactory {

	public IUserDao createUserDao()
	{
		return new UserDaoImpl();
	}

}
