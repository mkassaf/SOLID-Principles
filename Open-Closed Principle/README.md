# Open-Closed Principle
The application or module entities the methods, functions, variables, etc. The open-closed principle states that according to new requirements the module should be open for extension but closed for modification. The extension allows us to implement new functionality to the module. Let's understand the principle through an example.
<br/>
Suppose, VehicleInfo is a class and it has the method vehicleNumber() that returns the vehicle number.

<br/>

```java


public class VehicleInfo {  
  public double vehicleNumber(Vehicle vcl){  
    if (vcl instanceof Car){  
      return vcl.getNumber();  
    if (vcl instanceof Bike){  
        return vcl.getNumber();  
    }  
  }  
}

```

If we want to add another subclass named Truck, simply, we add one more if statement that violates the open-closed principle. The only way to add the subclass and achieve the goal of principle by overriding the vehicleNumber() method, as we have shown below.

VehicleInfo.java

```java

public class VehicleInfo  {  
  public double vehicleNumber(){  
  //functionality   
  }  
}  
public class Car extends VehicleInfo {  
  public double vehicleNumber(){  
    return this.getValue();  
  }  
public class Car extends Truck {  
  public double vehicleNumber() {  
    return this.getValue();  
  }
}

```

