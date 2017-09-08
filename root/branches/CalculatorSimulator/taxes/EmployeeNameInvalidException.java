package taxes;

public class EmployeeNameInvalidException extends Exception{

	/**
	 * fires if the employee name is empty or null
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeNameInvalidException(){
		super("The employee name cannot be empty");
	}
}
