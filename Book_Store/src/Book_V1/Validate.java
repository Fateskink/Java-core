package Book_V1;

public class Validate {
	private StringBuilder error = new StringBuilder();

	public void getError() {
		System.out.println(this.error);
	}

	public void setError(String error) {
		this.error.append(error).append("\n");
	}

	public boolean checkName(String value) {
		boolean flag = value.matches("[A-z\\.\\s!]{2,100}");
		if (flag == false) {
			this.setError("Tên phải có dạng [A-z\\.\\s!]{2,100}");
		}
		return flag;
	}

	public boolean checkId(String value) {
		boolean flag = value.matches("[A-z]{3}-[2-8]{3}");
		if (flag == false) {
			this.setError("Id phải có dạng (abc-123)");
		}
		return flag;
	}

	public boolean checkPrice(double value) {
		boolean flag = (value > 0) && (value < 100);
		if (flag == false) {
			this.setError("Giá tiền phải từ 0 đến 100$");
		}
		return flag;
	}
}
