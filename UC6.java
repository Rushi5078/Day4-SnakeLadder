package game;

public class SnakeLadderUC6 {

	// Declare variables
		static int total=0;
		static int count=0;

		// Use method to rolling
		static void rolling() {
			int min=1;
			int max=6;
			int dieNumber = (int) Math.floor(Math.random()*(max-min)+min);

			System.out.println("Die = "+dieNumber);

	 		count=count+1; // Count how many times the Die was played

			if (total + dieNumber <= 100) {
				total=total+dieNumber;

			// Store Player position after every die

				System.out.println("Player in the position = "+total);
				switch (total) {
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
						System.out.println("Player in the position = "+total);
						System.out.println("Exit");
						System.out.println(count+" times the dice was played to win the game");
						break;
					case 100:
						System.out.println("Player in the position = "+total);
						System.out.println("Exit");
						System.out.println(count+" times the dice was played to win the game");
						break;

				}
			}
			    else 
			    {
				rolling();
			    }
		}

		static void playing(int check) {

		// check the player not want to play or go the die

			switch (check) {
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

			while (total < 100) {    // Loop goes until player reach 100

				int check = (int) Math.floor((Math.random() * 10) % 3);
//      function calling
				playing(check);
			}
		}

}
