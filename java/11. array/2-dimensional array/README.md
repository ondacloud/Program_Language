## 2-Dimensional Array Baic Structure
```java
public class Main {
    public static void main(String[] args) {
        <Data Type>[] <Variable> = new <Data Type>[<Array Size>][<Array Size>];
    }
}
```

<br>

## Example
### 2-Dimensional Array Structure
```java
public class Main {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
```