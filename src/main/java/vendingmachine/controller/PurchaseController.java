package vendingmachine.controller;

import vendingmachine.domain.Catalog;
import vendingmachine.service.PurchaseService;
import vendingmachine.view.PurchaseView;
import vendingmachine.view.UserAccountView;

public class PurchaseController {
	public static void purchaseCatalog() {
		UserAccountView.printUserAccount();
		Catalog catalogToPurchase = getCatalogInput();
		catalogToPurchase.purchase();
		UserAccountView.printUserAccount();
	}

	private static Catalog getCatalogInput() {
		PurchaseView.printGuide();
		Catalog catalog = null;
		while (catalog == null) {
			catalog = PurchaseService.getValidCatalogInput();
		}
		return catalog;
	}
}
