package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

/**
 * The type Cylinder.
 *
 * @author Naftali Kugelman
 */
public class Cylinder extends Tube {
    /**
     * The Height.
     */
    double _height;

    /**
     * Instantiates a new Cylinder.
     *
     * @param radius the radius
     * @param ray    the ray
     * @param height the height
     */
    public Cylinder(double radius, Ray ray, double height){
        super(radius,ray);
        _height = height;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
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
