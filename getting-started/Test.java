import Records.PointRecord;
import Records.RangeRecord;

public class Test {
  public static void main(String[] args) {
    var rangeRecord = new RangeRecord(100, 200);

    System.out.println(rangeRecord.toString());

    System.out.println(rangeRecord.end());
    
    System.out.println(rangeRecord.endOf());

    // var pointRecord = new PointRecord(23, 32);

    // pointRecord.sayHello();

    // var immutableClassPoint = new ImmutableClassPoint(10, 20);

    // System.out.println(immutableClassPoint.getX());
    // System.out.println(immutableClassPoint.getY());
  }
}
