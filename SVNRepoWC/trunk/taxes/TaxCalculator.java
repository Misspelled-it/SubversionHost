package taxes;

public class TaxCalculator {
	public static double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		double taxAmount=0;
		if(!isIndian) {
			//if they're not Indian throw a custom exception
			throw new CountryNotValidException();
		}
		if(empName == null || "".equals(empName)) {
			//if the name field is empty or null throw a custom exception
			throw new EmployeeNameInvalidException();
		}
		//calculate the tax based on bracket and salary otherwise throw a custom exception
		if(empSal >100000) {
			taxAmount=empSal*8/100;
		} else if(empSal<=100000 && empSal>=50000 && isIndian) {
			taxAmount=empSal*6/100;
		} else if(empSal < 50000 && empSal >= 30000 && isIndian) {
			taxAmount =empSal*5/100;
		} else if(empSal <30000 && empSal>=10000 && isIndian) {
			taxAmount =empSal*4/100;
		} else {
			throw new TaxNotEligibleException();
		}
		//finally return a tax amount if we did now throw an exception
		return taxAmount;
	}

}
