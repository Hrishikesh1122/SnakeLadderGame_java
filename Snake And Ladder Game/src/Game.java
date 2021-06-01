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
	
	public static void main(String[] args) {
		int pos=0;
		int diceValue=roll();
		int optionResult=options();
		switch(optionResult) {
		case IS_SNAKE:
			pos-=diceValue;
			break;
		case IS_LADDER:
			pos+=diceValue;
			break;
		case IS_NOPLAY:
			pos+=0;
			break;
		}
		System.out.println(pos);
		
	}
}
