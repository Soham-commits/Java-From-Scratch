import java.time.*;
public class display {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalTime now = LocalTime.now();
    LocalDate after10 = today.plusDays(10);
    System.out.println("Date: " + today);
    System.out.println("Time: " + now.truncatedTo(java.time.temporal.ChronoUnit.SECONDS));
    System.out.println("Date after 10 days: " + after10);
  }
}