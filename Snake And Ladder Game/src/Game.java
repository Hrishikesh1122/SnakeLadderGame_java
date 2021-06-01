import java.util.Random;
public class Game {
	static final int IS_SNAKE=1;
	static final int IS_LADDER=2;
	static final int IS_NOPLAY=3;
	public static int roll() {
		Random random=new Random();
    	int ran=1+random.nextInt(6);
    	return ran;	
	}
	
	public static int options() {
		Random random=new Random();
    	int opt=1+random.nextInt(3);
    	return opt;	
	}
	public static void start() {
		int posPlayer1=0,posPlayer2=0;
		int diceCountPlayer1=0,diceCountPlayer2=0;
		int diceValue=0;
		int chance=-1;
		while (true)
		{
			diceValue = roll();
            if (chance == -1)
            {
                diceCountPlayer1++;
                posPlayer1= positionCount(posPlayer1, diceValue);
                System.out.println("Position of player 1 :"+posPlayer1);
                if (posPlayer1 == 100)
                {
                    System.out.println("Player 1 wins");
                    System.out.println("Player one rolled dice "+diceCountPlayer1 +" Times");
                    break;
                }
            }
            else
            {
            	 diceCountPlayer2++;
                 posPlayer2= positionCount(posPlayer2, diceValue);
                 System.out.println("Position of player 2 :"+posPlayer2);
                 if (posPlayer2 == 100)
                 {
                     System.out.println("Player 2 wins");
                     System.out.println("Player two rolled dice "+diceCountPlayer2 +" Times");
                     break;
                 }
                
            }
            chance = -(chance);
		}
	}
	public static int positionCount(int pos,int diceValue) {
		 int check;
        int optionResult=options();
		switch(optionResult) {
		case IS_SNAKE:
			pos-=diceValue;
			break;
		case IS_LADDER:
			pos+=diceValue;
			System.out.println("Ladder, rolling again");
			diceValue=roll();
			check=options();
			if(check==IS_SNAKE)
			{
				pos-=diceValue;
			}
			if(check==IS_LADDER)
			{
				pos+=diceValue;
			}
			if(check==IS_NOPLAY)
			{
				pos+=0;
			}
			break;
		case IS_NOPLAY:
			pos+=0;
			break;
		}
		if(pos<0)
		{
			pos=0;
		} 
		
			
    	if (pos > 100)
		{
			pos-=diceValue;		
		}
    	return pos;
	}
   
	
	public static void main(String[] args) {
		start();
	}
}
