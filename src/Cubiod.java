class Cuboid extends Shape3D {
    private int width, depth, height;


    public Cuboid(int width, int depth, int height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }


    @Override
    public double Volume() {
        return width * depth * height;
    }
}