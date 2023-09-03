package ModelElements;

public class Flash {

    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    void Rotate(Angle3D angle){

    }
    void Move(Point3D location){

    }
}
