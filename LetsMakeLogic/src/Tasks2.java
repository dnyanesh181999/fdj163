import java.util.Scanner;

public class Tasks2 {
	public boolean isPalindrome(String s){
	String temp =s;
	String rev ="";
	for(int i=s.length()-1;i>=0;i--){
	char c = s.charAt(i);
	rev=rev+c;
	}
	if(temp.equals(rev)){
	return true;
	}
	return false;

	}
	public static void main(String []args){
	Scanner  sc = new Scanner(System.in);
	Tasks2 t = new Tasks2();
	System.out.println("Enter String Array size");
	int size =sc.nextInt();
	String [] arr = new String [size];
	System.out.println("Enter the elements");
	for(int i=0;i<arr.length;i++){
	arr[i]=sc.next();
	}
	System.out.println("Array Created sucessfully");
	for(int i=0;i<arr.length;i++){
	String str = arr[i];
	if(t.isPalindrome(str)) {
		System.out.println(str+": It is palindrome");
	}
	else {
		System.out.println(str+": It is not palindrome");
	}

	}

	}

	}

