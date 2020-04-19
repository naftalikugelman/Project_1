package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Cylinder extends Tube {
    double _height;

    public Cylinder(double radius, Ray ray, double height){
        super(radius,ray);
        _height = height;
    }
    public double get_height() {
        return _height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "_height=" + _height +
                '}';
    }

    @Override
    public Vector getNormal(Point3D point) {
        return super.getNormal(point);
    }
}
