import java.util.Scanner;

public class BmiTest {
	
	static String BMIarray[] = new String[3];
	
	public static void main(String[] args) {
		for (int i=0;i < 3; i++) {
				
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter name, age, weight, height: (as space separated): ");
			String input = scan.nextLine();
			
			String [] inputs = input.split(" ");
			
			if(inputs.length == 5) {
				Bmi bmi = new Bmi();
				devide1(input,bmi);
				
				System.out.println();
	
				BMIarray[i] = "** The BMI result for "+bmi.get_name()+" ("+" Age: "+bmi.get_age()+" Weight: "+bmi.get_weight()+" Height: "+bmi.get_height()+")"+" is"+"\n"+Bmi.getStatus(Bmi.getBMI(bmi.get_weight(), bmi.get_height()));
				
			}
			else if(inputs.length == 4) {
				Bmi bmi = new Bmi("",20,0,0);
				
				devide2(input,bmi);
				
				System.out.println();
				
				BMIarray[i] = "** The BMI result for "+bmi.get_name()+" ("+" Age: "+bmi.get_age()+" Weight: "+bmi.get_weight()+" Height: "+bmi.get_height()+")"+" is"+"\n"+Bmi.getStatus(Bmi.getBMI(bmi.get_weight(), bmi.get_height()));
				
			}
			else {
				Bmi bmi = new Bmi("John Black", 25, 100, 50);
								
				System.out.println();
				BMIarray[i] = "** The BMI result for "+bmi.get_name()+" ("+" Age: "+bmi.get_age()+" Weight: "+bmi.get_weight()+" Height: "+bmi.get_height()+")"+" is"+"\n"+Bmi.getStatus(Bmi.getBMI(bmi.get_weight(), bmi.get_height()));
				
			}
			
	}
		
		for(int j=0; j<3; j++) {
		System.out.println("---ENTER PERSON "+(j+1)+"'S VALUES---");
		System.out.println(BMIarray[j]);
		System.out.println();
		}
		
	}
	
	
	public static void devide1 (String input,Bmi bmi) {
		
		// I use indexOf and substring 
		int x1 = input.indexOf(" ");
		String name = input.substring(0, x1+1);
		String input2 = input.substring(x1+1);
		
		int x2= input2.indexOf(" ");
		String surname = input2.substring(0,x2);
		String input3 = input2.substring(x2+1);
		
		int x3 = input3.indexOf(" ");
		String Age = input3.substring(0,x3);
		String input4 = input3.substring(x3+1);
		
		int x4 = input3.indexOf(" ");
		String Weight = input4.substring(0,x4+1);
		String input5 = input4.substring(x4+1);
		
		int x5 = input5.indexOf(" ");
		String Height = input5.substring(x5+1);
	
		
		bmi.set_name(name.concat(surname));;
		
		int age = Integer.valueOf(Age);
		bmi.set_age(age);
		
		double weight = Double.valueOf(Weight);
		bmi.set_weight(weight);

		double height = Double.valueOf(Height);
		bmi.set_height(height);
				
	}
	
	public static void devide2 (String input,Bmi bmi) {
		// I use split
		String [] inputs = input.split(" ");
		
		bmi.set_name(inputs[0].concat(" ").concat(inputs[1]));
		
		double weight = Double.valueOf(inputs[2]);
		bmi.set_weight(weight);
		
		double height = Double.valueOf(inputs[3]);
		bmi.set_height(height);
		
	}

}




