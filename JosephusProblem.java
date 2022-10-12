public class JosephusProblem {
	public static void main(String[] args) {
		System.out.println(jos(12,3));
	}
	
	static int jos(int n , int k) {
		if(n == 1) {
			return 0;
		}else {
			return (jos(n-1 , k) + k) % n;
		}
	}

}
