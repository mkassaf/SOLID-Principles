# Dependency Inversion Principle

The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules; both should depend on abstractions. Abstractions should not depend on details.

<br/>
In order to implement the new functionality, we create a lower-level Book class and a higher-level Shelf class. The Book class will allow users to see reviews and read a sample of each book they store on their shelves. The Shelf class will let them add a book to their shelf and customize the shelf. For example, observe the below code.


```java

public class Book {

    void seeReviews() {
         ...
    }

    void readSample() {
         ...
    }
}


public class Shelf {

     Book book;

     void addBook(Book book) {
          ...
     }

     void customizeShelf() {
          ...
     }
}


```

Everything looks fine, but as the high-level Shelf class depends on the low-level Book, the above code violates the Dependency Inversion Principle. This becomes clear when the store asks us to enable customers to add DVDs to their shelves, too. In order to fulfil the demand, we create a new DVD class:


```java

public class DVD {

     void seeReviews() {
          ...
     }

     void watchSample() {
          ...
     }
}


```


Now, we should modify the Shelf class so that it can accept DVDs, too. However, this would clearly break the Open/Closed Principle too.

<br/>

The solution is to create an abstraction layer for the lower-level classes (Book and DVD). We’ll do so by introducing the Product interface, both classes will implement it. For example, below code demonstrates the concept.



```java

public interface Product {

    void seeReviews();

    void getSample();

}

public class Book implements Product {

    @Override
    public void seeReviews() { 
          ...
    }

    @Override
    public void getSample() {
          ...
    }
}

public class DVD implements Product {

    @Override
    public void seeReviews() { 
         ...
    }

    @Override  
    public void getSample() {
          ...
    }
}

```

Now, Shelf can reference the Product interface instead of its implementations (Book and DVD). The refactored code also allows us to later introduce new product types (for instance, Magazine) that customers can put on their shelves, too.


```java

public class Shelf {

    Product product;

    void addProduct(Product product) {
          ...
    }

    void customizeShelf() {
          ...
    }
}

```

The above code also follows the Liskov Substitution Principle, as the Product type can be substituted with both of its subtypes (Book and DVD) without breaking the program.






