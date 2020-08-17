
public class Swap_num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;int b=5;
		System.out.println("before swapping" + a +"and"+ b );
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swapping"+ a + "and"+ b);
	}

}
