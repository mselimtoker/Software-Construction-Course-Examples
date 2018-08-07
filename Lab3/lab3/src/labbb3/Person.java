/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labbb3;

/**
 *
 * @author ilhan.sofuoglu
 */
class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int birthYear;
    Address address;
    private boolean isMarried = false;
    private boolean hasChildren = false;
    int year = 2018;

    public Person(String firstName, String lastName, int birthYear, Address address, boolean isMarried, boolean hasChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.address = address;
        this.isMarried= isMarried;
        this.hasChildren = hasChildren;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return year - birthYear;
    }
    
    public int getBirthDay(){
        return birthYear;
    }
    
    public void setBirthDay(int birthYear){
        this.birthYear=birthYear;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean hasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", birthDay=" + birthYear + ", address=" + address + ", isMarried=" + isMarried + ", hasChildren=" + hasChildren + '}';
    }
    
}
