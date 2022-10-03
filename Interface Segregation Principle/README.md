# Interface Segregation Principle

This principle was first defined by Robert C. Martin as: “Clients should not be forced to depend upon interfaces that they do not use“.
<br/>
The goal of this principle is to reduce the side effects of using larger interfaces by breaking application interfaces into smaller ones. 


**It's similar to the Single Responsibility Principle, where each class or interface serves a single purpose.**
<br/>

In our case, the Athlete interface is an interface with some actions of an athlete:

```java


public interface Athlete {

    void compete();

    void swim();

    void highJump();

    void longJump();

}

```

### And the implementation:
Suppose that John Doe is a swimming athlete. By implementing the Athlete interface, we have to implement methods like highJump and longJump, which JohnDoe will never use.

```java

public class JohnDoe implements Athlete {

    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }

    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }

    @Override
    public void highJump() {
    }

    @Override
    public void longJump() {
    }
}

```

The same problem will occur for another athlete who might be a field Athlete competing in the high jump and long jump.
<br/>
We will follow the interface segregation principle and refactor the original interface:

```java



public interface Athlete {

    void compete();
}

public interface SwimmingAthlete extends Athlete {

    void swim();

}


public interface JumpingAthlete extends Athlete {

    void highJump();

    void longJump();

}

```

And therefore John Doe will not have to implement actions that he is not capable of performing:



```java

public class JohnDoe implements SwimmingAthlete {

    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }

    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }

}


```


