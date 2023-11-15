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
Verify the size is equals that 0, created this method:
```java
public boolean isEmpty(){
return size == 0;
}
```
