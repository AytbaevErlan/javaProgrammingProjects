package lecture12_practise;

import java.io.*;

public class Student implements Serializable {
    public static void main(String[] args) {
        Student student = new Student();
        String filename = "tms3.txt";
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //serialization of object
            out.writeObject(student);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
            System.out.println("student = " + student);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            //deserialization of object
            student = (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("student = " + student);
        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}



