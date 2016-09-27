package main.java.helloworld;

public class HelloWorld {
	private String message;

	public void setMessage(String message){
		this.message  = message;
	}

	public String getMessage(){
		System.out.println(this.message);
		return this.message;
	}

}
