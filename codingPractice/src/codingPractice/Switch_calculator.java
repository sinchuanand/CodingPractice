package packg;

public class Switch_calculator {

public static void main(String[] args) {
		int a=90;
		int b=30;
		int result=4;
		switch(result) {
		case 1:
	            System.out.println("Addition of a+b="+(a+b));
	     break;
		case 2:
			System.out.println("substraction of a-b="+(a-b));
	    break;
		case 3:
			System.out.println("Multiplication of a*b="+(a*b));
	    break;
		case 4:
			System.out.println("Division of a/b="+(a/b));
	    break;
	           default :
        	System.out.println("Enter the correct operation");
               break;
	}


	}


}
