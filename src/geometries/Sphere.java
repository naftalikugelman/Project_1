package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * The type Sphere.
 */
public class Sphere extends RadialGeometry {
    /**
     * The Center.
     */
    Point3D _center;

    /**
     * Instantiates a new Sphere.
     *
     * @param radius the radius
     * @param center the center
     */
    public Sphere(double radius,Point3D center) {
        super(radius);
        _center =new Point3D(center) ;
    }

    /**
     * Gets middle.
     *
     * @return the middle
     */
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
