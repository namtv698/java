## JAVA
- JDK (Java development kit) là một bộ công cụ phát triển ứng dụng java. JDK bao gồm
    + JRE (Java Runtime Environment): Cung cấp môi trường cần thiết để chạy các ứng dụng java.
    + Trình biên dịch (Compiler): Dịch mã nguồn thành byteCode, máy ảo (JVM) có thể thực thi.
    + Công cụ gỡ lỗi(Debugger): Giúp kiểm tra và sửa lỗi mã nguồn.
    + Các thư viện lớp Java tiêu chuẩn: Bao gồm các API và các thư viện Java mà lập trình viên có thể sử dụng để phát triển ứng dung.
# ĐỒNG BỘ (Synchronization)
 - Tập chung vào quản lý truy cập tài nguyên dùng chung.
 - Thường sử dụng trong bối cảnh lập trình đa luông để đảm bảo tính nhất quán của dữ liệu
 - Có thể xảy ra hiện tượng (block) tắc nghẽn dữ liệu.
# BẤT ĐỒNG BỘ (Asynchronous)
 - Tập chung vào việc thực hiện các nhiệm vụ mà không cần chặn luồng hiện tại
 - Thường sử dụng trong các ứng dụng giao diện người dùng và IO để cải thiện hiệu suất và trải nghiệm người dùng.
 - Sử dụng các cơ chế như callbacks, features và các thư viện lập trình phản ứng (reactive programming) như Project Reactor và RxJava.