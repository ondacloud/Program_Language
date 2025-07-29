## 1-Dimensional Array Baic Structure
```java
public class Main {
    public static void main(String[] args) {
        <Data Type>[] <Variable> = new <Data Type>[<Array Size>];
    }
}
```

<br>

## Example
### 1-Dimensional Array Structure
```java
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
```