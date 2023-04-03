package practice;

public class primenumber {

	public static void main(String[] args) {
	int number=6;
	int copy=number;
	boolean gagana=true;
	for(int i=2; i<=number; i++) {
		if(number%2==0) {
			gagana=false;
			
		}
		if(gagana==true) {
			System.out.println("yes it is prime");
		}
		else {
			System.out.println("no it is not");
		}
	}
	}

}
