public class MainDay8 {
	  public static void main(String[] args) {
		    
        String[] arr = { "cat", "car", "caroline", "caramel" };
		    System.out.println(longestSameString(arr));
		
	}

	  public static String longestSameString(String[] strs) {
		    if (strs == null || strs.length == 0) {
			      return "";
		    }
		    String longestSameString = strs[0];
		    for (int i = 1; i < strs.length; i++) {
			      String currentWord = strs[i];
			      int j = 0;
			      while (j < currentWord.length() && j < longestSameString.length() && currentWord.charAt(j) == longestSameString.charAt(j)) {
				        j++;
			      }
			      if (j == 0)
				        return "";
			      longestSameString = currentWord.substring(0, j);

		  }
		  return longestSameString;

	}

}
// Time complexity 0(n^n)
