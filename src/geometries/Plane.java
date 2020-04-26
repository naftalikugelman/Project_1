package geometries;

import primitives.Point3D;
import primitives.Vector;


/**
 * The type Plane.
 */
public class Plane implements Geometry {
    /**
     * The Point.
     */
    Point3D _point;
    /**
     * The Normal.
     */
    Vector _normal;

    /**
     * Instantiates a new Plane.
     *
     * @param p1 the p 1
     * @param p2 the p 2
     * @param p3 the p 3
     */
    public Plane(Point3D p1,Point3D p2, Point3D p3){
        _point = new Point3D(p1);
        _normal = null;
    }

    /**
     * Instantiates a new Plane.
     *
     * @param point  the point
     * @param normal the normal
     */
    public Plane(Point3D point, Vector normal){
        _point = point;
        _normal = normal;
    }

    /**
     * Gets point.
     *
     * @return the point
     */
    public Point3D getPoint() {
        return _point;
    }

    @Override
    public Vector getNormal(Point3D p) {
        return _normal;
    }

    /**
     * Gets normal.
     *
     * @return the normal
     */
    public Vector getNormal() {
        return _normal;
    }
}
