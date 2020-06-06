import java.io.*;
import java.util.*;
public class Wraper3 
{
	public static void main(String[] args) 
	{
		Employers emp = new Employers("Dark Lord");
		Employers empClone = emp.clone();
		empClone.setName("Anonymous User");
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}
class Employers implements Cloneable {
	private String name;
	
	public Employers(String name) {
		this.name = name;
	}
	
//	public Employers(Employers emp) {
//		this.name = emp.name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Employers clone() {
		try {
			return (Employers) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

