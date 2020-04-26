package primitives;

import java.util.Objects;

/**
 * The type Vector.
 *
 * @author Naftali Kugelman
 */
public class Vector {

    /**
     * The Head.
     *
     *
     */
    Point3D _head;

    /**
     * Instantiates a new Vector.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public  Vector(Coordinate x, Coordinate y, Coordinate z){
        if (Point3D.ZERO.equals(new Point3D(x, y, z)))
            throw new IllegalArgumentException("Point3D (0,0,0) can't be Vector ZERO");
        _head = new Point3D(x, y, z);
    }

    /**
     * Instantiates a new Vector.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public Vector(double x, double y, double z) {
        if (Point3D.ZERO.equals(new Point3D(x, y, z)))
            throw new IllegalArgumentException("Point3D (0,0,0) can't be Vector ZERO");
        _head = new Point3D(x, y, z);
    }

    /**
     * Instantiates a new Vector.
     *
     * @param point the point
     */
    public Vector(Point3D point){
        if (point.equals(Point3D.ZERO))
            throw new IllegalArgumentException("Point3D (0,0,0) can't be Vector ZERO");
        _head = new Point3D(point.get_x()._coord, point.get_y()._coord,point.get_z()._coord);
    }

    /**
     * Instantiates a new Vector.
     *
     * @param vec the vec
     */
    public Vector(Vector vec) {
        this(vec._head);
    }

    /**
     * Gets head.
     *
     * @return the head
     */
    public Point3D get_head() {
        return _head;
    }

    /**
     * Add vector.
     *
     * @param vec the vec
     * @return the vector
     */
    public Vector add(Vector vec){
        return new Vector(_head.add(vec));
    }

    /**
     * Subtract vector.
     *
     * @param vec the vec
     * @return the vector
     */
    public Vector subtract(Vector vec){
        return new Vector(_head.subtract(vec._head));
    }

    /**
     * Scale vector.
     *
     * @param scalar the scalar
     * @return the vector
     */
    public Vector scale(double scalar){
        return new Vector(new Point3D(scalar * _head.get_x()._coord,
                scalar * _head.get_y()._coord,
                scalar * _head.get_z()._coord));
    }

    /**
     * Dot product double.
     *
     * @param vec the vec
     * @return the double
     */
    public double dotProduct(Vector vec){
        return(_head.get_x()._coord* vec._head.get_x()._coord +
                _head.get_y()._coord* vec._head.get_y()._coord +
                _head.get_z()._coord* vec._head.get_z()._coord);
    }

    /**
     * Cross product vector.
     *
     * @param vec the vec
     * @return the vector
     */
    public Vector crossProduct(Vector vec){
        return new Vector(new Point3D(
                _head.get_y()._coord*vec._head.get_z()._coord - _head.get_z()._coord*vec._head.get_y()._coord,
                _head.get_z()._coord*vec._head.get_x()._coord - _head.get_x()._coord*vec._head.get_z()._coord,
                _head.get_x()._coord*vec._head.get_y()._coord - _head.get_y()._coord*vec._head.get_x()._coord));
    }

    /**
     * Length squared double.
     *
     * @return the double
     */
    public double lengthSquared(){
        return (_head.get_x()._coord*_head.get_x()._coord +
                _head.get_y()._coord*_head.get_y()._coord +
                _head.get_z()._coord*_head.get_z()._coord);
    }


    /**
     * Length double.
     *
     * @return the double
     */
    public double length(){
        return Math.sqrt(lengthSquared());
    }

    /**
     * Normalize vector.
     *
     * @return the vector
     */
    public  Vector normalize(){
        double length = this.length();
        if (length==0)
            throw new ArithmeticException("Divide by zero!");
        _head = new Point3D(_head.get_x()._coord/length(),
                _head.get_y()._coord/length(),
                _head.get_z()._coord/length());
        return this;
    }

    /**
     * Normalized vector.
     *
     * @return the vector
     */
    public  Vector normalized(){
        return new Vector(_head).normalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector)) return false;
        Vector vector = (Vector) o;
        return Objects.equals(_head, vector._head);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "_head=" + _head +
                '}';
    }
}
