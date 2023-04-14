package printer3D;

public class XAxis implements HorizontalMoveable {
    private int position;

    public XAxis() {
        position = 0;
    }

    public void move(int distance) {
        moveHorizontal(distance);
    }

    public void moveHorizontal(int distance) {
        int newPosition = position + distance;
        if (newPosition < -100 || newPosition > 100) {
            System.out.println("Error: Cannot move X-axis outside range 0 to 200");
            System.exit(2);
        } else {
            position = newPosition;
            System.out.println("X-axis moved to position " + position);
        }
    }
}