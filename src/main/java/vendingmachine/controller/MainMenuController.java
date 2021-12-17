package vendingmachine.controller;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.domain.Menu;
import vendingmachine.service.CatalogService;
import vendingmachine.service.exception.InputExceptionService;
import vendingmachine.view.CatalogRepositoryView;
import vendingmachine.view.MainMenuView;
import vendingmachine.view.exception.ErrorMessage;

public class MainMenuController {
	public static void mainMenuStart() {
		while (true) {
			String input = getMenuInput();
			if (input.equals(Menu.QUIT.toString())) {
				return;
			}
			navigate(input);
		}

	}

	private static void navigate(String input) {
		if (input.equals(Menu.ADD_CATALOG.toString())) {
			CatalogService.setCatalogListByInput();
		} else if (input.equals(Menu.BUY.toString())) {
			PurchaseController.purchaseCatalog();
		} else if (input.equals(Menu.ADD_MONEY.toString())) {
			UserAccountController.addUserAccountByInput();
		} else if (input.equals(Menu.SHOW_CATALOG.toString())) {
			CatalogRepositoryView.printAll();
		}
	}

	private static String getMenuInput() {
		try {
			MainMenuView.print();
			String input = Console.readLine();
			validateInput(input);
			return input;
		} catch (IllegalArgumentException e) {
			ErrorMessage.print(e.getMessage());
			return getMenuInput();
		}
	}

	private static void validateInput(String input) {
		InputExceptionService.checkEmptyString(input);
		InputExceptionService.checkRangeInMenu(input);
	}
}
