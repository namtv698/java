# List
1. `ArrayList`:
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
2. `LinkedList`:
 - 