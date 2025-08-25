// COP 2805C
// Stephanie Ortiz
// Homework 6
//import java.util.*

public class Main {
    public static void main(String[] args) {
        // Cuboid and Cylinder size
        Cuboid cuboid = new Cuboid(8, 12, 95);
        Cylinder cylinder = new Cylinder(30, 59);

        // Compare the volume
        int result = cuboid.compareTo(cylinder);

        // Loop to check which shape is larger or equal
        if (result > 0) {
            System.out.println("Cuboid says: it has the biggest volume.");
        } else if (result < 0) {
            System.out.println("Cylinder says: no I have the greater volume.");
        } else {
            System.out.println("Shape declares, Cubiod and Cylinder are both wrong and are indeed the same volume.");
        }
        } // End Main
    } // End Code
