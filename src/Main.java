import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> l1 = new ArrayList<>();
        List<Shape> lCopie = new ArrayList<>();

        Cercle c1 = new Cercle();
        c1.x=10;
        c1.y=10;
        c1.rayon=15;
        c1.color="red";

        Cercle c2 = c1;

        Cercle autreCercle= (Cercle)c1.clone();

        Rectangle r1 = new Rectangle(15,15,"blue",20,30);
        Rectangle autreRectangle = (Rectangle) r1.clone();

        l1.add(c1);
        l1.add(r1);
        cloneEtCompare(l1,lCopie);

    }

    private static void cloneEtCompare(List<Shape> l1, List<Shape> lCopie) {
        for (Shape tmp : l1){
            Shape i = tmp.clone();
            lCopie.add(i);
        }
        for (int i = 0; i <lCopie.size(); i++) {
            if (l1.get(i) != lCopie.get(i)){
                System.out.println("Les objets ne sont pas les mêmes");
                if (l1.get(i).equals(lCopie.get(i))){
                    System.out.println(i +" et ils sont identiques");
                } else {
                    System.out.println("Ils ne sont pas identiques");
                }
            } else {
                System.out.println(i +"Les objets sont les mêmes");
            }
        }
    }
}