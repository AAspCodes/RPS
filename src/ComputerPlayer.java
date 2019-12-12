import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerPlayer {
	List<String> moves;
	Random rand;

	public ComputerPlayer() {
		moves = Arrays.asList("rock", "paper", "scissors");
		rand = new Random();
	}

	public String getRandomMove() {
		String randomMove = this.moves.get(this.rand.nextInt(this.moves.size()));
		return randomMove;
	}

}
