
public class Mammal extends Animal {

	protected boolean OnkoPoika;

	public Mammal(int Jalkojenlkm, int ika, boolean Synnyttaa, boolean onkoPoika) {
		super(Jalkojenlkm, ika, Synnyttaa);
		OnkoPoika = onkoPoika;
	}

	public boolean getOnkoPoika() {
		return OnkoPoika;
	}

	public void setOnkoPoika(boolean onkoPoika) {
		OnkoPoika = onkoPoika;
	}
}
