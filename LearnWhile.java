package week1.day1;

//when we dont know numbr of iterations
//nukber of 395 is  3+9+5=17

public class LearnWhile {
	public static void main(String[] args) {
		int numerator = 395;
		int denominator = 10;
		int quotient = 0;
		int reminder = 0;
		int sum = 0;

		while (numerator>denominator) {
			quotient = numerator / denominator;
			reminder = numerator % denominator;
			sum = sum + reminder;
			numerator = quotient;
		}
		sum = sum + quotient;
		System.out.print(sum);

		

	}
}
