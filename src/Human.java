
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
		System.out.println("Ihmisen ik� on " + ika);
		if (Synnyttaa == true) {
			System.out.println("Ihminen synnytt��");
		} else {
			System.out.println("Ei synnyt�");
		}
		if (OnkoPoika == true) {
			System.out.println("Olet poika");
		} else {
			System.out.println("Olet tytt�");
		}
		System.out.println("Sukupuoli on " + SukuPuoli);
	}

}
