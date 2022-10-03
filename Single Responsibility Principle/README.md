# Single Responsibility Principle


This principle states that a class should only have one responsibility. Furthermore, it should only have one reason to change.
<br />
How does this principle help us to build better software? Let's see a few of its benefits:
<br />
- Testing – A class with one responsibility will have far fewer test cases.
- Lower coupling – Less functionality in a single class will have fewer dependencies.
- Organization – Smaller, well-organized classes are easier to search than monolithic ones.

<br />

For example: The Vehicle class below has three separate responsibilities: reporting, calculation, and database. By applying SRP, we can separate the above class into three classes with separate responsibilities.

```java

public class Vehicle {
    public void printDetails() {}
    public double calculateValue() {}
    public void addVehicleToDB() {}
}

```
