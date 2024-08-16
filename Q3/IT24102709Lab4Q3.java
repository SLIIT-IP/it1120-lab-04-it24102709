import java.util.*;
public class IT24102709Lab4Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
   		System.out.println("Enter a number : ");
  		double no = input.nextDouble();
	 
		String msg;
		
		msg=(no<0)? "Negative":(no>0)? "Positive":"no is Zero";
		System.out.print(msg); }
	}
}