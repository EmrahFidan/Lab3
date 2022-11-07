
public class Bmi {
	// constructor 1
	public Bmi() {
		
	}
	
    // constructor 2
	public Bmi(String name,double weight,double height) {
		
		_name = name;
		_weight = weight;
		_height = height;
		
	}

    // constructor 3
	public Bmi(String name,int age,double weight,double height) {
		
		_name = name;
		_age = age;
		_weight = weight;
		_height = height;
		
	}
	
	// constructor for defaulr value

	private String _name;
	private int _age;
	private double _weight;
	private double _height;
	

    public static final double KILOGRAMS_PER_POUND(double weight) {
		
		return (0.45359237) *weight;
		
	}
	
	public static final double METERS_PER_INCH(double height) {
		
		return (0.0254) *height;
		
	}
	
    // I created BmiFunctions  in the Bmi Class

	public static double getBMI(double weight, double height) {
		
		double Weight = KILOGRAMS_PER_POUND(weight);
		double Height = METERS_PER_INCH(height);
		
		double Bmı = Weight / (Height*Height);
		
		// I use math.round method
		double BMI = Math.round(Bmı);
		
		return BMI;
		
	}
	
	public static String getStatus(double BMI) {
		
		String result = null;
		
		if(BMI < 18.5) {
			result = "Underweight";
		}
		else if(BMI >= 18.5 && BMI < 25.0) {
			result = "Normal";
		}
			
		else if(BMI >= 25 && BMI < 30.0) {
			result = "Owerweight";
		}
			
		else if(BMI >= 30.0) {
			result = "Obese";
		}
			
		return result;
		
	}

    // getter
	String get_name() {
		return _name;
	}
	int get_age() {
		return _age;
	}
	double get_weight() {
		return _weight;
	}
	double get_height() {
		return _height;
	}
	
	//setter
	void set_name(String name) {
		_name = name;
	}
	void set_age(int age) {
		_age = age;
	}
	void set_weight(double weight) {
		_weight = weight;
	}
	void set_height(double height) {
		_height = height;
	}

}
