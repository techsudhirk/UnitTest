import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class MyClassTest2 {

	
	
	@Test
	void test() {
	MyClass obj=new MyClass();
	System.out.println("test1");
	int result=obj.sum(new int[]{3,5,6,9});
	assertEquals(22,result);
	}
	
	@Test
	void test2() {
	MyClass obj=new MyClass(); 
	int result=obj.sum(new int[]{3,5,6,20});
	assertEquals(34,result);
	System.out.println("test2");
	}
   
	@BeforeEach
	public void before()
	{
		System.out.println("before");
	}
	
	@AfterEach
	public void after()
	{
		System.out.println("after");
	}
}
