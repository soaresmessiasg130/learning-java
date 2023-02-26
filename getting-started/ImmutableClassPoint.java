public class ImmutableClassPoint {
  private final int x;
  private final int y;
  
  public ImmutableClassPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}