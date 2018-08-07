/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author selimtoker
 */
public class main {

 
    public static void main(String[] args) {
        
        //employee employee1 = new employee("Ali","Veli",125,new address("İzmir", "Konak","35000"));
        //System.out.println("Before Raise: " + employee1.getYearlySalary());
        //employee1.setRaise(100);
        //System.out.println("After Raise: "+ employee1.getYearlySalary());
        //System.out.println(employee1.toString());
        
        employee[] employees = new employee[30];
        
        employees[0] = new employee("Ali","Veli",1250,new address("İzmir", "Konak","35000"));
        employees[1] = new employee("Ali","Veli",125,new address("İstanbul", "Konak","35000"));
        employees[2] = new employee("Ali","Veli",2500,new address("İzmir", "Konak","35000"));
        employees[3] = new employee("Ali","Veli",400,new address("İstanbul", "Konak","35000"));
        employees[4] = new employee("Ali","Veli",12500,new address("İzmir", "Konak","35000"));
        employees[5] = new employee("Ali","Veli",12,new address("İstanbul", "Konak","35000"));
        employees[6] = new employee("Ali","Veli",5000,new address("İstanbul", "Konak","35000"));
        employees[7] = new employee("Ali","Veli",200,new address("İzmir", "Konak","35000"));
        employees[8] = new employee("Ali","Veli",4000,new address("İstanbul", "Konak","35000"));
        employees[9] = new employee("Ali","Veli",999,new address("İzmir", "Konak","35000"));
        employees[10] = new employee("Ali","Veli",560,new address("İzmir", "Konak","35000"));
        employees[11] = new employee("Ali","Veli",1001,new address("İzmir", "Konak","35000"));
        employees[12] = new employee("Ali","Veli",500,new address("İstanbul", "Konak","35000"));
        employees[13] = new employee("Ali","Veli",3000,new address("İstanbul", "Konak","35000"));
        employees[14] = new employee("Ali","Veli",800,new address("İzmir", "Konak","35000"));
        employees[15] = new employee("Ali","Veli",350,new address("İzmir", "Konak","35000"));
        employees[16] = new employee("Ali","Veli",400,new address("İzmir", "Konak","35000"));
        employees[17] = new employee("Ali","Veli",1000,new address("İstanbul", "Konak","35000"));
        employees[18] = new employee("Ali","Veli",1000,new address("İzmir", "Konak","35000"));
        employees[19] = new employee("Ali","Veli",1203,new address("İzmir", "Konak","35000"));
        employees[20] = new employee("Ali","Veli",1560,new address("İzmir", "Konak","35000"));
        employees[21] = new employee("Ali","Veli",1245,new address("İstanbul", "Konak","35000"));
        employees[22] = new employee("Ali","Veli",1211,new address("İzmir", "Konak","35000"));
        employees[23] = new employee("Ali","Veli",125,new address("İzmir", "Konak","35000"));
        employees[24] = new employee("Ali","Veli",125,new address("İstanbul", "Konak","35000"));
        employees[25] = new employee("Ali","Veli",125,new address("İzmir", "Konak","35000"));
        employees[26] = new employee("Ali","Veli",125,new address("İstanbul", "Konak","35000"));
        employees[27] = new employee("Ali","Veli",125,new address("İzmir", "Konak","35000"));
        employees[28] = new employee("Ali","Veli",125,new address("İzmir", "Konak","35000"));
        employees[29] = new employee("Ali","Veli",125,new address("İstanbul", "Konak","35000"));
        
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getMonthlySalary()>1000 && employees[i].getAddress("city")=="İstanbul"){
                System.out.println(employees[i].toString());
            }
        } 
        
        System.out.println(employees[1].getAddress("city")); // return city
        System.out.println(employees[1].getAddress("street")); // return street
        System.out.println(employees[1].getAddress("zip")); // return zip
    }    
}