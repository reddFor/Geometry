import org.example.geometryLibrary.Circle;
import org.example.geometryLibrary.Rectangle;
import org.example.geometryLibrary.Triangle;
import three_Dimensional_Shapes.Cube;
import three_Dimensional_Shapes.Cylinder;
import three_Dimensional_Shapes.Sphere;




public class App {
    public static void main(String[] args) {

        // default figure
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        circle.mathArea();
        circle.mathPerimeter();

        triangle.mathArea();
        triangle.mathPerimeter();

        rectangle.mathArea();
        rectangle.mathPerimeter();

        // 3D figure
        Cube cube = new Cube();
        Cylinder cylinder = new Cylinder();
        Sphere sphere = new Sphere();

        cube.calculateSurfaceArea();
        cylinder.calculateSurfaceArea();
        sphere.calculateSurfaceArea();

        cube.calculateVolume();
        cylinder.calculateVolume();
        sphere.calculateVolume();
    }
}
