
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
