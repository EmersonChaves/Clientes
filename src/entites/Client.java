package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date brirthDate;
	
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Client() {	
	}
	
	public Client(String name, String email, Date brirthDate) {
		this.name = name;
		this.email = email;
		this.brirthDate = brirthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBrirthDate() {
		return brirthDate;
	}

	public void setBrirthDate(Date brirthDate) {
		this.brirthDate = brirthDate;
	}

	@Override
	public String toString() {
		return name + " (" + sdf.format(brirthDate) + ") - " + email;
 	}
	
	
}
