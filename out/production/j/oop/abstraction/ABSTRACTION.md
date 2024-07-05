# ABSTRACTION
`Tính trừu tượng` giúp che giấu các chi tiết và chỉ hiển thị các chức năng cần thiết cho người dùng. Điều này giảm độ phức tạp của hệ thống và tăng tính bảo mật của dữ liệu.
```java
public abstract class Animal {
    protected String name;

    public abstract void makeSound();

    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
```