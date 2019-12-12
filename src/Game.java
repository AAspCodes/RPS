
public class Game {
	UserInput uin;
	boolean gamestyle;
	int player_1_score;
	int player_2_score;
	ComputerPlayer comp;

	public Game() {
		uin = new UserInput();
		player_1_score = 0;
		player_2_score = 0;
	}

	public void begin() {
		this.greetings();
		gamestyle = uin.computer_or_player();
		if (this.gamestyle) {
			comp = new ComputerPlayer();
		}

		while (true) {
			this.gameloop();
			if (!(uin.playAgain())) {
				break;
			}
		}
	}

	private void gameloop() {
		System.out.print("Player 1");
		String p1_move = this.uin.rock_paper_scissors();
		String p2_move;

		if (this.gamestyle) {
			p2_move = this.comp.getRandomMove();
		} else {
			System.out.print("Player 2");
			p2_move = this.uin.rock_paper_scissors();
		}

		this.explain_moves(p1_move, p2_move);
		int winner = this.find_winner(p1_move, p2_move);
		this.handle_outcome(winner);
		this.tell_points();
	}

	private void tell_points() {
		System.out.println("Player 1 has " + this.player_1_score + " Points!");
		if (this.gamestyle) {
			System.out.print("The Computer has ");
		} else {
			System.out.print("Player 2 has ");
		}
		System.out.println(this.player_2_score + " Points!");
	}

	private void handle_outcome(int winner) {
		switch (winner) {
		case 0:
			// draw
			System.out.println("It's a Draw!");
			break;
		case 1:
			// p1 win
			System.out.println("Player 1 Wins!");
			this.player_1_score += 1;
			break;
		case 2:
			// p2 win
			System.out.println("Player 2 Wins!");
			this.player_2_score += 1;
			break;
		}
	}

	private void explain_moves(String p1_move, String p2_move) {
		System.out.println("Player 1 played " + p1_move);
		if (this.gamestyle) {
			System.out.println("The Computer played " + p2_move);
		} else {
			System.out.println("Player 2 played " + p2_move);
		}
	}

	private int find_winner(String p1_move, String p2_move) {
		// return 0 if draw, 1 if player 1 wins, 2 if player 2 wins

		if (p1_move.equals(p2_move)) {
			// draw
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
		System.out.println("Welcome to Rock Paper Scissors by Anthony Asp! Completed December 12th 2019");
	}
}
