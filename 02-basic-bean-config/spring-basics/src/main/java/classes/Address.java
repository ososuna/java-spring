package classes;

public class Address {
    
    private String street;
    private String postCode;
    
    public Address(String street, String postCode) {
        this.street = street;
        this.postCode = postCode;
    }

    public void init() {
        System.out.println("Address created: " + this);
    }

    @Override
    public String toString() {
        return "Address [postCode=" + postCode + ", street=" + street + "]";
    }
}
