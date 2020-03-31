package primitives;

public class Point3D {

    public static final Point3D ZERO = new Point3D(0.0, 0.0, 0.0);

    private Coordinate _x;
    private Coordinate _y;
    private Coordinate _z;

    public Point3D(Coordinate x, Coordinate y, Coordinate z){
        _x = new Coordinate(x);
        _y = new Coordinate(y);
        _z = new Coordinate(z);
    }

    public Point3D(double x, double y, double z){
        _x = new Coordinate(x);
        _y = new Coordinate(y);
        _z = new Coordinate(z);
    }

    public Point3D(Point3D point){
        _x = point._x;
        _y = point._y;
        _z = point._z;
    }

    public Coordinate get_x() {
        return _x;
    }
    public Coordinate get_y() {
        return _y;
    }
    public Coordinate get_z() {
        return _z;
    }

    public Vector subtract(Point3D point2) {
        return new Vector(get_x()._coord-point2.get_x()._coord,
                get_y()._coord-point2.get_y()._coord,
                get_z()._coord-point2.get_z()._coord);
    }

    public Point3D add(Vector vec) {
        return new Point3D(_x._coord + vec._head._x._coord,
                _y._coord + vec._head._y._coord,
                _z._coord + vec._head._z._coord);
    }
    public double distanceSquared(Point3D point){
        return ((point.get_x()._coord -get_x()._coord)*(point.get_x()._coord -get_x()._coord) +
                (point.get_y()._coord -get_y()._coord)*(point.get_y()._coord -get_y()._coord) +
                (point.get_z()._coord -get_z()._coord)*(point.get_z()._coord -get_z()._coord));
    }

    public double distance(Point3D point){
        return Math.sqrt(distanceSquared(point));
    }
}
