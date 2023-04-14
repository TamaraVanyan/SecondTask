package printer3D;

public class Printer3D {
    private XAxis xAxis;
    private YAxis yAxis;
    private ZAxis zAxis;

    public Printer3D() {
        xAxis = new XAxis();
        yAxis = new YAxis();
        zAxis = new ZAxis();
    }

    public void moveX(int distance) {
        xAxis.move(distance);
    }

    public void moveYHorizontal(int distance) {
        yAxis.moveHorizontal(distance);
    }

    public void moveYVertical(int distance) {
        yAxis.moveVertical(distance);
    }

    public void moveZ(int distance) {
        zAxis.move(distance);
    }
}