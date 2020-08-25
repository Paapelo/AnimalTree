public class Cat extends Mammal {

	private String KisunNimi;

	public Cat(int Jalkojenlkm, int ika, boolean Synnyttaa, boolean OnkoPoika, String KisunNimi) {
		super(Jalkojenlkm, ika, Synnyttaa, OnkoPoika);
		this.KisunNimi = KisunNimi;
	}

	public String getKisunNimi() {
		return KisunNimi;
	}

	public void setKisunNimi(String kisunNimi) {
		KisunNimi = kisunNimi;
	}

	public void tulosta() {
		if (Jalkojenlkm <= 3) {
			System.out.println("Jalkoja pit�� olla kisulla v�hint��n 4 tai sitten jalkoja on poikki ");
		} else {
			System.out.println("Jalkoja on tarpeeksi");
		}
		System.out.println("Kisun ik� on " + ika);

		if (Synnyttaa == true) {
			System.out.println("Kisu synnytt�� V�IST�K��!! ");
		} else {
			System.out.println("Huh, kisu ei synnyt� :) ");
		}
		if (OnkoPoika == true) {
			System.out.println("Kisu on poika ");
		} else {
			System.out.println("Kisu on tytt� :) ");
		}
		System.out.println("Kisun nimi on " + KisunNimi);
	}
}
