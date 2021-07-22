package cuacho.version20;

import cuacho.version10.*;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;

class TestDriveCuaCho {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		DieuKhien dk = new DieuKhien();
		Timer time = new Timer();
		CuaCho cua = new CuaCho();
		dk.setCua(cua);
		System.out.println("Fido sủa để đi ra ngoài");
		Thread.sleep(1500);
		System.out.println("Todd và Gina nghe Fido sủa");
		Thread.sleep(1500);
		System.out.println("Todd và Gina nhấn nút trên Điều khiển");
		Thread.sleep(1500);
		dk.nhanNut();
		Thread.sleep(1500);
		/*
		 * System.out.println("Fido có ra ngoài không có || không"); Thread.sleep(1500);
		 * if (sc.nextLine().equals("không")) {
		 * System.out.println("Fido không ra ngoài"); Thread.sleep(1500); cua.auto(); }
		 * else {
		 */
		Thread.sleep(1500);
		System.out.println("Fido đi ra ngoài");
		Thread.sleep(1500);
		System.out.println("Fido tác nghiệp XYZ ...");
		Thread.sleep(1500);
		if (cua.isTrangThai()) {
			time.scheduleAtFixedRate(cua.task, 0, 1000);
		}
		Thread.sleep(6000);
		System.out.println("Fido sủa để vào nhà");
		Thread.sleep(1500);
		System.out.println("Todd và Gina nghe Fido sủa (lăp lại)");
		Thread.sleep(1500);
		System.out.println("Todd và Gina nhấn nút trên Điều khiển");
		Thread.sleep(1500);
		dk.nhanNut();
		Thread.sleep(1500);
		System.out.println("Fido đi vào nhà");
		Thread.sleep(1500);
		cua.auto();
	}
	// }
}