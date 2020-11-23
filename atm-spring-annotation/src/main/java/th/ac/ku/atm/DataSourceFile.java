//package th.ac.ku.atm;
//
//import org.springframework.stereotype.Component;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.HashMap;
//import java.util.Map;
package th.ac.ku.atm;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class DataSourceFile implements DataSource {

    /**
     * Simulate reading customer information from database
     */
    public Map<Integer,Customer> readCustomers() {
        Map<Integer,Customer> customers = new HashMap<>();

        customers.put(1,new Customer(1,"Kwan",1234,1000));
        customers.put(2,new Customer(2,"Katherine",2345,2000));
        customers.put(3,new Customer(3,"Chris",3456,3000));

        return customers;
    }
}//import java.util.Scanner;
//
//public class DataSourceFile implements DataSource {
//
//    private String filename;
//
//    /**
//     * @param filename the name of the customer file
//     */
//    public DataSourceFile(String filename) {
//        this.filename = filename;
//    }
//
//    /**
//     * Reads the customer numbers and pins
//     * and initializes the bank accounts.
//     */
//    public Map<Integer,Customer> readCustomers() {
//
//        Map<Integer,Customer> customers = new HashMap<>();
//        Scanner in;
//
//        try {
//            in = new Scanner(new FileReader(filename));
//        } catch (FileNotFoundException e) {
//            System.err.println("Problem reading a customer file: "+filename);
//            return customers;
//        }
//
//        while (in.hasNext()) {
//            int number = in.nextInt();
//            String name = in.next();
//            int pin = in.nextInt();
//            double currentBalance = in.nextDouble();
//            Customer c = new Customer(number, name, pin, currentBalance);
//            customers.put(c.getId(), c);
//        }
//        in.close();
//        return customers;
//    }
//}
