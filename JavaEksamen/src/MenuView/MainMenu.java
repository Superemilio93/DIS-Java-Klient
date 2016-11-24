package MenuView;
import Controllers.Controller;
import java.util.Scanner;


/**
 * Created by EmilEhrenreich on 22/11/2016.
 */
public class MainMenu {



    private Controller controller;

    public MainMenu(Controller controller){
            this.controller = controller;
    }


    public void presentMenu() {

        System.out.println("Velkommen til BookIT");
        System.out.println("-----Hovedmenu----");
        System.out.println("Vælg en af nedenstående muligheder");
        System.out.println("(1) Gå til bog-menu");
        System.out.println("(2) Gå til bruger-menu");

        Scanner inputReciever = new Scanner(System.in);
        int menuChoise = inputReciever.nextInt();


        switch (menuChoise) {

            case 1:
                this.controller.getBookMenu().presentMenu();
                break;

            case 2:
                this.controller.getUserMenu().PresentMenu();
                break;

            default:
                System.out.println("Forkert valg - Prøv igen");
                presentMenu();
                break;

        }

    }
    }


