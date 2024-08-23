import java.util.Scanner;
public class IT24192709Lab4Q2{
	public static void main(String[]args){
		Scanner w = new Scanner(System.in);
		
		
		
		System.out.print("Please enter the exam marks (out of 100):");
		double examMarks = w.nextDouble();
		if(examMarks<=0||examMarks>=100)
		{
			System.out.println("invalid input for exam marks. Terminating program.");
			return;
		}
		
		
		
		System.out.print("Please enter the lab submission marks: ");
		double labMarks = w.nextDouble();
		if(labMarks<=0||labMarks>=100)
		{
			System.out.println("invalid Marks!");
			return;
		}
		
		
		System.out.print("Enter the percentage given for the exam: ");
		double examPercentage = w.nextDouble();
		if(examPercentage<=0||examPercentage>=100)
		{
			System.out.println("invalid percentage");
		}
	
	
	
		System.out.print("Enter the percentage given for the lab.");
		double labPercentage = w.nextDouble();
		if(labPercentage<=0||labPercentage>=100)
		{
			System.out.print("invalid percentage");
		}
		
		
		
		if(examPercentage+labPercentage!=100)
		{
			System.out.print("The percentages must add up to 100. Terminating program.");
		}
		
		
		
		double onlyExamMarks = examMarks*examPercentage/100;
		double onlyLabMarks = labMarks*labPercentage/100;
		
		
		
		double finalMarks = onlyExamMarks+onlyLabMarks;
		
		
		
		System.out.print("Your final exam mark is: "+finalMarks);			
		
	}
}
