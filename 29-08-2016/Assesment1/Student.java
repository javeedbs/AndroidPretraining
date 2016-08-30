public class Student extends Person{
	private String program;
	private int year;
	private double fees;
	/**
	 * @param name
	 * @param address
	 * @param program
	 * @param year
	 * @param fees
	 */
	public Student(String name, String address, String program, int year,	double fees) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fees = fees;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student ["+super.toString()+",program=" + program + ", year=" + year + ", fees="+ fees + "]";
	}
	/**
	 * @return the program
	 */
	public String getProgram() {
		return program;
	}
	/**
	 * @param program the program to set
	 */
	public void setProgram(String program) {
		this.program = program;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the fees
	 */
	public double getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(double fees) {
		this.fees = fees;
	}
}
