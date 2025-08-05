import service.WheaterService;
import view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //WheaterService wheaterService=new WheaterService();
        //System.out.println(wheaterService.findWheater("new jersey"));
        Scanner inputUser = new Scanner(System.in);
        Menu.viewInterfaceMenu(inputUser);
    }
}