package test.java.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.helloworld.HelloWorld;

import static org.hamcrest.CoreMatchers.containsString;

public class HelloWorldTest {

	private HelloWorld greeter = new HelloWorld();

	@Test
	public void greeterSaysHello() {
		greeter.setMessage("test123");
		assertThat(greeter.getMessage(), containsString("test123"));
	}

}
