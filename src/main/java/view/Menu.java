package view;

import model.Activity;
import model.Wheater;
import service.ActivityService;
import service.WheaterService;

import java.util.Optional;
import java.util.Scanner;

public class Menu {

    private static void viewTitleMenu() {
        System.out.print("""
                \n
                ------------------------------------
                   Welcome to your daily activity
                ------------------------------------
                
                """
        );
    }

    public static void viewInterfaceMenu(Scanner inputUser) {
        viewTitleMenu();
        int option = 0;
        while (option != 3) {
            System.out.print("""
                    1). Know the climate of some city
                    2). Show better activity for today
                    3). Leave
                    \noption ->\s""");
            option = Integer.parseInt(inputUser.nextLine());
            selectMenuOptions(option, inputUser);
        }
    }

    private static void selectMenuOptions(int option, Scanner inputUser) {
        switch (option) {
            case 1 -> {
                System.out.print("Enter the name of the city -> ");
                String nameCity = inputUser.nextLine();
                WheaterService wheaterService=new WheaterService();
                System.out.println(wheaterService.findWheater(nameCity));
            }
            case 2 -> {
                System.out.print("Enter the name of the city -> ");
                String nameCity = inputUser.nextLine();
                WheaterService wheaterService=new WheaterService();
                ActivityService activityService=new ActivityService();
                Optional<Wheater> valorWeather= wheaterService.findWheater(nameCity);
                if (valorWeather.isPresent()){
                    Wheater wheater =valorWeather.get();
                    System.out.println(activityService.findActivityByTipe(wheater));
                }else {
                    throw new RuntimeException("La ciudad ingresada no esta en la api");
                }

            }

            case 3 -> System.out.println("\nSee you later :D");
            default ->  System.out.println("Choose some of the options");
        }
    }

}
