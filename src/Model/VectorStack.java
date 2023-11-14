package Model;

import java.io.Serializable;

public class VectorStack <T> implements Serializable{
    private Object[] array;
    private int size;
    private static int arraySize = 10;
    
    public VectorStack(){
        array = new Object[arraySize];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }
    
    public T getIndex(int index) {
        if (index >= 0 && index < size) {
            return (T) array[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void push(T dato){
        checkSize();
        array[size++] = dato;
    }
    
    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("The Stack is empty");
        }
        T dato = (T) array[--size];
        array[size] = null;
        return dato;
    }
    
    public T peek(){
        if(isEmpty()){
           throw new IllegalStateException("The Stack is empty"); 
        }
        return (T) array[size -1];    
    }
    
    public void checkSize(){
        if(size == array.length)
            array = java.util.Arrays.copyOf(array, size * 2);
    }
}
