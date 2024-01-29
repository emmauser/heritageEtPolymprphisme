public class MainClass{
    public static void main(String[] args) {
    System.out.println("bonjour à tous je suis un génie");
    FigureGeometrique figure=new FigureGeometrique();
    figure.moveTo(5, 5);
    System.out.println(figure.toString());
    System.out.println("deplacement sur l'abscisse"+"  "+ figure.getX());
    System.out.println("deplacement sur l'axe des ordonneés"+"  "+ figure.getY());
    Carre carre =new Carre();
    carre.moveTo(5, 5);
    System.out.println(carre);

    Animal animal=new Animal();

animal.moveTo();
Oiseau oiseau=new Oiseau();
oiseau.moveTo();
Chien chien=new Chien();
chien.moveTo();

    }
}


