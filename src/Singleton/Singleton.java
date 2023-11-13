package Singleton;

import Model.User;
import Model.VectorStack;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Singleton {
    
    private static Singleton INSTANCE;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void writeUser(VectorStack<User> userStack) {
        try {
            FileOutputStream file = new FileOutputStream("users.dat");
            ObjectOutputStream writer = new ObjectOutputStream(file);
            writer.writeObject(userStack);
            System.out.println("Se escribio usuario");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public VectorStack<User> readUser() {
        try {
            FileInputStream file = new FileInputStream("users.dat");
            ObjectInputStream reader = new ObjectInputStream(file);
            return (VectorStack<User>) reader.readObject();
        } catch (IOException | ClassNotFoundException | NullPointerException ex) {
            ex.printStackTrace();
            return new VectorStack<User>();
        }
    }
}
