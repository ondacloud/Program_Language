## 3-Dimensional Array Baic Structure
```java
public class Main {
    public static void main(String[] args) {
        <Data Type>[] <Variable> = new <Data Type>[<Array Size>][<Array Size>][<Array Size>];
    }
}
```

<br>

## Example
### 3-Dimensional Array Structure
```java
public class Main {
    public static void main(String[] args) {
        int[][][] a = {
            {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
            }
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println(a[i][j][k]);
                }
            }
        }
    }
}
```