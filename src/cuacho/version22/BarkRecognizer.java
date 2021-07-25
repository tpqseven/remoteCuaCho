package cuacho.version22;

import cuacho.version10.*;

public class BarkRecognizer {
	ManagaBark managaBark = new ManagaBark();
	CuaCho cua;

	public BarkRecognizer(CuaCho cua) {
		this.cua = cua;
	}

	public void regcognize(String bark) {
		for (int i = 0; i < managaBark.dsbark.size(); i++) {
			if (bark.equals(managaBark.dsbark.get(i))) {
				System.out.println("Thiết bị nhận dạng tiếng sủa nghe thấy tiếng sủa: " + bark);
				System.out.println("Thiết bị nhận dạng tiếng sủa gửi yêu cầu mở cửa");
				cua.moCua();
			}
		}
	}
}
