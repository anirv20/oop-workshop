package cli;

import domain.*;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        BuildingAdminSys admin = new BuildingAdminSys();
        System.out.println("Welcome to the Building Admin System. Type \"new building\" to add a building.");//The most boring adminsystem

        while (true) {
            System.out.print("> ");

            Scanner scanner = new Scanner(System.in);

            String token = scanner.nextLine();

            if (token.equals("new building")) {
                System.out.println("Give your building a description:");
                System.out.print("> ");
                String name = scanner.nextLine();
                System.out.println("Your building's ID is now: " + admin.addBuilding(new Building(name)));
            }
            else if (token.equals("add sensor")) {
                System.out.println("Temperature (1) or CO2 (2)?");
                System.out.print("> ");
                String type = scanner.nextLine();
                if (type.equals("1")) {
                    System.out.println("Give the UUID of the building you want to add a sensor to: ");
                    System.out.print("> ");
                    String id = scanner.nextLine();
                    System.out.println("Give your sensor a description:");
                    System.out.print("> ");
                    String name = scanner.nextLine();
                    System.out.println("Your sensor's ID is now: " + admin.addTemperatureSensor(UUID.fromString(id), name));
                }
            }
        }

    }
}
