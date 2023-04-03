package gagana.small.project;

public class primenumber {

	public static void main(String[] args) {
		int no=7;
		int copy=no;
		boolean gaanu=true;
		for(int i=2; i<=no;i++) {
			if(no%2==0){
				gaanu=false;
				
			}
		}
if (gaanu==true) {
	System.out.println("yes it is");
}
else {
	System.out.println("no it is not");
}
	}

}
