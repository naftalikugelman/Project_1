package primitives;

import java.util.Objects;

/**
 * The type Ray.
 * @author Naftali Kugelman
 */
public class Ray {

    /**
     * The Point.
     */
    Point3D _point;
    /**
     * The Dir.
     */
    Vector _dir;

    /**
     * Instantiates a new Ray.
     *
     * @param point the point
     * @param dir   the dir
     */
    public Ray(Point3D point, Vector dir){
        _point = point;
        _dir = dir;
    }

    /**
     * Instantiates a new Ray.
     *
     * @param ray the ray
     */
    public Ray(Ray ray){
        _point = new Point3D(ray._point);
        _dir = new Vector(ray._dir);
    }

    /**
     * Gets point.
     *
     * @return the point
     */
    public Point3D get_point() {
        return _point;
    }

    /**
     * Gets dir.
     *
     * @return the dir
     */
    public Vector get_dir() {
        return _dir;
    }

    @Override
    public String toString() {
        return "Ray{" +
                "_point=" + _point +
                ", _dir=" + _dir +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ray)) return false;
        Ray ray = (Ray) o;
        return Objects.equals(_point, ray._point) &&
                Objects.equals(_dir, ray._dir);
    }
}
