import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cercle c1 = new Cercle();
        c1.x=10;
        c1.y=10;
        c1.rayon=15;
        c1.color="red";

        Cercle c2 = c1;

        Cercle autreCercle= (Cercle)c1.clone();

        Rectangle r1 = new Rectangle(15,15,"blue",20,30);
        Rectangle autreRectangle = (Rectangle) r1.clone();

    }
}