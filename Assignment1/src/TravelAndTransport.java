import java.util.Scanner;

public class TravelAndTransport {							//to create super class Travel and Transport

	Scanner s = new Scanner(System.in);
	
	private String name, address, postcode, location, website, contactNumber, fax;

	public void setCompanyName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPosscode(String postcode) {
		this.postcode = postcode;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}

    public String getCompanyName() {
	return this.name;
	}

    public String getAddress() {
	return this.address;
    }

    public String getPostcode() {
	return this.postcode;
	}

    public String getLocation() {
	return this.location;
	}

    public String getWebsite() {
	return this.website;
    }
    
    public String getContactNumber() {
	return this.contactNumber;
    }

    public String getFax() {
	return this.fax;
    }

}