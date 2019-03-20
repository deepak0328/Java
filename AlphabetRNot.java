import java.util.*;
class AlphabetRNot{
	public static void main(String argv[]){
		Scanner sc=new Scanner(System.in);
		char ch=sc.findInLine(".").charAt(0);
		char[] c={'!','@','#','$','%','^','&','*','_'};
		if(ch >= 65 && ch <= 122){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("No");
		}
	}
}
		