package vendingmachine.repository;

import java.util.ArrayList;
import java.util.List;

import vendingmachine.domain.Catalog;

public class CatalogRepository {
	private static final List<Catalog> catalogList = new ArrayList<>();

	public static void join(Catalog catalog) {
		catalogList.add(catalog);
	}

	public static Catalog getCatalogByName(String catalogName) {
		Catalog temporaryCatalog = new Catalog(catalogName, 0, 0);
		for (Catalog catalog : catalogList) {
			if (catalog.equals(temporaryCatalog)) {
				return catalog;
			}
		}
		return null;
	}

	public static boolean contains(Catalog catalog) {
		return catalogList.contains(catalog);
	}

	public static List<Catalog> getCatalogList() {
		return catalogList;
	}
}
