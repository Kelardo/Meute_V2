package M_S;

import java.util.Scanner;

public class NdClass extends  Main{

    /*Scanner sc = new Scanner(System.in);
    String Test;
    String T;*/


    public String ChoixT (String T)
    {
        if (T.equals("Meute"))
        {
            System.out.println("Vous avez choisi la classe NdClass.");
        }
        else if (T.equals("Solitaire"))
        {
            System.out.println("Vous avez choisi la classe NdClass.");
        }
        else
        {
            System.out.println("vous n'avez pas choisi une bonne classe NdClass!");
        }
    return T;
    }

    public void questionChoix()
    {
        String Choix[] = {"Meute","Solitaire"};
        System.out.println("Vous avez le choix entre la classe : " + Choix[0] + " et " + Choix [1]);

    }
    public int [] PorP = {2,4};

    public void tabPates(int Double)
    {
        if (Double == 2)

        {

        }
        else if (Double == 4)
    {

    }
        else
            {
                System.out.println("Vous n'avez pas mis le nombre de pattes");
    }

    }






}
