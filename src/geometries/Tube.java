package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

/**
 * The type Tube.
 */
public class Tube extends RadialGeometry{

    /**
     * The Axis ray.
     */
    Ray _axisRay;

    /**
     * Instantiates a new Tube.
     *
     * @param radius  the radius
     * @param axisRay the axis ray
     */
    public Tube(double radius, Ray axisRay){
        super(radius);
        _axisRay = axisRay;
    }

    /**
     * Gets axis ray.
     *
     * @return the axis ray
     */
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
