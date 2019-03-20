import java.util.*;
class VowelRConst{
	public static void main(String argv[]){
		Scanner sc=new Scanner(System.in);
		char ch=sc.next(".").charAt(0);
		char[] c={'!','@','#','$','%','^','&','*','_'};
		if(ch >= 65 && ch <= 122){
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				System.out.println("Vowel");
			else
				System.out.println("Constant");
		}
		else{
			/*for(int i=0;i<c.length;i++){
				if(ch==c[i])
					System.out.println("Invalid");
			}
			if(true)
				System.out.println("Constant");*/
			System.out.println("Invalid");
		}
	}
}
		