package org.test.login;

public class PolyMorp {
public void empId(int id) {
	// TODO Auto-generated method stub
System.out.println("my id is"+id);
}
public void empName(String name) {
	System.out.println("my name is" +name);
}
public void empDetails(long mobile, String mail) {
	System.out.println("my mobile and mail is " +mobile+" " +mail);

}
public static void main(String[] args) {
	PolyMorp p =new PolyMorp();
	p.empId(123);
p.empName("priya");
p.empDetails(999999999l ,"abc@gmail.com");
}
}