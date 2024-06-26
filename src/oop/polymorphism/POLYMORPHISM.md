# POLYMORPHISM
Đa hình cho phép các đối tượng của các lớp khác nhau có thể được xử lý thông qua cùng một giao diện. Tính đa hình cho mã nguồn trở lên linh hoạt và dễ mở rộng hơn, cho phép các phương thức có thể hoạt động với nhiều kiểu dữ liệu và kịch bản khác nhau.
```java
public interface Animal {
    void makeSound();
}

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();
    }
}
```