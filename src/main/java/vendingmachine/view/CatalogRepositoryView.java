package vendingmachine.view;

import java.util.List;

import vendingmachine.domain.Catalog;
import vendingmachine.repository.CatalogRepository;

public class CatalogRepositoryView {

	public static void printAll() {
		List<Catalog> catalogList = CatalogRepository.getCatalogList();
		for (Catalog catalog : catalogList) {
			System.out.println("catalog = " + catalog.toString());
		}
	}
}
