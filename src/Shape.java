import java.util.Objects;

public abstract class Shape {
    public int x,y;
    public String color;

    //Constructeur par défaut
    public Shape() {
    }

    public Shape(int x, int y, String color)
    {
        this.x=x;
        this.y=y;
        this.color=color;
    }

    //Constructeur par copie
    public Shape(Shape aCopier) //copie target Shape obj1 = new Shape(obj2)
    {
        if(aCopier != null) {
            this.x = aCopier.x;
            this.y = aCopier.y;
            this.color = aCopier.color;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }

    public abstract Shape clone();
}
