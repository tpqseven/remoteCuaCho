package cuacho.version10;

import java.util.Scanner;

public class DieuKhien {
	private CuaCho cua;
	Scanner sc = new Scanner(System.in);

	public void nhanNut() throws InterruptedException {
		System.out.println("Nhấn nút");
		Thread.sleep(1000);
		if (cua.isTrangThai()) {
			cua.dongCua();
		} else {
			cua.moCua();

		}
	}

	public CuaCho getCua() {
		return cua;
	}

	public void setCua(CuaCho cua) {
		this.cua = cua;
	}

}
