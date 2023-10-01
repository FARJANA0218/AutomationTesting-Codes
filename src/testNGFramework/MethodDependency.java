package testNGFramework;

import org.testng.annotations.Test;

public class MethodDependency {
	@Test
	public void f1()
	{
		System.out.println("f1");
	}
	@Test
	public void f2()
	{
		System.out.println("f2");
	}
	@Test(dependsOnMethods="f4") /*its depend on the f4 method and all so excute 
	                             will be starts in aftrer depends method(f4-f5-f1-f2-f3)*/
	public void f3()
	{
		System.out.println("f3");
	}
	@Test
	public void f4()
	{
		System.out.println("f4");
	}
	@Test
	public void f5()
	{
		System.out.println("f5");
	}
	


}
