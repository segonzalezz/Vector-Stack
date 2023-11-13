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
And the constructor put:
```java
  public VectorStack(){
  array = new Object[arraySize];
  size = 0;
```
And respective gets and the others methods:
