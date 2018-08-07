/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

import java.util.regex.Pattern;

/**
 *
 * @author selimtoker
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private int salary;

    public Person(String name, String surname, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(Pattern.compile( "[0-9]" ).matcher(name).find()){
          throw new Exception("Name cant contains any number");
        }
        
        else{
          this.name = name;  
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws Exception {
        if(Pattern.compile( "[0-9]" ).matcher(surname).find()){
          throw new Exception("Name cant contains any number");
        }
        
        else{
        this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new ArithmeticException("Age cant be negative.");
        }
         
        else{
            this.age = age;
        }
        
        
        
        
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary<0){
            throw new ArithmeticException("Salary cant be negative.");
        }
         
        else{
            this.salary=salary;
        }
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", salary=" + salary + '}';
    }

}


