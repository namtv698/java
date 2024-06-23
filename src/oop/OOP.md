# OOP (Object Oriented Programming): 
Một phương pháp lập trình dựa trên khái niệm "đối tượng" (object), giúp lập trình viên thiết kế phần mềm theo cách gần gũi với thế giới thực hơn. Dưới đây là khái niệm cơ bản về OOP:
 1. **Đối tượng** (Object): Đối tượng là một thực thể trong chương trình có trạng thái và hành vi. Ví dụ: một chiếc xe có trạng thái (Màu sắc, số chỗ ngồi ...) và hành vi (dừng chạy...).
 2. **Lớp** (class): Lớp mà một khuôn mãu để tạo ra các đối tượng. Nó định nghĩa các thuộc tính (trạng thái) và phương thức (hành vi) mà đối tượng có. Ví dụ: lớp "Xe" có các thuộc tính như "màu sắc", "số chỗ ngồi" và các phương thức như "chạy, dừng".
 3. [**Đóng gói**](/src/oop/encapsulation/ENCAPSULATION.md) (Encapsulation): Đóng gói là việc gom các nhóm dữ liệu (thuộc tính) và các phương thức (hành vi) lại với nhau thành một đơn vị lớp (class), và che giấu các chi tiết nội bộ của đối tượng với bên ngoài. Điều này giúp bảo vệ dữ liệu và duy trì tính nhất quán.
 4. [**Kế thừa**](/src/oop/inheritance/INHERITANCE.md) (Inheritance): Kế thừa cho phép một lớp con (subclass) kế thừa các thuộc tính và hành vi của lớp cha (superclass). Điều này giúp tái sử dụng mã nguồn và mở rộng chức năng mà không cần thiết phải viết lại từ đầu. Ví dự lớp "xe hơi" có thể kế thừa từ lớp "xe".
 5. [**Đa hình**](/src/oop/polymorphism/POLYMORPHISM.md) (Polymorphism): Đa hình cho phép một phương thức có thể có nhiều hình thức khác nhau. Điều này có nghĩa là cùng một phương thức có thể có cách triển khai khác nhau tuỳ thuộc vào đối tượng gọi nó. Ví dụ: phương thức "chạy" của lớp "xe hơi" có thể khác với phương thức chạy của lớp "xe đạp".
 6. [**Trừu tượng**](/src/oop/abstraction/ABSTRACTION.md) (Abstraction): Trừu tượng là việc tác các chi tiết không cần thiết ra khỏi một đối tượng, chỉ dữ lại những gì cần thiết để một đối tượng hoạt động. Điều này giúp giảm độ phức tạp và tăng tính dễ hiểu của mã nguồn...
 7. **Final**
  - Biến `final`: Giá trị của biến không thể thay đổi sau khi đã được gán 1 lần.
  - Phương thức `final`: Không thể ghi đè (override) bởi các lớp con.
  - Lớp `final`: Không thể bị kế thừa (inherit).
 8. **Static**:
  - Biến `static`: Thuộc về lớp (class) chứ không thuộc về đối tượng (object).
  - Phương thức `static`: Có thể được gọi mà không cần tạo đối tượng của lớp.
  - Khối `static`: Được thực hiện khi lớp được nạp vào bộ nhớ.
9. [**ENUM**](/src/oop/enum/ENUM.md)