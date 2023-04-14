package printer3D;

public class YAxis implements  VerticalMoveable {
    private int position;

    public YAxis() {
        position = 0;
    }

    public void move(int distance) {
        moveHorizontal(distance);
    }

    public void moveHorizontal(int distance) {
        int newPosition = position + distance;
        if (newPosition < -100 || newPosition > 100) {
            System.out.println("Error: Cannot move Y-axis horizontally outside range 0 to 200mm");
            System.exit(2);
        } else {
            position = newPosition;
            System.out.println("Y-axis moved horizontally to position " + position + " mm");
        }
    }
    public void moveVertical(int distance) {
        int newPosition = position + distance;
        if (newPosition < 0 || newPosition > 200) {
            System.out.println("Error: Cannot move Y-axis vertically outside range 0 to 200 mm");
            System.exit(2);
        } else {
            position = newPosition;
            System.out.println("Y-axis moved vertically to position " + position + " mm");
        }
    }
}