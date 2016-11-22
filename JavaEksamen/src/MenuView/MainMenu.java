package MenuView;
import java.util.Scanner;


/**
 * Created by EmilEhrenreich on 22/11/2016.
 */
public class MainMenu {

    public static void main (String [] args) {

       // private Controller controller;


    public MainMenu(Controller controller) {
            this.controller = controller;
        }


    public void presentMenu() {

        System.out.println("Velkommen til BookIT");
        System.out.println("------Hovedmenu-----");
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


        }


    }
}


    }




}
