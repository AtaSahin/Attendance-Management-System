import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date {
    public static int main() throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        return 0;
    }
    public  void test() throws IOException {
        FileWriter datewrite=new FileWriter("here.txt",true);
        datewrite.write(main());
        datewrite.close();
    }
}