# ENCAPSULATION
Đói gói là quá trình che giấu các chi tiết triển khai của một đối tượng và chỉ cung cấp các phương thức cần thiết để thao tác với đối tượng đó.Trong java tính đóng gọi thể hiện qua các từ khoá truy (*Access modifier*) cập như `private`, `protected`, `public`.

- `default`: Truy cập trong nội bô package.
- `private`: Truy cập trong nội bộ lớp.
- `public` : Thành phần công khai, truy cập tự do bên ngoài.
- `protected`: Thành phần được bảo vệ, bị hạn chế truy cập từ bên ngoài.
    | AC | Class | Package | Subclass | Out Package |
    |----|-------|---------|----------|-------------|
    | Pri|   O   |    X    |     X    |      X      |
    | Def|   O   |    O    |     X    |      X      |
    | Pro|   O   |    O    |     O    |      X      |
    | Pub|   O   |    O    |     O    |      X      |

Tính đóng gói giúp bảo vệ dữ liệu và kiểm soát dữ liệu được truy cập và cập nhật, từ đó giúp chương trình dễ bảo trì và ít lỗi hơn.

```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
```