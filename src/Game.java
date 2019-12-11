
public class Game {
	UserInput uin;
	boolean gamestyle;
	int player_1_score;
	int player_2_score;
	
	public Game() {
		uin = new UserInput();
	}
	
	public void begin() {
		this.greetings();
		gamestyle = uin.computer_or_player();
		
		while (true) {
			this.gameloop();
		}
		
	}
	
	
	private void gameloop() {
		
		System.out.print("Player 1");
		String p1_move = this.uin.rock_paper_scissors();
		
		String p2_move;
		if (this.gamestyle) {
			//p2_move = get_random_move();
		} else {
			System.out.print("Player 2");
			p2_move = this.uin.rock_paper_scissors();
		}
		
		
		// compare
		// Announce winner
		// add points
		// repeat

		
	}
	
	private int find_winner(int p1_move, int p2_move) {
		
		
		if (p1_move == p2_move) {
			//draw
			return 0;
		} else {
			
			switch (p1_move) {
			case 0:
				//p1 has rock
				if (p2_move == 1) {
					// p2 has
					return 2;
				} else {
					return 1;
				}
			case 1:
				//p1 has paper
			case 2:
				//p1 has scissors
				
			default:
				assert (1 == 2);
			}
			
			
			
			
			
			
			
			
		}
	}
	


	private void greetings() {
		System.out.println("Welcome to Rock Paper Scissors by Anthony Asp!");
	}
}
