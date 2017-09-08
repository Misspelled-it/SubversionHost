package taxes;

public class TaxNotEligibleException extends Exception{

	/**
	 * fires if the employee makes less than 10000 annually
	 */
	private static final long serialVersionUID = 1L;
	public TaxNotEligibleException() {
		super("The employee does not need to pay tax");
	}
}
