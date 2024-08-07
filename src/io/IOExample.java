import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExample {
    public static void main(String[] args) {
        File file = new File("./src/resources/test1.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Hello World \n");
            fw.write("Hello World \n");
            fw.write("Hello World \n");
            fw.write("Hello World \n");
            fw.write("Hello World \n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
