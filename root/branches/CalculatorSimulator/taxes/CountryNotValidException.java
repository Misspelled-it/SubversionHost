package taxes;

public class CountryNotValidException extends Exception{
	/**
	 *fires if the employee isn't Indian 
	 */
	private static final long serialVersionUID = 1L;

	public CountryNotValidException(){
		super("The employee should be an Indian citizen for calculating tax");
	}
}
