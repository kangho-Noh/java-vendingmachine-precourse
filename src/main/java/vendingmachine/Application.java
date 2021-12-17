package vendingmachine;

import vendingmachine.controller.CatalogController;
import vendingmachine.controller.ChangeController;
import vendingmachine.controller.MainMenuController;
import vendingmachine.controller.UserAccountController;
import vendingmachine.controller.VendingMachineAccountController;

public class Application {

	public static void main(String[] args) {
		// TODO: 프로그램 구현
		initApplication();
		startMainLogic();
		endApplication();
	}

	private static void startMainLogic() {
		MainMenuController.mainMenuStart();
	}

	private static void endApplication() {
		ChangeController.setChange();
		ChangeController.printChange();
	}

	private static void initApplication() {
		VendingMachineAccountController.setVendingMachineAccount();
		CatalogController.setCatalogListInput();
		UserAccountController.addUserAccountByInput();
	}
}
