/**
 * 
 */
package slideDeckExercises01;

/**
 * 
 */
public class Employee implements Payable {

	private String name;

	/**
	 * This is the default constructor for Employee
	 */

	public Employee() {

	} 
	
	/**
	 * Constructor with args for Employee
	 * @param name
	 */
	public Employee(String name) {
		this.setName(name);
	}



	// Getters and Setters

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double calculateWages(double hoursWorked, double payRate) {
		return hoursWorked * payRate;
	}

}
