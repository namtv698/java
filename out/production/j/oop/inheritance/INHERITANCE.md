# INHERITANCE
Cho phép tạo ra các lớp mới dựa trên các lớp đã tồn tại, giúp tái sử dụng mã nguồn và tạo các hệ thống phân cấp phức tạp. Tính kế thừa giúp chúng ta tạo ra các lớp có mối quan hệ "là một" (is-a) và tái sử dụng các thuộc tinhhs và phương thức từ lớp cha, từ đó giảm thiểu mã nguồn trùng lặp và tăng tính lính hoạt của chương trình.
```java
public class Animal {
    protected String name;

    public void eat() {
        System.out.println("This animal is eating.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}
```