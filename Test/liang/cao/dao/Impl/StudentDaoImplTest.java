package liang.cao.dao.Impl;

import java.lang.reflect.Proxy;

import liang.cao.dao.StudentDao;
import liang.cao.module.Student;
import liang.cao.util.Log;

import org.junit.Test;

public class StudentDaoImplTest {

	@Test
	public void testSave() {
		StudentDao sd = new StudentDaoImpl();
		Log log = new Log(sd);

//		StudentDao sdproxy = (StudentDao)Proxy.newProxyInstance(sd.getClass().getClassLoader(), sd.getClass().getInterfaces(), log);
		StudentDao sdproxy = (StudentDao)Proxy.newProxyInstance(
								sd.getClass().getClassLoader(), 
								new Class[]{StudentDao.class}, 
								log);
		sdproxy.save(new Student());
	}

}
