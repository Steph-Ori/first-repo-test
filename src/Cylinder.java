class Cylinder extends Shape3D {
    private int radius, height;


    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // Why did Pi break up with the decimal system?
    //...
    //Because it couldn’t stop repeating itself!
    @Override
    public double Volume() {
        return Math.PI * radius * radius * height;
    }
}