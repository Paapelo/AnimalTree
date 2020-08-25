
public class Student extends Human {

	protected int OpintoPisteet;
	protected String OpiskelijanNimi;

	public Student(int Jalkojenlkm, int ika, boolean Synnyttaa, boolean OnkoPoika, String SukuPuoli, int OpintoPisteet,
			String OpiskelijanNimi) {
		super(Jalkojenlkm, ika, Synnyttaa, OnkoPoika, SukuPuoli);
		this.OpintoPisteet = OpintoPisteet;
		this.OpiskelijanNimi = OpiskelijanNimi;
	}

	public int getOpintoPisteet() {
		return OpintoPisteet;
	}

	public void setOpintoPisteet(int opintoPisteet) {
		OpintoPisteet = opintoPisteet;
	}

	public String getOpiskelijanNimi() {
		return OpiskelijanNimi;
	}

	public void setOpiskelijanNimi(String opiskelijanNimi) {
		OpiskelijanNimi = opiskelijanNimi;
	}

	public void tulostaStudent() {

		System.out.println("Sukupuoli on " + SukuPuoli);
		System.out.println("Opintopisteesi on " + OpintoPisteet);
		System.out.println("Opiskelija nimi on " + OpiskelijanNimi);
	}
}
