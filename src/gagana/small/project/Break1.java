package gagana.small.project;

public class Break1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=60;i>=0;i--) {
			if(i==30) {
				break;
			}
			if(i==40) {
				continue;
			}
			System.out.println(i);
		}

	}

}
