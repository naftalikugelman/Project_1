package primitives;

public class Vector {

    Point3D _head;

    public  Vector(Coordinate x, Coordinate y, Coordinate z){
        if (Point3D.ZERO.equals(new Point3D(x, y, z)))
            throw new IllegalArgumentException("Point3D (0,0,0) can't be Vector ZERO");
        _head = new Point3D(x, y, z);
    }

    public Vector(double x, double y, double z) {
        if (Point3D.ZERO.equals(new Point3D(x, y, z)))
            throw new IllegalArgumentException("Point3D (0,0,0) can't be Vector ZERO");
        _head = new Point3D(x, y, z);
    }

    public Vector(Point3D point){
        if (point.equals(Point3D.ZERO))
            throw new IllegalArgumentException("Point3D (0,0,0) can't be Vector ZERO");
        _head = new Point3D(point.get_x()._coord, point.get_y()._coord,point.get_z()._coord);
    }

    public Vector(Vector vec) {
        this(vec._head);
    }





}
