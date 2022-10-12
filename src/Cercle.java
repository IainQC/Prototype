import java.util.Objects;

public class Cercle extends Shape{
    public int rayon;

    public Cercle() {
    }

    //Constructeur de copie
    public Cercle (Cercle aCopier){
       super(aCopier);
       if(aCopier!=null){
           this.rayon=aCopier.rayon;
       }
    }

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    public Cercle(int x, int y, String color, int rayon) {
        super(x, y, color);
        this.rayon = rayon;
    }

    @Override
    public Shape clone() {
        return new Cercle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cercle cercle = (Cercle) o;
        return rayon == cercle.rayon;
    }

}
