package demo04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * Created by Gavin Du on 7/16/2017.
 */
public class FiveWaysToCreateAnObject {
    public static void main(String... args) throws Exception {

        // By using new keyword, this will invoke constructor
        Employee emp1 = new Employee();
        emp1.setName("Gavin");

        System.out.println(emp1 + ", hashcode : " + emp1.hashCode());

        // By using Class's newInstance method, invoking constructor
        Employee emp2 = (Employee) Class.forName("demo04.Employee").newInstance();
        // Employee.class.newInstance();
        emp2.setName("Gavin2");
        System.out.println(emp2 + ", hashcode : " + emp2.hashCode());

        // By using constructor method and newInstance method, invoking constructor
        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee emp3 = constructor.newInstance();
        emp3.setName("Gavin3");
        System.out.println(emp3 + ", hashcode : " + emp3.hashCode());

        // By using clone method, without invoking constructor
        Employee emp4 = (Employee) emp1.clone();
        emp4.setName("Gavin4");
        System.out.println(emp4 + ", hashcode : " + emp4.hashCode());

        // By using Deserialization
        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.data"));
        out.writeObject(emp4);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.data"));
        Employee emp5 = (Employee) in.readObject();
        emp5.setName("Gavin5");
        System.out.println(emp5 + ", hashcode : " + emp5.hashCode());

    }
}
