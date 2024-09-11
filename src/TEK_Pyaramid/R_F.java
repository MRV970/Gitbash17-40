package TEK_Pyaramid;

public class R_F {
	static int fact(int n) {
		if(n<=1)
			return 1;
		return n*fact(n-1);
		}
	public static void main(String[] args) {
		System.out.println(fact(3));
	}

}
