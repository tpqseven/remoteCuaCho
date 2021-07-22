package cuacho.version22;

import cuacho.version10.*;

public class BarkRecognizer {
	CuaCho cua;

	public BarkRecognizer(CuaCho cua) {
		this.cua = cua;
	}

	public void regcognize(String bark) {
		if (bark.equals("gâu gâu")) {
			System.out.println("Thiết bị nhận dạng tiếng sủa nghe thấy tiếng sủa: " + bark);
			System.out.println("Thiết bị nhận dạng tiếng sủa gửi yêu cầu mở cửa");
			cua.moCua();
		}
	}
}
