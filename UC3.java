package game;

public class SnakeLadderUC3 {


	// Use Function to rolling
	static void rolling() {
		int min=1;
		int max=6;
		int dieNumber = (int) Math.floor(Math.random()*(max-min)+min);
	
		System.out.println("Die = "+dieNumber);
	}
	static void playing(int check) {

		// check The condition
		switch (check) {
			case 0:
				System.out.println("They are No play");
				break;
			case 1:
				System.out.println("Ladder");
				rolling();
				break;
			case 2:
				System.out.println("Snake");
				rolling();
				break;
		
		}
	}
	public static void main(String[] args) {

		int position=0;
        int player = 1;
        System.out.println("Player in the position = "+position);

		// Generate random Numbers
		int check = (int) Math.floor((Math.random()*10) % 3 );

		// Function calling
		playing(check);
	
	}
}
