
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
			p2_move = "paper";
		} else {
			System.out.print("Player 2");
			p2_move = this.uin.rock_paper_scissors();
		}
		
		int winner = this.find_winner(p1_move, p2_move);
		System.out.print(winner);
		// compare
		// Announce winner
		// add points
		// repeat

		
	}
	
	private int find_winner(String p1_move, String p2_move) {
		// return 0 if draw, 1 if player 1 wins, 2 if player 2 wins
		
		if (p1_move.equals(p2_move)) {
			//draw
			return 0;
		} else {
			
			String rock = "rock";
			String paper = "paper";
			String scissors = "scissors";
			
			switch (p1_move) {
			
			case "rock":
				if (p2_move.equals(paper)) {
					return 2;
				} else {
					return 1;
				}
				
			case "paper":
				if (p2_move.equals(scissors)) {
					return 2;
				} else {
					return 1;
				}
				
			case "scissors":
				if (p2_move.equals(rock)) {
					return 2;
				} else {
					return 1;
				}
				
			default:
				assert (1 == 2);
				return 0;
			}
		}
	}
	


	private void greetings() {
		System.out.println("Welcome to Rock Paper Scissors by Anthony Asp!");
	}
}
