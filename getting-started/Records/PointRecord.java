package Records;

import Interfaces.IPointRecord;

public record PointRecord(int x, int y) implements IPointRecord  {
  @Override
  public void sayHello() {
    System.out.println("Hey there... This is a PointRecord, and it value is:");
    
    System.out.println(this.toString());

    System.out.println("Bye!!!");
  }
}