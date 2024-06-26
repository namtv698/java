# List
1. `ArrayList`
 - Mô tả: Sử dụng mảng động bên trong để lưu trữ các phần tử.
 - Đặc điểm:
    + Thứ tự của các phần tử dựa trên thứ tự chèn vào.
    + Cho phép truy cập ngãu nhiên, nhánh chóng O(1).
    + Kích thước của `ArrayList` có thể động.
 - Ưu điểm:
    + Truy cập ngẫu nhiên rất nhanh.
    + Hiệu quả khi thực hiện các thao tác thêm/xoá ở cuối danh sách.
 - Nhược điểm:
    + Chèn/xoá phần tử ở giữa hoặc đầu danh sách chậm O(n).
    + Mỗi khi kích thước mảng bên trong được thay đổi, cần phải sao chép toàn bộ các phần tử sang mảng, tốn tài nguyên.
2. `LinkedList`
 - Mô tả: Sử dụng danh sách liên kết đôi (doubly Linkedlist) để lưu trữ các phần tử.
 - Đặc điểm: 
   + Thứ tự các phần tử dựa trên thứ tự chèn vào.
   + Mỗi phần tử chứa một liên kế đến phần tử phía trước và phần từ phía sau.
 - Ưu điểm:
    + Chèn và xoá phần tử đầu và cuối nhanh O(1), các phần tử ở giữa O(n).
    + Không cần thay đổi kích thước.
 - Nhược điểm:
    + Truy cập ngẫu nhiên chậm O(n).
    + Tốn nhiều bộ nhớ hơn do cần lưu các liên kết.
3. `Vector`
 - Mô tả: Giống như ArrayList nhưng được đồng bộ hoá.
 - Đặc điểm:
    + Thứ tự các phần từ dựa trên thứ tự truyền vào.
    + Đồng bộ hoá tất cả các phương thức, an toàn cho các ứng dụng đa luồng.
 - Ưu điểm: Đồng bộ hoá, an toàn cho đa luồng.
 - Nhược điểm: Hiệu suất chậm hơn ArrayList do đồng bộ hoá. Ít được sử dụng hiện tại.
4. `CopyOnWriteArrayList`
 - Mô tả: Là một triển khai của `List` an toàn cho đa luồng, sử dụng chiến lược copy trên ghi(copy on write).
 - Đặc điểm: Bất cứ khi nào có thao tác một bản sao của danh sách sẽ được tạo ra. Đọc rất nhanh, ghi rất chậm.
 - Ưu điểm: An toàn cho đa luồng mà không cần đồng bộ hoá thử công, hiệu quả cho các bản ghi đọc nhiều ghi ít.
 - Nhược điểm: Hiệu suất chậm do phải sao chép toàn bộ danh sách, tốn bộ nhớ khi thực nhiện nhiều thao tác ghi.