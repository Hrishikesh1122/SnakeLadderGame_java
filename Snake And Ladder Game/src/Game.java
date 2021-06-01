import java.util.Random;
public class Game {

	public static int roll() {
		Random random=new Random();
    	int ran=1+random.nextInt(6);
    	return ran;	
	}
	public static void main(String[] args) {
		int pos =0;
		while (pos<=100)
		{
			pos=pos+roll();
			System.out.println(pos);
			if(pos>100)
				{
					pos=100;
					break;
				}
		}
	
		System.out.println(pos);

	}

}
