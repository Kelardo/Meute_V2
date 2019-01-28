package M_S;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);

        NdClass V = new NdClass();
        Meute V1 = new Meute();
        Solitaire V2 = new Solitaire();
        Predateurs V3 = new Predateurs();
        Proies V4 = new Proies();

        V.questionChoix();

        String Choose = sc.nextLine();
        V.ChoixT(Choose);


        if (Choose.equals("Meute"))
        {
            V1.Meute();
            V1.questionMeute();
            String M = sc.nextLine();
            V1.Savane(M);
            V3.Predateurs();
            int D = sc.nextInt();
            V3.tabPates(D);

        }
        else if (Choose.equals("Solitaire"))
        {
            V2.Solitaire();
            V2.questionSolitaire();
            String S = sc.nextLine();
            V2.Savane(S);
            V4.Proies();
            int D = sc.nextInt();
            V4.tabPates(D);

        }
        else
        {
            System.out.println("Vous n'avez pas choisi une bonne class !!");
        }





    }
}
