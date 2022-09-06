package model;

public class Test {

	public static void main(String[] args) {
		Employee employee1 = new Employee("E01","EC01","kasuni","978301070V","Udawalawa");
		Employee employee2 = new Employee("E02","EC02","kasun","968301076V","Matale");
		
		boolean res1 = employee1.equals(employee2);
		System.out.println("EMP1 equals EMP2 :" + res1);
		
		System.out.println("##################");
		
		employee2.setEmpId("E01");
		employee2.setEmpId("EC01");
		boolean res2 = employee1.equals(employee2);
		System.out.println("EMP1 equals EMP2 : "+ res2);
		
	}

}
