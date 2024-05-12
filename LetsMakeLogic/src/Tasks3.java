
public class Tasks3 {
public static void main(String[] args) {
	String s="aaa";
	String temp = s;
	String rev ="";
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	if(temp.equals(rev)) {
		System.out.println("pal");
	}
}
}
