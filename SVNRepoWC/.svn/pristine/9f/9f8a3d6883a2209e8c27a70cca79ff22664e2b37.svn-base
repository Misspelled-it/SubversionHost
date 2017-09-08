package taxes;

public class CalculatorSimulator {
	public static void main(String[] args) {
		try {
			//print out the tax amount using the tax calculator
			System.out.println("The tax amount is " + TaxCalculator.calculateTax("",true, 30000));
		} catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
			//catch block for our custom exceptions
			e.printStackTrace();
		}
	}
}
