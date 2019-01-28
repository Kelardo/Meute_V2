package M_S;

public class Solitaire extends NdClass{

    public void Solitaire ()
    {
        System.out.println("Vous êtes dans une classe Solitaire");
    }
    public void questionSolitaire()
    {
        System.out.println("Prédateurs ou Proies? :");
    }

    public String Savane (String Savane)
    {
        if (Savane.equals("Prédateurs"))
        {
            System.out.println("Vous avez choisi des Prédateurs.");
        }
        else if (Savane.equals("Proies"))
        {
            System.out.println("Vous avez choisi des Proies.");
        }
        else
        {
            System.out.println("vous n'avez pas choisi une bonne classe Solitaire!");
        }
        return  Savane;
    }



}
