package moveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint  moveablePoint = new MoveablePoint(10f,10f,5f,5f);
        System.out.println(moveablePoint);
        moveablePoint.move(moveablePoint);
        System.out.println(moveablePoint);
    }
}
