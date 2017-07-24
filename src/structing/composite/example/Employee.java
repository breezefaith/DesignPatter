/**
 * 
 */
package structing.composite.example;

/**
 * @author breezefaith
 *
 */
public class Employee implements ICompany {

	private String name;
	private String sex;
	private Integer age;
	
	
	public Employee(String name, String sex, Integer age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}


	/* (non-Javadoc)
	 * @see structing.composite.example.Company#getInfo()
	 */
	@Override
	public void getInfo() {
		System.out.println(name+" "+sex+" "+age);
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}

}
