public class Department
{
	static String departmentName="HR";
	String employeeName;
	public static void main(String [] args)
	{
		Department obj1=new Department();
		Department obj2=new Department();
		obj1.employeeName="John";
		obj2.employeeName="Alice";
		System.out.println("Department:"+departmentName);
		System.out.println("Employee 1 :"+obj1.employeeName);
		System.out.println("Employee 2 :"+obj2.employeeName);
		System.out.println("After Modification:");
		departmentName="Marketing";
		System.out.println("Department:"+departmentName);
		System.out.println("Employee 1 :"+obj1.employeeName);
		System.out.println("Employee 2 :"+obj2.employeeName);


	}
}