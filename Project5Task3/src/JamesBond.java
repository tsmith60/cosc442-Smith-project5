
public class JamesBond {

	public JamesBond(){
		
		
	}
	public Boolean bondRegex(String input){
		//Regex pattern   ([\d)])*([(])([\d)(])*(007)([\d(])*([)])([\d)(])*
		String pattern = "([\\d)])*([(])([\\d)(])*(007)([\\d(])*([)])([\\d)(])*";
		return input.matches(pattern);
		
	}

}
