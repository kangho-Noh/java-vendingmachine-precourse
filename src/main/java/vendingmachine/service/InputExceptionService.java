package vendingmachine.service;

import java.util.List;

import vendingmachine.domain.Catalog;

public class InputExceptionService {
	private static final int MONEY_MINIMUM_UNIT = 10;
	private static final String NOT_MONEY_ERROR_MESSAGE = "돈을 입력하려면 10으로 나누어 떨어지는 0 이상의 정수여야 합니다.";
	private static final String NEGATIVE_NUMBER_ERROR_MESSAGE = "0 이상의 정수여야 합니다.";
	private static final String NOT_INTEGER_ERROR_MESSAGE = "정수로 입력 받아야 할 특정 값을 정수로 변환하는 데 실패했습니다.";
	private static final String NOT_BRACED_ERROR_MESSAGE = "각 상품은 [ ] 로 감싸져야 합니다.";
	private static final String BLANK_STRING_ERROR_MESSAGE = "빈 입력이 포함되었는지 확인하십시오.";
	private static final String CATALOG_SIZE_ERROR_MESSAGE = "각 상품은 [상품명,가격,수량] 형식으로 입력되어야 하고, 각 상품은 ';' 로 구분되어야 합니다.";
	private static final int CATALOG_SIZE = 3;
	private static final String CATALOG_DUPLICATE_ERROR_MESSAGE = "중복되는 상품명이 포함되어 있습니다.";

	public static void checkZeroOrPositiveInt(int input) {
		if (input < 0) {
			throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR_MESSAGE);
		}
	}

	public static void checkModTen(int input) {
		if (input % MONEY_MINIMUM_UNIT != 0) {
			throw new IllegalArgumentException(NOT_MONEY_ERROR_MESSAGE);
		}
	}

	public static int parseToInt(String input) {
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(NOT_INTEGER_ERROR_MESSAGE);
		}
	}

	public static void checkBraced(String input) {
		if (!input.startsWith("[") || !input.endsWith("]")) {
			throw new IllegalArgumentException(NOT_BRACED_ERROR_MESSAGE);
		}
	}

	public static void checkEmptyString(String input) {
		if (input.isEmpty()) {
			throw new IllegalArgumentException(BLANK_STRING_ERROR_MESSAGE);
		}
	}

	public static void checkCatalogSize(int size) {
		if (size != CATALOG_SIZE) {
			throw new IllegalArgumentException(CATALOG_SIZE_ERROR_MESSAGE);
		}
	}

	public static void checkCatalogAlreadyExist(List<Catalog> catalogList, Catalog catalog) {
		if (catalogList.contains(catalog)) {
			throw new IllegalArgumentException(CATALOG_DUPLICATE_ERROR_MESSAGE);
		}
	}
}
