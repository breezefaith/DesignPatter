package structing.composite.example;

public class Test {

	public static void main(String[] args) {
		ConcreteCompany company=new ConcreteCompany("Kidswant", "unknown");
		
		Employee e1=new Employee("e1", "male", 16),
				e2=new Employee("e2", "female", 23),
				e3=new Employee("e3", "female", 25);
		
		ConcreteCompany childCompany=new ConcreteCompany("KidswantChild", "unknown");
		company.add(e3);
		
		childCompany.add(e1);
		childCompany.add(e2);
		company.add(childCompany);
		
		company.getInfo();
		company.display();
		
	}

}
