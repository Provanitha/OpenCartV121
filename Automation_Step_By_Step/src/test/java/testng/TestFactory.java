package testng;

import org.testng.annotations.Factory;

public class TestFactory {
	@Factory
	public Object[] factoryMethod() {
		return new Object[] {
				new FactoryA("param1"),
				new FactoryA("param2"),
				new FactoryA("param3")
				
		};
		
	}

}
