package demo04;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Gavin Du on 7/16/2017.
 */
public class Employee implements Cloneable, Serializable {
    private static final long serialVersionUID = 8458324190434833471L;
    private String name;

    public Employee() {
        System.out.println("Employee constructor called...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if (name == null) {
            if (employee.name != null) {
                return false;
            }
        } else if (!name.equals(employee.name)) {
            return false;
        }
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }


}
