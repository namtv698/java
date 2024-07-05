# IO
Cho phép thực hiện các hoạt động đọc và ghi dữ liệu đến từ các nguồn khác nhau như tệp tin, dữ liệu mạng, hoặc thiết bị ngoại vi.
Sử dụng với các package chính `java.io` và `java.nio`.
- File I/O (java.io): Dùng để thao tác với tệp tin trên hệ thông tệp tin.
```java
import java.io.*;

public class FileExample {
public static void main(String[] args) {
try {
File file = new File("test1.txt");
FileWriter writer = new FileWriter(file);
writer.write("Hello, World!");
writer.close();

            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            System.out.println(line);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
- Network I/O (java.net): Dùng để thực hiện các hoạt động mạng như kết nối TCP/IP, HTTP...
```java
import java.io.*;
import java.net.*;

public class NetworkExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```