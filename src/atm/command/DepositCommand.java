package atm.command;

import java.util.List;
import javax.inject.Inject;

import atm.command.Command;

public class DepositCommand implements Command {

    @Inject
    public DepositCommand() {}

	@Override
	public String key() {
		return "deposit";
	}

	@Override
	public Status handleInput(List<String> input) {
		if (input.size() != 1) {
			return Status.INVALID;
		}

		int sum = Integer.parseInt(input.get(0));

		System.out.println(">> Depositing some money: " + sum);

		return Status.HANDLED;
	}
}
