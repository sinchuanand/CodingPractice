package codingPractice;


public class For_lo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=0;
       int  n2=1;
       int num=0; 
       System.out.println(n1);
       System.out.println(n2);
         for(int i=2;i<=10; i++) {
        	 num=n1+n2;
        	 n1=n2;
        	 n2=num;
	    System.out.println(num);
         }
}
}
