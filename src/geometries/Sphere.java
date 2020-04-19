package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Sphere extends RadialGeometry {
    Point3D _center;

    public Sphere(double radius,Point3D center) {
        super(radius);
        _center =new Point3D(center) ;
    }

    public Point3D get_middle() {
        return _center;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "_center=" + _center +
                '}';
    }

    @Override
    public Vector getNormal(Point3D point) {
        return null;
    }
}
