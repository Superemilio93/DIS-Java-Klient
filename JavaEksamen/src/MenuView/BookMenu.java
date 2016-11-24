package MenuView;

import java.util.Scanner;

import Controllers.Controller;

/**
 * Created by EmilEhrenreich on 22/11/2016.
 */
public class BookMenu {

    private Controller controller;

    public void presentMenu() {

        System.out.println("----Bog-Menu----");
        System.out.println("Vælg en af nedenstånde muligheder");
        System.out.println("(1) - Vis alle bøger");
        System.out.println("(2) - Find bøger");
        System.out.println("(3) - Tilbage til hovedmenu");

        Scanner inputReciever = new Scanner(System.in);
        int bookMenuChoise = inputReciever.nextInt();

        switch (bookMenuChoise)

        {
            case 1:
                this.controller.getBookMenu().presentMenu();
                break;


            default:
                System.out.println("Forkert valg - Prøv igen");
                presentMenu();
                break;

        }
    }

    public void getAllBooks() {

    }
}







