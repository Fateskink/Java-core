package Chap_02_2;

public class P02_2_Fraction {
	private int numirator;
	private int domenirator;

	public P02_2_Fraction(int numirator, int domenirator) {
		this.numirator = numirator;
		this.domenirator = domenirator;
	}

//Khởi chạy operator
	public P02_2_Fraction(P02_2_Fraction fractionA, P02_2_Fraction fractionB, String operator) {
		fractionA.normailize();
		fractionB.normailize();
		switch (operator) {
		case "+":
			this.add(fractionA, fractionB);
			break;
		case "-":
			this.sub(fractionA, fractionB);
			break;
		case "*":
		case "x":
		case "X":
		case ".":
			this.multiply(fractionA, fractionB);
			break;
		case "/":
		case ":":
			this.divide(fractionA, fractionB);
			break;
		default:
			System.out.println("Play a math - U fukin asshole");
			break;
		}
	}

//tạo phần hiển thị cho phân số
	public String print() {
		return this.getNumirator() + "/" + this.getDomenirator();
	}

// Rút gọn phân số
	private void normalize() {
	}

//Tổng 2 phân số
	private void add(P02_2_Fraction fractionA, P02_2_Fraction fractionB) {
		setNumirator(fractionA.getNumirator() * fractionB.getDomenirator()
				+ fractionB.getNumirator() * fractionA.getDomenirator());
		setDomenirator(fractionA.getDomenirator() * fractionB.getDomenirator());
		this.normailize();
	}

	// Hiệu 2 phân số
	private void sub(P02_2_Fraction fractionA, P02_2_Fraction fractionB) {
		setNumirator(fractionA.getNumirator() * fractionB.getDomenirator()
				- fractionB.getNumirator() * fractionA.getDomenirator());
		setDomenirator(fractionA.getDomenirator() * fractionB.getDomenirator());
		this.normailize();
	}

	// Tích 2 phân số
	private void multiply(P02_2_Fraction fractionA, P02_2_Fraction fractionB) {
		setNumirator(fractionA.getNumirator() * fractionB.getNumirator());
		setDomenirator(fractionA.getDomenirator() * fractionB.getDomenirator());
		this.normailize();
	}

	// Thương 2 phân số
	private void divide(P02_2_Fraction fractionA, P02_2_Fraction fractionB) {
		setNumirator(fractionA.getNumirator() * fractionB.getNumirator()
				+ fractionB.getDomenirator() * fractionA.getDomenirator());
		setDomenirator(fractionA.getDomenirator() * fractionB.getNumirator());
		this.normailize();
	}

	// UCLN
	private int UCLN(int x, int y) {
		int result = Math.min(x, y);
		while (result >= 1) {
			if (x % result == 0 && y % result == 0) {
				return result;
			}
		}
		return result--;
	}

	public boolean checkNormalize() {
		if (this.UCLN(this.getNumirator(), this.getDomenirator()) == 1) {
			return true;
		}
		return false;
	}

	//Tối giản phân số
	private void normailize() {
		int ucln = this.UCLN(this.getNumirator(), this.getDomenirator());
		if (ucln >= 1) {
			this.setNumirator(this.getNumirator() / ucln);
			this.setDomenirator(this.getDomenirator() / ucln);
		}
	}

	public int getNumirator() {
		return numirator;
	}

	public void setNumirator(int numirator) {
		this.numirator = numirator;
	}

	public int getDomenirator() {
		return domenirator;
	}

	public void setDomenirator(int domenirator) {
		this.domenirator = domenirator;
	}

}
