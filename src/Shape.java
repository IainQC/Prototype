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

    public abstract Shape clone();
}
