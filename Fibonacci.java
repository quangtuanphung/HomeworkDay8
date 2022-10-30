public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 6;
		int n2 = 100;

		System.out.println(fibo1(n1));
		System.out.println(fibo2(n2));
	}

	public static int fibo1(int n) {
		if (n <= 1)
			return n;

		return (fibo1(n - 1) + fibo1(n - 2));
	}

	public static int fibo2(int n) {

		int[] fiboArr = new int[n + 1];
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		fiboArr[0] = 0;
		fiboArr[1] = 1;

		for (int i = 2; i < n + 1; i++) {
			fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
		}
		return fiboArr[n];

	}
}
//Time complexity 0(n)
