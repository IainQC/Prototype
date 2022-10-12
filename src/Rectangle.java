import java.util.Objects;

public class Rectangle extends Shape{

    private int width, height;


    //Constructeur par défaut
    public Rectangle() {
    }

    //Constructeur avec parametre
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Shape aCopier, int width, int height) {
        super(aCopier);
        this.width = width;
        this.height = height;
    }

    //Constructeur de copie
    public Rectangle(Rectangle aCopier){
        super(aCopier);
        if(aCopier!=null) {
            this.height = aCopier.height;
            this.width = aCopier.width;
        }
    }

    @Override
    public Shape clone(){

        return new Rectangle(this);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

}
