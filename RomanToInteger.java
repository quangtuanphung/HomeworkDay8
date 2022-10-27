public class MainDay8 {
	  public static void main(String[] args) {
      
		    System.out.print(romanToInteger("MCMXCIV"));
      
	}

	  public static int romanToInteger(String s) { // time complex 0(n)
		    int result = 0;
		    int current = symbolToValue(s.charAt(0));
		    for (int i = 1; i < s.length(); i++) {
		      	int next = symbolToValue(s.charAt(i));
			      if (current < next)
			        	result -= current;
			      else
				        result += current;
			      current = next;
		    }
		    result += current;

		    return result;

	}

	  public static int symbolToValue(char c) {
		    switch (c) {
		    case 'I':
			      return 1;
		    case 'V':
			      return 5;
		    case 'X':
			      return 10;
		    case 'L':
			      return 50;
		    case 'C':
			      return 100;
		    case 'D':
			      return 500;
		    case 'M':
			      return 1000;
		    default:
			      return 0;
		    }
	}
}
