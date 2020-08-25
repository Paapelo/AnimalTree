
public abstract class Animal {

	protected int Jalkojenlkm;
	protected int ika;
	protected boolean Synnyttaa;

	public Animal(int Jalkojenlkm, int ika, boolean Synnyttaa) {

		this.Jalkojenlkm = Jalkojenlkm;
		this.ika = ika;
		this.Synnyttaa = Synnyttaa;
	}

	public boolean getSynnyttaa() {
		return Synnyttaa;
	}

	public void setSynnyttaa(boolean Synnyttaa) {
		this.Synnyttaa = Synnyttaa;
	}

	public int getIka() {
		return ika;
	}

	public int getJalkojenlkm() {
		return Jalkojenlkm;
	}

	public void setJalkojenlkm(int Jalkojenlkm) {
		this.Jalkojenlkm = Jalkojenlkm;
	}

	public void setAge(int ika) {
		this.ika = ika;
	}

}
