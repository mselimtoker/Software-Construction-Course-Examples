package labbb3;


public class Address {
    private String streets;
    private String city;
    private String zip;

    public Address(String streets, String city, String zip) {
        this.streets = streets;
        this.city = city;
        this.zip = zip;
    }

    public String getStreets() {
        return streets;
    }

    public void setStreets(String streets) {
        this.streets = streets;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "\'" + this.streets + " Street / " + this.city + " / " + this.zip + "\'";
    }
}
