package backend;

public class Division extends Calculator {
	private int number1,number2;
	@Override
	public void getNumbers(int a, int b) {
		// TODO Auto-generated method stub
		super.getNumbers(a, b);
		this.number1=a;
		this.number2=b;
	}
	
	@Override
	public float operation1() {
		// TODO Auto-generated method stub
		return div();
	}
	private float div() {
		return number1/number2;
	}
}
