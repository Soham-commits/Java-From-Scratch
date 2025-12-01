import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Convert {
    public static void main(String[] args) {
        // String date
        String dateString = "2025-11-20";
        
        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(dateString);
        System.out.println("Parsed date: " + date);
        
        // Format to custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}
