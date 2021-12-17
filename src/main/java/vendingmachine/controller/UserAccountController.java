package vendingmachine.controller;

import vendingmachine.repository.UserAccount;
import vendingmachine.service.UserAccountService;
import vendingmachine.view.UserAccountView;

public class UserAccountController {
	public static void addUserAccountByInput() {
		UserAccountView.printInputGuide();
		int input = UserAccountService.setUserAccount();
		UserAccount.addUserAccount(input);
		UserAccountView.printUserAccount();
	}
}
