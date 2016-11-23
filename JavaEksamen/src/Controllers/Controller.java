package Controllers;
import MenuView.MainMenu;
import MenuView.UserMenu;
import MenuView.BookMenu;

/**
 * Created by EmilEhrenreich on 22/11/2016.
 */
public class Controller {

    private MainMenu mainMenu;
    private BookMenu bookMenu;
    private UserMenu userMenu;


    public Controller(){
        this.mainMenu = new MainMenu(this);
     //   this.bookMenu = new BookMenu(this);
      //  this.userMenu = new UserMenu(this);
    }


    //Hvorfor laver man {} rundt om nedenstående del?
    public void ShowMainMenu() { this.mainMenu.presentMenu(); }


    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public BookMenu getBookMenu() {
        return bookMenu;
    }

    public UserMenu getUserMenu() {
        return userMenu;
    }
}

