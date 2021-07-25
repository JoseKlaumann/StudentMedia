package main;

public class StudentGrade {

	public double N1;
	public double N2;
	public double N3;
	public double N4;
	public double exam;

	public StudentGrade() {
	}

	public StudentGrade(double N1, double N2, double N3, double N4) {
		this.N1 = N1;
		this.N2 = N2;
		this.N3 = N3;
		this.N4 = N4;
	}

	public StudentGrade(double exam, double N1, double N2, double N3, double N4) {
		this.N1 = N1;
		this.N2 = N2;
		this.N3 = N3;
		this.N4 = N4;
		this.exam = exam;
	}

	public double media() {
		return ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
	}

	public double mediaExam() {
		return (exam + media()) / 2;

	}

	public String studentSituation() {
		if (media() >= 7.0) {
			return "Media: " 
		           + String.format("%.1f", media()) 
		           + "\nApproved student.";
		}
		if (media() < 5.0) {
			return "Media: " 
		           + String.format("%.1f", media()) 
		           + "\nRepproved student.";
		}
		return "Media: "
		       + String.format("%.1f", media()) 
		       + "\nStudent in exam.";
	}
	
	public String situationExam() {
		if (mediaExam() >= 5.0) {
			return "Approved student."
				   + "\nFinal media: "
				   + String.format("%.1f", mediaExam());
		}
		return "Repproved student."
		       + "\nFinal media: "
		       + String.format("%.1f", mediaExam()); 
	}
}
