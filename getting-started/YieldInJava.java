public class YieldInJava {
  public static void main(String[] args) {
    System.out.println(calculate(Day.MONDAY));
  }

  public static String calculate(Day d) {
    return switch (d) {
      case SATURDAY, SUNDAY -> "week-end";
      default -> {
        int remainingDays = 5 - d.ordinal();

        yield remainingDays + "";
      }
    };
  }

  enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
  }
}
