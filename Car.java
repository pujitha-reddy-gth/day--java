public class Car
{
	static String  companyName ="Honda";
	String  carModel ="Civic";
	public static void main(String [] args)
	{
		System.out.println("company :" +Car.companyName);
		Car obj1=new Car();
		Car obj2=new Car();
		obj2.carModel="Accord";
		System.out.println("car 1 Model :" +obj1.carModel);
		System.out.println("car 2 Model :" +obj2.carModel);
		
	}
	
}