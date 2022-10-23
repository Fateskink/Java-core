package Chap_02_1;

public class P_03_Fraction {
	private int numenator;
	private int doneminator;

	public P_03_Fraction(int numenator, int doneminator) {
		this.numenator = numenator;
		this.doneminator = doneminator;
	}

	public P_03_Fraction(P_03_Fraction FractionA, P_03_Fraction FractionB, String operator) {
	}

	// tạo phần hiển thị cho phân số
	// phân số 2/4
	public String print() {
		return this.getNumenator() + "/" + this.getDoneminator();
	}

	// rút g�?n phân số
	private void nomalize() {
	}

	// tổng 2 phân số x/y + a/b = (x*b+y*a)/(y*b)
	private void add(P_03_Fraction FractionA, P_03_Fraction FractionB) {
	}

	// hiệu 2 phân số x/y + a/b = (x*b+y*a)/(y*b)
	private void sub(P_03_Fraction FractionA, P_03_Fraction FractionB) {
	}

	// tích 2 phân số
	private void mutiply(P_03_Fraction FractionA, P_03_Fraction FractionB) {
	}

	// thương 2 phân số
	private void divide(P_03_Fraction FractionA, P_03_Fraction FractionB) {
	}

	// tìm UCLN
	private int UCLN(int x, int y) {
		int result = Math.min(x, y);
		while (result >= 1) {
			if (x % result == 0 && y % result == 0) {
				return result;
			}
			result--;
		}
		return result;
	}

	public boolean checkNomalize() {
		if (this.UCLN(this.getNumenator(), this.getDoneminator()) == 1)
			return true;
		return false;
	}

	// tối giản phân số
	public void normalize() {
		int ucln = this.UCLN(this.getNumenator(), this.getDoneminator());
		if (ucln>1) {
			this.setNumenator(this.getNumenator() / ucln);
			this.setDoneminator(this.getDoneminator() / ucln);
		}
	}
	public int getNumenator() {
		return numenator;
	}

	public void setNumenator(int numenator) {
		this.numenator = numenator;
	}

	public int getDoneminator() {
		return doneminator;
	}

	public void setDoneminator(int doneminator) {
		this.doneminator = doneminator;
	} 
}
