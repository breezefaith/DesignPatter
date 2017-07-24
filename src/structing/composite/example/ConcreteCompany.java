/**
 * 
 */
package structing.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author breezefaith
 *
 */
public class ConcreteCompany implements ICompany {

	private List<ICompany> employees=new ArrayList<>();
	private String name;
	private String ceo;
	public ConcreteCompany(String name, String ceo) {
		super();
		this.name = name;
		this.ceo = ceo;
	}

	public void add(ICompany c) {
		employees.add(c);
	}

	public void remove(ICompany c) {
		employees.remove(c);
	}

	public List<ICompany> getChild(){
		return employees;
	}

	public void display() {
		for(ICompany c:employees) {
			if(c instanceof Employee) {
				c.getInfo();
			}else {
				c.getInfo();
				((ConcreteCompany)c).display();
			}
		}
	}
	/* (non-Javadoc)
	 * @see structing.composite.example.Company#getInfo()
	 */
	@Override
	public void getInfo() {
		System.out.println(name+" "+ceo);
	}
	@Override
	public String toString() {
		return "ConcreteCompany [employees=" + employees + ", name=" + name + ", ceo=" + ceo + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}


}
