package Lecture10;

public class GCD {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int Divisor = 36;
		int Divident = 60;

		while (Divident % Divisor != 0) {
			int rem = Divident % Divisor;
			Divident = Divisor;
			Divisor = rem;
		}
		System.out.println(Divisor);
	}
}
