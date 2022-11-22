import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
        LocalDateTime date_and_time = LocalDateTime.now();
        System.out.println(date_and_time.format(DateTimeFormatter.ofPattern("dd--MM--yyyy HH:mm:ss.S")));
        System.out.println( "".getClass());
    }
}
