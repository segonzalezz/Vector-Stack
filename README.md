# Vector Stack
There are two forms to make the Stack Data Structure. The first would be with a Vector
where the first class that u would be make in the model package:

```java
package Model;
public class VectorStack <T>{
  private Object[] array;
  private int size;
  private static int arraySize = 10;
}
```
And the constructor u can placed:
```java
  public VectorStack(){
  array = new Object[arraySize];
  size = 0;
```
And respective gets and the others methods:
```java
  public int getSize(){
  return size;
  }

  public T getIndex(int index){
  if(index >= 0 && index < size){
  return (T) array[indThe ex];
  }else{
  throw new IndexOutOfBoundsException("Index out of bounds");
```
Verify the size is equals that 0, First created this boolean method and the other second method is about check the size of array to expand:
```java
public boolean isEmpty(){
return size == 0;
}

public void checkSize(){
  if(size == array.length)
  array = java.util.Arrays.copyOf(array, size * 2);
}
```
now lets to created the serious methods that are:
### Push
```java
public void push(T dato){
  checkSize();
  array[size++] = dato;
}
```
### Pop
```java
public T pop(){
  if(isEmpty()){
  throw new IllegalStateException("The Stack is empty");
  }   
  T dato = (T) array[--size];
  array[size] = null;
  return dato;
}
```
### Peek
```java
public T peek(){
  if(isEmpty()){
  throw new IllegalStateException("The Stack is empty"); 
  }
  return (T) array[size -1];
}
```
### Pictures
<div align="center"> 
  
![Alter](images/one.PNG)

![NONE](images/Tree.PNG)

</div>
