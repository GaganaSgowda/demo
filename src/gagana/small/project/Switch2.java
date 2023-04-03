package gagana.small.project;

public class Switch2 {

	public static void main(String[] args) {
		char grade='c';
		switch(grade) {
		case 'a':{
			System.out.println("very very good");
		}
		
		case 'b':{
			System.out.println("very good");
		}
		case 'c':{
			System.out.println("good");
		}
		break;
		case 'd':{
			System.out.println("nice");
		}
		break;
		
		}
		System.out.println("your grade="+grade);

	}

}
