import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {
  public static void main(String... args) {
    String text = """
        This is a long long long text.
        Breaks lines and wrap
        words. Hello, world!!!
        """;

    try (Scanner scanner = new Scanner(text)) {
      scanner
        .findAll("long")
        .map(MatchResult::group)
        .forEach(System.out::println);
    }
  }
}