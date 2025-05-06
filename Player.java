public class Player
{
	static int totalPlayers;
	String playerNames;
	public static void main(String [] args)
	{
		Player obj1=new Player();
		obj1.playerNames="John";
		totalPlayers++;
		Player obj2=new Player();
		obj2.playerNames="Alice";
		totalPlayers++;
		System.out.println("Total players"+totalPlayers);
		System.out.println("player 1 :"+obj1.playerNames);
		System.out.println("player 2 :"+obj2.playerNames);
	}
		

	}