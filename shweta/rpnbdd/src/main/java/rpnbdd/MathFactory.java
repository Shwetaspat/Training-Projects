package rpnbdd;

import java.util.HashMap;

public class MathFactory {
	@SuppressWarnings("deprecation")
	public static Operations getObject(String token) {
		Operations mathOperation = null;
		
		HashMap<String,String> classNames = new HashMap<String, String>();
		classNames.put("+", "rpnbdd.Addition");
		classNames.put("-", "rpnbdd.Subtraction");
		classNames.put("*", "rpnbdd.MUltiplication");
		classNames.put("/", "rpnbdd.Division");
		
		String className = classNames.get(token);
		try {
			mathOperation = (Operations)Class.forName(className).newInstance();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return mathOperation;

		
	}
}
