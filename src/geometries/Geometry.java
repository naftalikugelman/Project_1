package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * The interface Geometry.
 */
public interface Geometry {
    /**
     * Gets normal.
     *
     * @param point the point
     * @return the normal
     */
    Vector getNormal(Point3D point);
}
