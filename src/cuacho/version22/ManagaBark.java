package cuacho.version22;

import java.util.ArrayList;

public class ManagaBark {
	ArrayList<String> dsbark;
	private String bark;
	public ManagaBark() {
		dsbark = new ArrayList<String>();
		dsbark.add("g�u g�u");
		dsbark.add("g�u g�u1");
		dsbark.add("g�u g�u2");
	}
	public String getBark() {
		return bark;
	}
	public void setBark(String bark) {
		this.bark = bark;
	}

}
