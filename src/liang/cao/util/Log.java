package liang.cao.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Log implements InvocationHandler {
	private Object target;
	
	public Log(Object target) {
		this.target = target;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		this.beforeMethod(method);
		method.invoke(target, args);
		this.aftermethod(method);
		return null;
	}
	public void beforeMethod(Method m) {
		System.out.println(m.getName()+" strat....");
	}
	public void aftermethod(Method m) {
		System.out.println(m.getName()+" end....");
	}
}
