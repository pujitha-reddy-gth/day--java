public class Config 
{
	static String  configName="System Config";
	String settingValue;
	public static void main(String [] args)
	{
		System.out.println("Config Name :"+configName);
		Config obj1=new Config();
		obj1.settingValue="Dark Mode";
		System.out.println("Setting 1 :"+obj1.settingValue);
		obj1.settingValue="Light Mode";
		System.out.println("Setting 2 :"+obj1.settingValue);

	}
		

	}