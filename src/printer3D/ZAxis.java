package printer3D;

public class ZAxis implements VerticalMoveable {
    private int position;

    public ZAxis() {
        position = 0;
    }

    public void move(int distance) {
        moveVertical(distance);
    }

    public void moveVertical(int distance) {
        int newPosition = position + distance;
        if (newPosition < 0 || newPosition > 235) {
            System.out.println("Error: Cannot move Z-axis outside range 0 to 235 mm");
        } else {
            position = newPosition;
            System.out.println("Z-axis moved to position " + position + " mm");
        }
    }
}