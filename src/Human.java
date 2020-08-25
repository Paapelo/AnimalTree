
public class Human extends Mammal {

	protected String SukuPuoli;

	public Human(int Jalkojenlkm, int ika, boolean Synnyttaa, boolean OnkoPoika, String SukuPuoli) {
		super(Jalkojenlkm, ika, Synnyttaa, OnkoPoika);
		this.SukuPuoli = SukuPuoli;

	}

	public String isSukuPuoli() {
		return SukuPuoli;
	}

	public void setSukuPuoli(String sukuPuoli) {
		SukuPuoli = sukuPuoli;
	}

	public void tulostaHuman() {
		System.out.println("Jalkoja on " + Jalkojenlkm);
		System.out.println("Ihmisen ikä on " + ika);
		if (Synnyttaa == true) {
			System.out.println("Ihminen synnyttää");
		} else {
			System.out.println("Ei synnytä");
		}
		if (OnkoPoika == true) {
			System.out.println("Olet poika");
		} else {
			System.out.println("Olet tyttö");
		}
		System.out.println("Sukupuoli on " + SukuPuoli);
	}

}
