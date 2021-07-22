package cuacho.version10;

import java.util.TimerTask;

public class CuaCho {

	private boolean trangThai;

	public CuaCho() {
		super();
		this.trangThai = false;
	}

	public void dongCua() {
		System.out.println("Cửa chó đóng");
		this.trangThai = false;
	}

	public void moCua() {
		System.out.println("Cửa chó mở");
		this.trangThai = true;

	}

	public boolean isTrangThai() {

		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {

		this.trangThai = trangThai;

	}

	public TimerTask task = new TimerTask() {

		int dem = 5;

		public void run() {
			if (dem > 0) {
				System.out.println(dem + "s");
				dem--;
			} else {
				trangThai = false;
				System.out.println("Cửa đã tự động đóng");
				task.cancel();
			}
		}
	};

	public void auto() {
		if (this.trangThai) {
			for (int i = 5; i > 0; i--) {
				System.out.println(i + "s");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
			this.trangThai = false;

			System.out.println("Cửa đã tự động đóng");
		}
	}
}
