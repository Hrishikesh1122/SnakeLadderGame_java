import java.util.Random;
public class Game {

	public static int roll() {
		Random random=new Random();
    	int ran=1+random.nextInt(6);
    	return ran;	
	}
	public static void main(String[] args) {
		roll();
	}
}
