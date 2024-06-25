# COLLECTIONS
- Conlection là kiểu cấu trúc dữ liệu quan trọng dùng để lưu trữ
1. List
 - ArrayList: Lưu trữ các phần tử theo thứ tự thêm vào, có thể thay đổi kích thước động. Tìm kiếm nhanh O(1) cho truy cập ngẫu nhiên.
 - LinkedList: Lưu trữ phần tử dưới dạng liên kết đôi, cho phép chèn và xoá phần tử nhanh. O(1) cho chèn/xoá ở đầu hoặc cuối.
2. Set
 - HashSet: Lưu trữ phần tử không trùng lặp, không duy trì thứ tự. Hiệu suất cao với các thao tác cơ bản (CRUD).
 - LinkedHashSet: Giống như Set nhưng duy trì thứ tự chèn.
 - TreeSet: Lưu các phần tử không trùng lặp và duy trì thứ tự tự nhiên hoặc theo comparator tuỳ chọn. Sử dụng cây Đỏ - Đen (O(log n)) cho các thao tác cơ bản.
3. Queue
 - LinkedList: Có thể coi như là một Queue, hỗ trợ các thao tác chèn/xoá ở đầu/cuối.
 - PriorityQueue: Queue ưu tiên, các phần tủ được sắp xếp dựa trên thứ tự tự nhiên hoặc theo comparator tuỳ chọn. Hiệu suất tốt cho các thao tác thêm/loại bỏ các phần tử ưu tiên (O(log n)).
4. Map
 - HashMap: Lưu trữ dữ liệu theo các cặp Key - Value, không duy trì thứ tự. Hiệu suất cao (O(1)) cho các thao tác cơ bản.
 - LinkedHashMap: Giống như HashMap nhưng duy trì thứ tự theo thứ tự chèn hoặc truy cập.
 - TreeMap: Lưu trữ các cặp Key - Value theo thứ tự tự nhiên của Key hoặc theo Comparator tuỳ chọn. Sử dụng cây Đỏ - Đen (O(log n)) với các thao tác cơ bản.
5. Stack
 - Stack được triển khai dự trên lớp Vector, tuân theo nguyên tắc LIFO (Last In First Out), hỗ trợ các thao tác Pop, Push, Peek.
6. Các Interface quan trọng:
 - Collection: Interface giống hầu hết các Collection cung cấp các thao tác cơ bản như add, remove, size, contain...
 - List: Mở rộng từ Collection, dành cho các Collection có thứ tự.
 - Set: Mở rộng từ Collection, dành cho các Collection không trùng lặp.
 - Queue: Mở rộng từ Collection, dành cho các Collection tuân theo quy tắc FIFO (Fisrt In First Out).
 - Map: Không mở rộng từ Collection, dành cho các phần tử lưu trữ theo Key - Value.
 7. Khác
 - Collections: Cung cấp các phương thức tĩnh để thao tác với các Collection như sort, search, reverse, ...
 - Arrays: Cung cấp các phương thức tĩnh để thao tác với mảng như sort, binary search, chuyển mảng thành danh sách, ...
 8. Sử Dụng Generics
 - Cho phép xác định kiểu dữ liệu mà Collection sẽ lưu trữ, phát hiện lỗi biên dịch và đảm bảo an toàn dữ liệu.