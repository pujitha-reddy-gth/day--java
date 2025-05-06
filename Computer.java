public class Computer
{
	static String os="windows";
	int ram;
	public static void main(String [] args)
	{
		System.out.println("OS : "+Computer.os);
		Computer obj1=new Computer();
		Computer obj2=new Computer();
		obj1.ram=8;
		obj2.ram=16;
		System.out.println("computer 1 RAM : "+obj1.ram +"GB");
		System.out.println("computer 2 RAM : "+obj2.ram +"GB");

	}
	
}