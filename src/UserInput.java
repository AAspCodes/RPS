import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInput {
	Scanner scanner;

	public UserInput() {
		this.scanner = new Scanner(System.in);

	}

	public boolean computer_or_player() {

		String answer = this
				.string_choice(new String[] { "Do you want to play against Computer or a Person? c/p", "c", "p" });

		if (answer.equals(new String("p"))) {
			return false;

		} else {
			return true;
		}
	}

	public String rock_paper_scissors() {
		String answer = this.string_choice(new String[] { " Rock, Paper or Scissors? r/p/s", "r", "p", "s" });
		// TODO convert if tree to switch case
		if (answer.equals(new String("r"))) {
			return "rock";

		} else if (answer.equals(new String("p"))) {
			return "paper";

		} else {
			return "scissors";
		}
	}

	public String string_choice(String[] args) {
		// prompt, option1, option2, option3...
		String prompt = args[0];
		String[] options = Arrays.copyOfRange(args, 1, args.length);
		List<String> valid_options = Arrays.asList(options);

		String answer = "";

		while (true) {
			System.out.println(prompt);
			answer = this.scanner.nextLine();

			if (!(valid_options.contains(answer))) {
				System.out.println("Unusable answer, try again.");
			} else {
				break;
			}
		}
		return answer;
	}
}
