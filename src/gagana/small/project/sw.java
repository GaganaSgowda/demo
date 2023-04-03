package gagana.small.project;

public class sw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='c';
		switch(grade) {
		case 'a':{
			System.out.println("excellent");
			//break;
		}
		case 'b':{
			System.out.println("good");
			//break;
		}
		case 'c':{
			System.out.println("nice");
			break;
			
		}
		case 'd':{
			System.out.println("passed");
		}
		System.out.println("your grade"+grade);
		}

	}

}
