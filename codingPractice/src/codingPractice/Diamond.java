package codingPractice;


public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=n-1;
		//for number of rows
		for (int i=0; i<n; i++) {
			
			//to print space
			for (int j=0;j<space; j++) 
				System.out.print(" ");
			
			//to print *
			for (int j=0;j<=i; j++) 
				System.out.print("* ");
			
			System.out.print("\n");
			space--;
			}	   
		space=0;
		    for (int i=n; i>0; i--) {
			for (int j=0;j<space; j++) 
				System.out.print(" ");
				
			for (int j=0;j<i; j++) 
				System.out.print("* ");
		
			System.out.print("\n");
			space++;
			}
	}

}
