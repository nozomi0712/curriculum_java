package sumer_study_for;

//class Study {
//	public static void main (String[] args) {
//		for (int i=0; i<100; i++) {
//			System.out.println(i + "です");
//		}
//	}
//}

public class Study{
	public static void main(String[] args) {
		for (int i=0; i<100; i++) {
			if (i % 30 == 0) {
				System.out.println("FIZZBUZZ!!");
			}
			else if (i % 10 == 0) {
				System.out.println("FIZZ!!");
			}
			else if (i % 3 == 0) {
				System.out.println("BUZZ!!");
			}
			else {
				System.out.println(i);
			}
		}
	}
}