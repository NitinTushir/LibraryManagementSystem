package validate;

import java.util.regex.Pattern;

public class DataValidator {
public static boolean validateTitle(String input){
		if(input.length()<3)
			return false;
		
		final Pattern pattern = Pattern.compile("^[A-Za-z ]+");
	    if (!pattern.matcher(input).matches()) {
	        return false;
	    }
		return true;
	}
}
