public class Staff extends Person{
	private String school;
	private double pay;
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	/**
	 * @return the pay
	 */
	public double getPay() {
		return pay;
	}
	/**
	 * @param pay the pay to set
	 */
	public void setPay(double pay) {
		this.pay = pay;
	}
	/**
	 * @param name
	 * @param address
	 * @param school
	 * @param pay
	 */
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Staff["+super.toString()+" , school=" + school + ", pay=" + pay +  "]";
	}
}
