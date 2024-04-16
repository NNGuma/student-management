/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CC
 */
public interface Manageable {
    public class Student implements Manageable {
    // ...

    public void add(Object item) {
        // implementation specific to Student class
    }

    public void remove(Object item) {
        // implementation specific to Student class
    }

    public void displayAll() {
        // implementation specific to Student class
    }
}

public class CollegeStudent implements Manageable {
    // ...

    public void add(Object item) {
        // implementation specific to CollegeStudent class
    }

    public void remove(Object item) {
        // implementation specific to CollegeStudent class
    }

    public void displayAll() {
        // implementation specific to CollegeStudent class
    }
}

}
