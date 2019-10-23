import java.util.LinkedList;

public enum Munze {

	ZweiEuro(200), einEuro(100), funfzigCent(50), zwanzigCent(20), zehnCent(10), funfCent(5), zweiCent(2), einCent(1);

	private int wert;

	Munze(int wert) {

		this.wert = wert;
	}

	public int getWert() {
		return wert;

	}

	public static LinkedList<Munze> getWechselgeld(int wertInCent) {

		LinkedList<Munze> wechselgeld = new LinkedList<>();

		for (int i = 0; i < values().length; i++) {

			Munze aktueleMunzen = values()[i];
			if (aktueleMunzen.getWert() <= wertInCent) {

				wechselgeld.add(aktueleMunzen);
				wertInCent = wertInCent - aktueleMunzen.getWert();
				i = -1;
			}

		}

		return wechselgeld;
	}

}
