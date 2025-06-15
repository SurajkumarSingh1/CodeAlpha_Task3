import java.util.Scanner;
class SimpleHotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Hotel!");
        System.out.println("Room Types:");
        System.out.println("1. Standard 1000 per day");
        System.out.println("2. Deluxe 2000 per day");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter room type (Standard/Deluxe): ");
        String room = sc.nextLine();
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        int pricePerDay = 0;
        if (room.equalsIgnoreCase("Standard")) {
            pricePerDay = 1000;
        } else if (room.equalsIgnoreCase("Deluxe")) {
            pricePerDay = 2000;
        }
        int total = pricePerDay * days;
        System.out.println("\n- Booking Confirmed -");
        System.out.println("Name:" + name);
        System.out.println("Room: " + room);
        System.out.println("Days:" + days);
        System.out.println("Total Price: " + total);
        sc.close();
    }
}
