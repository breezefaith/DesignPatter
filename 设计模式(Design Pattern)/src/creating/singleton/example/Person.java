package creating.singleton.example;

public class Person {
	private static Person person=new Person();
	private int num=0;
	private Person(){
		
	}
	public static Person getInstance(){
		return person;
	}
	public synchronized String getAnswer(){
		return "这是第"+ ++num +"个快递";
	}
}
