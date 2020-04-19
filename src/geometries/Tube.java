package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Tube extends RadialGeometry{

    Ray _axisRay;

    public Tube(double radius, Ray axisRay){
        super(radius);
        _axisRay = axisRay;
    }

    public Ray get_axisRay() {
        return _axisRay;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "_axisRay=" + _axisRay +
                '}';
    }

    @Override
    public Vector getNormal(Point3D point) {
        return null;
    }
}
