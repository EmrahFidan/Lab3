import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter weight, height: (as space sperated)");
		String input = scan.nextLine();

		try {
			String [] inputs = input.split(" ");
			String w = inputs[0];
			String h = inputs[1];
			
			double weight = Float.valueOf(w);
			double height = Float.valueOf(h);
			
			weight = (0.45359237) * weight;
			height = (0.0254) * height;
			
			double BMI = weight / (height*height); 
			
			System.out.println();
			System.out.println("BMI is: "+BMI);
			
		if(BMI < 18.5) {
			System.err.println("Underweight");
		}
		else if(BMI >= 18.5 && BMI < 25.0) {
			System.err.println("Normal");
		}
			
		else if(BMI >= 25 && BMI < 30.0) {
			System.err.println("Qwerweight");
		}
			
		else if(BMI >= 30.0) {
			System.err.println("Obese");
		}
		
	}

	catch (Exception error) {
		System.out.println("input error");
	}


	}

}
