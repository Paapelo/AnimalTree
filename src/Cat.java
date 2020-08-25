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
			System.out.println("Jalkoja pitää olla kisulla vähintään 4 tai sitten jalkoja on poikki ");
		} else {
			System.out.println("Jalkoja on tarpeeksi");
		}
		System.out.println("Kisun ikä on " + ika);

		if (Synnyttaa == true) {
			System.out.println("Kisu synnyttää VÄISTÄKÄÄ!! ");
		} else {
			System.out.println("Huh, kisu ei synnytä :) ");
		}
		if (OnkoPoika == true) {
			System.out.println("Kisu on poika ");
		} else {
			System.out.println("Kisu on tyttö :) ");
		}
		System.out.println("Kisun nimi on " + KisunNimi);
	}
}
