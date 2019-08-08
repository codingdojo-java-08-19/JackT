package notjava;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator x = new Calculator();
		x.setOperandOne(23.04);
		x.setOperandTwo(3.95);
		x.setOperator("+");
		x.performOperation();
		System.out.println(x.getResults());
		x.setOperator("-");
		x.performOperation();
		System.out.println(x.getResults());
		
	}

}
