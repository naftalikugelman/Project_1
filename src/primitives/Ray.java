package primitives;

import java.util.Objects;

public class Ray {

    Point3D _point;
    Vector _dir;

    public Ray(Point3D point, Vector dir){
        _point = point;
        _dir = dir;
    }

    public Ray(Ray ray){
        _point = new Point3D(ray._point);
        _dir = new Vector(ray._dir);
    }

    public Point3D get_point() {
        return _point;
    }

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
