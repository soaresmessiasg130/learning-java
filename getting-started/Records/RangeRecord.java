package Records;

public record RangeRecord (int start, int end) {
  public RangeRecord {
    if (start < 0 || start >= end) {
      throw new IllegalArgumentException("Start cannot be lesser than 0 and End must be greeter than Start.");
    }
  }

  public String endOf() {
    return "The end of Range is: " + end;
  }
}
