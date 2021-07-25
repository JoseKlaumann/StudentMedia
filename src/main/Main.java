package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Note 1: ");
		double N1 = sc.nextDouble();
		System.out.print("Note 2: ");
		double N2 = sc.nextDouble();
		System.out.print("Note 3: ");
		double N3 = sc.nextDouble();
		System.out.print("Note 4: ");
		double N4 = sc.nextDouble();

		StudentGrade stu = new StudentGrade(N1, N2, N3, N4);

		System.out.println(stu.studentSituation());
		
		if (stu.media() >= 5.0 && stu.media() < 6.9) {
			System.out.print("Exam note: ");
			double exam = sc.nextDouble();

			StudentGrade stu1 = new StudentGrade(exam, N1, N2, N3, N4);

			System.out.println(stu1.situationExam());
		}
		sc.close();
	}

}
