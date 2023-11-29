Copy Array:

1. Looping through the array:
```java
for (int i = 0; i < originalArray.length; i++) {
    newArray[i] = originalArray[i];
}
```

2. System.arraycopy():

```java
System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
```

3. Arrays.copyOf():

```java
int[] newArray = Arrays.copyOf(originalArray, originalArray.length);
```
4. Arrays.copyOfRange():

```java
int[] newArray = Arrays.copyOfRange(originalArray, 0, originalArray.length);
```
5. Object.clone():

``` java
int[] newArray = originalArray.clone();
```

6. Stream API:

```java
int[] newArray = Arrays.stream(originalArray).toArray();
```

7. Collections Framework:

```java
Integer[] newArray = new Integer[originalArray.length];
List<Integer> list = Arrays.asList(originalArray);
newArray = list.toArray(newArray);
```