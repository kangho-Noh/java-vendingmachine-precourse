package vendingmachine.service;

import static vendingmachine.service.exception.InputExceptionService.*;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.view.exception.ErrorMessage;

public class UserAccountService {

	public static int setUserAccount() {
		try {
			String input = Console.readLine();
			checkEmptyString(input);
			int userAccount = parseToInt(input);
			checkModTen(userAccount);
			checkZeroOrPositiveInt(userAccount);
			return userAccount;
		} catch (IllegalArgumentException e) {
			ErrorMessage.print(e.getMessage());
			return setUserAccount();
		}
	}
}
