Sort Array

1. Using Arrays.sort():

```java
int[] array = {3, 1, 4, 1, 5, 9};
Arrays.sort(array);
// The array is now sorted in ascending numerical order.
```
custom Comparator:

```java
String[] strings = {"banana", "apple", "cherry"};
Arrays.sort(strings, new Comparator<String>() {
    public int compare(String s1, String s2) {
        return s1.compareTo(s2); // You can customize this comparison logic
    }
});
// The strings array is now sorted in alphabetical order.
```

2. Using a sorted data structure:
using a TreeSet or PriorityQueue instead of an array.

3. Using Streams (Java 8+):

```java
Integer[] array = {3, 1, 4, 1, 5, 9};
Integer[] sortedArray = Arrays.stream(array)
                              .sorted()
                              .toArray(Integer[]::new);
// Note: for int[] you would use Arrays.stream(array).sorted().toArray();
```

Use a custom comparator with streams:

```java
String[] strings = {"banana", "apple", "cherry"};
String[] sortedStrings = Arrays.stream(strings)
                               .sorted(Comparator.naturalOrder())
                               .toArray(String[]::new);
```