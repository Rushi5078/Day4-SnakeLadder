package game;

public class SnakeLadderUC5 {

	// Declare variables
			static int total=0;
		
	    	static int count=0;
			static final int win=100;

			//  use function  to roll the die
			static void rolling() {
				int min=1;
				int max=6;
				int dieNumber = (int) Math.floor(Math.random()*(max-min)+min);
			
				System.out.println("Die = "+dieNumber);
			

				if (total <= win)  
				{

					total=total+dieNumber; // print the player position 

					System.out.println("Player in the position = "+total);
					switch (total)
					{
						case 10:
							System.out.println("Ladder");
							total=total+10;
							System.out.println("After Ladder = "+total);
							break;
						case 20:
							System.out.println("Snake");
							total=total-5;
							System.out.println("After Snake = "+total);
							break;
						case 30:
							System.out.println("Ladder");
							total=total+10;
							System.out.println("After Ladder = "+total);
							break;
						case 40:
							System.out.println("Snake");
							total=total-5;
							System.out.println("After Snake = "+total);
							break;
						case 50:
							System.out.println("Ladder");
							total=total+10;
							System.out.println("After Ladder = "+total);
							break;
						case 60:
							System.out.println("Snake");
							total=total-5;
							System.out.println("After Snake = "+total);
							break;
						case 70:
							System.out.println("Ladder");
							total=total+10;
							System.out.println("After Ladder = "+total);
							break;
						case 80:
							System.out.println("Snake");
							total=total-5;
							System.out.println("After Snake = "+total);
							break;
						case 90:
							System.out.println("Ladder");
							total=total+10;
							System.out.println("After Ladder = "+total);
							break;
						case 100:
							System.out.println("Exit"); //in the position is 100 after exist the game
							break;
					}
				}
				   else 
				   {
					rolling();
				   }
			}

			static void playing(int check) 
			{

				switch (check) 
				{

					// check not want to play or go to die
					case 0:
						System.out.println("They are No play");
						break;
					case 1:
						rolling();
						break;
					case 2:
						rolling();
						break;
					default:
						System.out.println("Some thing went wrong");
				}
			}

			
			public static void main(String[] args) {

				int player = 1;
				int position = 0;
				System.out.println("Player Start the position = " + position);

				while (total <= win) 
				{    // loop work till player reach 100

					int check = (int) Math.floor((Math.random() * 10) % 3);

					// Function   calling
					 
					
				playing(check);
				}
			}	
		
	}
