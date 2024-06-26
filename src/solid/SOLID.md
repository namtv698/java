# SOLID
## (S) Single Responsibility Principle
Một lớp chỉ lên đảm nhận một trách nhiệm duy nhất. Điều này giúp lớp dễ bảo trì và mở rộng
```java
// Trước khi áp dụng SRP
public class UserService {
    public void createUser(User user) {
        // logic tạo người dùng
    }

    public void sendEmail(User user) {
        // logic gửi email
    }

    public void generateReport(User user) {
        // logic tạo báo cáo
    }
}

// Sau khi áp dụng SRP
public class UserService {
    public void createUser(User user) {
        // logic tạo người dùng
    }
}

public class EmailService {
    public void sendEmail(User user) {
        // logic gửi email
    }
}

public class ReportService {
    public void generateReport(User user) {
        // logic tạo báo cáo
    }
}
```

## (O) Open / Close Principle
Các thực thể phần mềm (lớp, module, hàm...) nên được mở để mở rộng và được đóng để sửa đổi. Điều này có nghĩa là bạn có thể mở rộng chức năng của một thực thể mà không cần thay đổi mã nguồn hiện tại.
```java
// Trước khi áp dụng OCP
public class AreaCalculator {
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}

// Sau khi áp dụng OCP
public interface Shape {
    double calculateArea();
}

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
```
## Liskov Subtitution (LSB)
Các đối tượng của lớp con phải có thể thay thể bới đối tượng của lớp cha mà không làm thay đổi tính đúng đắn của chương trình.
```java
// Trước khi áp dụng LSP
public class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}

// Sau khi áp dụng LSP
public abstract class Bird {
    // Các phương thức chung cho các loài chim
}

public interface Flyable {
    void fly();
}

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

public class Ostrich extends Bird {
    // Ostrich không implement Flyable vì nó không bay được
}
```
## Nguyên tắc Interface Segregation Principle (ISP)
Một lớp không nên bị ép buộc để implement các interface mà nó không sử dụng. Thay vì tạo một Interface lớn, hãy tạo nhiều Interface nhỏ và cụ thể.
```java
// Trước khi áp dụng ISP
public interface Worker {
    void work();
    void eat();
}

public class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void eat() {
        // Robot không cần ăn
    }
}

// Sau khi áp dụng ISP
public interface Workable {
    void work();
}

public interface Eatable {
    void eat();
}

public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}

public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Working");
    }
}
```
## Dependency Inversion Principle(DIP)
Các module cấp cao không nên phụ thuộc vào các module cấp thấp. Cả 2 nên phụ thuộc vào các Abstraction. Abstraction không nên phụ thuộc vào chi tiết mà chỉ nên phụ thuộc vào abstraction.
```java
// Trước khi áp dụng DIP
public class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is on");
    }

    public void turnOff() {
        System.out.println("LightBulb is off");
    }
}

public class Switch {
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate(String command) {
        if ("ON".equals(command)) {
            lightBulb.turnOn();
        } else if ("OFF".equals(command)) {
            lightBulb.turnOff();
        }
    }
}

// Sau khi áp dụng DIP
public interface Switchable {
    void turnOn();
    void turnOff();
}

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is off");
    }
}

public class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String command) {
        if ("ON".equals(command)) {
            device.turnOn();
        } else if ("OFF".equals(command)) {
            device.turnOff();
        }
    }
}
```
Nguyên tắc SOLID là nền tảng quan trọng giúp phát triển phần mềm có tính bảo trì cao, dễ mở rộng và giảm thiểu lỗi. Việc áp dụng đúng các nguyên tắc này sẽ giúp bạn thiết kế và viết mã nguồn chất lượng, đáp ứng tốt yêu cầu các dự án phần mềm.