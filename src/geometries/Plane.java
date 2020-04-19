package geometries;

import primitives.Point3D;
import primitives.Vector;


public class Plane implements Geometry {
    Point3D _point;
    Vector _normal;

    public Plane(Point3D p1,Point3D p2, Point3D p3){
        _point = new Point3D(p1);
        _normal = null;
    }

    public Plane(Point3D point, Vector normal){
        _point = point;
        _normal = normal;
    }

    public Point3D getPoint() {
        return _point;
    }

    @Override
    public Vector getNormal(Point3D p) {
        return _normal;
    }

    public Vector getNormal() {
        return _normal;
    }
}
