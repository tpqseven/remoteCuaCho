package cuacho.version22;

import java.util.ArrayList;

public class ManagaBark {
	ArrayList<String> dsbark;
	private String bark;
	public ManagaBark() {
		dsbark = new ArrayList<String>();
		dsbark.add("gâu gâu");
		dsbark.add("gâu gâu1");
		dsbark.add("gâu gâu2");
	}
	public String getBark() {
		return bark;
	}
	public void setBark(String bark) {
		this.bark = bark;
	}

}
