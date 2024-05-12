package java8;

public class Test {
public static void main(String[] args) {
	 String input = "pranav deshmukh";
     String output = rotateWords(input);
     System.out.println(output);
	
	}
public static String rotateWords(String input) {
    String[] words = input.split("\\s+");
    StringBuilder result = new StringBuilder();
    
    for (String word : words) {
        String rotatedWord = rotateWord(word);
        result.append(rotatedWord).append(" ");
    }
    
    return result.toString().trim();

}
public static String rotateWord(String word) {
    char[] charArray = word.toCharArray();
    int n = charArray.length;
    for (int i = 0; i < n / 2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[n - i - 1];
        charArray[n - i - 1] = temp;
    }
    return new String(charArray);
}
}

