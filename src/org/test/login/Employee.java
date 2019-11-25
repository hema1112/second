package org.test.login;

public class Employee extends PolyMorp {
	public void empId(int id) {
		// TODO Auto-generated method stub
	System.out.println("my id is " +id);
	}
	public void empName(String name) {
		System.out.println("my name is " +name);
	}
	public void empDetails(long mobile, String mail) {
		System.out.println("my mobile and mail is " +mobile+" " +mail);
	}

	public static void main(String[] args) {
		Employee e =new Employee();
		e.empId(987);
		e.empName("sharmi");
		e.empDetails(88888888l ,"priyaa@gmail.com");

	}
	}

