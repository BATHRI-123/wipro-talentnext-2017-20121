public class Employers implements Comparable<Employers> {
	private String firstName; 
	private String lastName;
	private long mobileNumber; 
	private String emailId;	
	private String address;
	
	public Employers() {
		super();
	}
	
	public Employers(String firstName, String lastName, long mobileNumber, String emailId, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employers [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employers emp) {
		return this.firstName.compareTo(emp.getFirstName()) * -1;
	}
	
}