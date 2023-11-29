Compare two arrays

1. Using a for loop to check each element:

```java
boolean areEqual = true;
if (array1.length == array2.length) {
    for (int i = 0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
            areEqual = false;
            break;
        }
    }
} else {
    areEqual = false;
}
```
2. Using Arrays.equals():

```java
boolean areEqual = Arrays.equals(array1, array2);
```

3. Using Arrays.deepEquals():

```java
boolean areEqual = Arrays.deepEquals(array1, array2);
```

4. Using the Stream API:

```java
boolean areEqual = IntStream.range(0, array1.length)
    .allMatch(index -> array1[index] == array2[index]);
```