package vendingmachine.domain;

public enum Menu {
	ADD_CATALOG("1"),
	BUY("2"),
	ADD_MONEY("3"),
	SHOW_CATALOG("4"),
	QUIT("q");

	private final String menu;

	Menu(final String menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return menu;
	}
}
