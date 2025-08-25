abstract class Shape3D implements Comparable<Shape3D> {
    //
    public abstract double Volume();

    // More Shapes
    @Override
    public int compareTo(Shape3D other) {
        return Double.compare(this.Volume(), other.Volume());
    }
}
