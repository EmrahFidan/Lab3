import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nameArray[] = new String[3]; 
		int ageArray[] = new int[3];
		double weightArray[] = new double[3]; 
		double heightArray[] = new double[3];
		String interpretArray[] = new String[3];
		
		Scanner scan = new Scanner(System.in);

		for( int i = 0; i < 3; i++) {
				
			System.out.println("Enter name, age, weight, height: (as space separated): ");
			String input = scan.nextLine();
			
			interpretArray[i] = input;
			
			String [] inputs = input.split(" ");
			
			nameArray[i] = inputs[0].concat(" ").concat(inputs[1]);
			
			int age = Integer.valueOf(inputs[2]); 
			ageArray[i] = age;
			
			double weight = Double.valueOf(inputs[3]);
			weightArray[i] = weight;
			
			double height = Double.valueOf(inputs[4]);
			heightArray[i] = height;
			
			System.out.println();
			}


	}

}
