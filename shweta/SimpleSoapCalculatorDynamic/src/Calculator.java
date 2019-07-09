import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
	
	@WebMethod
	public int add(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}
}
