package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * The type Radial geometry.
 */
public abstract class RadialGeometry implements Geometry{

    /**
     * The Radius.
     */
    double _radius;

    /**
     * Instantiates a new Radial geometry.
     *
     * @param radius the radius
     */
    public RadialGeometry(double radius){
        _radius = radius;
    }

    /**
     * Instantiates a new Radial geometry.
     *
     * @param radialGeometry the radial geometry
     */
    public RadialGeometry(RadialGeometry radialGeometry){
        _radius = radialGeometry._radius;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return _radius;
    }

    @Override
    public String toString() {
        return "RadialGeometry{" +
                "_radius=" + _radius +
                '}';
    }


}
