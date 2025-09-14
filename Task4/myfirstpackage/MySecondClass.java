package myfirstpackage;

public class MySecondClass {
	private int p1, p2;
	
	public int getp1() {
		return p1;
	}
	public void setp1(int p1) {
		this.p1 = p1;
	}
	public int getp2() {
		return p2;
	}
	public void setp2(int p2) {
		this.p2 = p2;
	}

	public MySecondClass(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public int add() {
		return p1 + p2;
	}
}