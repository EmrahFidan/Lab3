
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
	
}
