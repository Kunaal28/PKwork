package corejavaexamples;

public class QuestionOne {

	public static void main(String[] args) {
		 Ex11_6 instanceA = new Ex11_6();
		 Ex11_6 instanceB = new Ex11_6();
		 instanceA.a = 8;
		 instanceB.b = instanceA.x;
		 instanceA.x++;
		 instanceB.a = 10;
		 instanceB.c = 90;
		 instanceB.x++;
		 
		 System.out.println(instanceA );
		 System.out.println(instanceB);


	}

}
