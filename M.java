import java.util.*;
class M{
	public static void main(String[] argh){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int j=0;
		HashSet<Character>hs=new HashSet<>();
		for(int i=0;i<s.length();i++){
			hs.add(s.charAt(j++));
		}
		System.out.print(hs.size());
	}
}