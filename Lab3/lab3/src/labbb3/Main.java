package labbb3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	Employee emp1 = new Employee("Selim","Toker",1995,new Address("Konak","İzmir","35000"),true,true,10000);
	Employee emp2 = new Employee("Ahmet","Ret",1995,new Address("Konak","İstanbul","35000"),false,true,10000);
        Employee emp3 = new Employee("Mehmet","As",1995,new Address("Konak","İzmir","35000"),true,false,10000);
        Employee emp4 = new Employee("Ali","Et",1995,new Address("Konak","Bursa","35000"),false,false,10000);
        Employee emp5 = new Employee("Veli","Ha",1995,new Address("Konak","İzmir","35000"),true,true,10000);
        Employee emp6 = new Employee("Can","Ha",1995,new Address("Konak","Denizli","35000"),false,true,10000);
        Employee emp7 = new Employee("Canan","Har",1995,new Address("Konak","İzmir","35000"),true,false,10000);;
        Employee emp8 = new Employee("Deniz","Hare",1995,new Address("Konak","Muğla","35000"),false,true,10000);
        
        ArrayList<Employee> empList = new ArrayList();
        
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        empList.add(emp8);

        System.out.println(emp1);
        System.out.println("--> Setting salary to -100");
        emp1.setMonthlySalary(-100);
        System.out.println(emp1);
        System.out.println("--> Setting raise percentage to -90");
        emp1.makeSalaryIncrease(-90);
        System.out.println(emp1);
        System.out.println("--> Setting raise percentage to 100");
        emp1.makeSalaryIncrease(100);
        System.out.println(emp1);
        System.out.println("--> Yearly salary of the employee is : "  + emp1.getYearlySalary());

        System.out.println("----------------END OF BASIC OPERATIONS TESTS-------------------");

        for(int i=0;i<empList.size();i++){
            if(empList.get(i).address.getCity().equalsIgnoreCase("Izmir") && empList.get(i).getMonthlySalary()>0){
                System.out.println(empList.get(i));
            }
        }
    }
}
