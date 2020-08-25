
public class Teacher extends Human {

	protected String Nimi;
	protected String LuokkaTyyppi;

	public Teacher(int Jalkojenlkm, int ika, boolean Synnyttaa, boolean OnkoPoika, String SukuPuoli, String Nimi, String LuokkaTyyppi) {
		super(Jalkojenlkm, ika, Synnyttaa, OnkoPoika, SukuPuoli);
		this.Nimi = Nimi;
		this.LuokkaTyyppi = LuokkaTyyppi;
	}

	public String getNimi() {
		return Nimi;
	}

	public void setNimi(String nimi) {
		Nimi = nimi;
	}

	
	public String getLuokkaTyyppi() {
		return LuokkaTyyppi;
	}

	public void setLuokkaTyyppi(String luokkaTyyppi) {
		LuokkaTyyppi = luokkaTyyppi;
	}

	public void tulostaTeacher() {

		System.out.println("Opettajan ikä on " + ika);

		System.out.println("Opettajan nimi on " + Nimi);
		System.out.println("Opettajan luokka on " + LuokkaTyyppi);
	}

}
