package gagana.small.project;

public class reversestring {

	public static void main(String[] args) {
		String s1="gagana";
		String s2=" ";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);

	}

}
