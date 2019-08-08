package notjava;

public class Calculator implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double operandOne;
	private double operandTwo;
	private String operator;
	private double result;
	
	public Calculator() {
	}
	public void performOperation() {
		if(operator == "+") {
			result = operandOne + operandTwo;
		}
		else {
			result = operandOne - operandTwo;
		}
	}
	public void setOperandOne(double x) {
		this.operandOne = x;
	}
	public void setOperandTwo(double x) {
		this.operandTwo =x;
	}
	public void setOperator(String x) {
		this.operator = x;
	}
	public double getResults() {
		return result;
	}

}
