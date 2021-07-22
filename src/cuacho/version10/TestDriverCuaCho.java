package cuacho.version10;

public class TestDriverCuaCho {
	public static void main(String[] args) throws InterruptedException {
		CuaCho cua = new CuaCho();
		DieuKhien dk = new DieuKhien();
		dk.setCua(cua);
		System.out.println("Fido sủa để đi ra ngoài");
		System.out.println("Todd và Gina nghe Fido sủa");
		System.out.println("Todd và Gina nhấn nút trên Điều khiển");
		dk.nhanNut();
		System.out.println("Fido đi ra ngoài");
		dk.nhanNut();
		System.out.println("Sau khi đi  WC xong, Fido sủa gâu gâu");
		System.out.println("Todd và Gina nghe Fido sủa");
		System.out.println("Todd và Gina nhấn nút trên Điều khiển");
		dk.nhanNut();
		System.out.println("Fido đi vào nhà");
		dk.nhanNut();
	}
}
