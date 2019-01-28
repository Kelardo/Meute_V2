package M_S;

import java.security.PublicKey;

public class Meute extends NdClass{

    public void Meute (){
        System.out.println("Vous êtes dans une classe Meute");
    }
    public void questionMeute()
    {
        System.out.println("Prédateur ou Proies ? :");
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
            System.out.println("vous n'avez pas choisi une bonne classe Meute!");
        }
        return  Savane;
    }



}
