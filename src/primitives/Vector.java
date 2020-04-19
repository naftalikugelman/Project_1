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

    public Point3D get_head() {
        return _head;
    }

    public Vector add(Vector vec){
        return new Vector(_head.add(vec));
    }

    public Vector subtract(Vector vec){
        return new Vector(_head.subtract(vec._head));
    }

    public Vector scale(double scalar){
        return new Vector(new Point3D(scalar * _head.get_x()._coord,
                scalar * _head.get_y()._coord,
                scalar * _head.get_z()._coord));
    }

    public double dotProduct(Vector vec){
        return(_head.get_x()._coord* vec._head.get_x()._coord +
                _head.get_y()._coord* vec._head.get_y()._coord +
                _head.get_z()._coord* vec._head.get_z()._coord);
    }

    public Vector crossProduct(Vector vec){
        return new Vector(new Point3D(
                _head.get_y()._coord*vec._head.get_z()._coord - _head.get_z()._coord*_head.get_y()._coord,
                _head.get_z()._coord*_head.get_x()._coord - _head.get_x()._coord*_head.get_z()._coord,
                _head.get_x()._coord*_head.get_y()._coord - _head.get_y()._coord*_head.get_x()._coord));
    }

    public double lengthSquared(){
        return (_head.get_x()._coord*_head.get_x()._coord +
                _head.get_y()._coord*_head.get_y()._coord +
                _head.get_z()._coord*_head.get_z()._coord);
    }

    public double length(Vector vec){
        return Math.sqrt(vec.lengthSquared());
    }



}
