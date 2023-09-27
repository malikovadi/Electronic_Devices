// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] companies = {
                "Apple",
                "Samsung",
                "Lenovo",
                "Dell",
                "HP (Hewlett-Packard)",
                "Microsoft",
                "Sony",
                "ASUS",
                "Acer",
                "Huawei",
                "LG",
                "Toshiba",
                "MSI",
                "Razer",
                "Google (Pixel)",
                "OnePlus",
                "Xiaomi",
                "JBL",
                "Bose",
                "Sennheiser"
        };
        char[] uppercaseLetters = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'
        };
        String[] randomIntegers = {
                "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "20",
                "30", "40", "50", "60", "70",
                "80", "90", "55", "66", "22"
        };

        String[] randomColors = {
                "Red", "Blue", "Green", "Yellow", "Purple",
                "Pink", "Orange", "Brown", "Gray", "Teal",
                "Lavender", "Indigo", "Cyan", "Maroon", "Olive",
                "Peach", "Plum", "Gold", "Silver", "Turquoise"
        };

        int[] frameRates = {
                24, 30, 60, 120, 144, 240, 360, 45, 75, 90,
                100, 200, 480, 50, 70, 165, 300, 75, 1440, 15
        };
        int[] memories = {
                16, 32, 64, 128, 256, 512, 1024, 2048, 8, 4
        };

        String[] laptopProcessors = {
                "Intel Core i9-11980HK",
                "AMD Ryzen 9 5900X",
                "Intel Core i7-1165G7",
                "AMD Ryzen 7 5800U",
                "Intel Core i5-1135G7",
                "AMD Ryzen 5 5600X",
                "Intel Core i9-10980HK",
                "AMD Ryzen 9 5950X",
                "Intel Core i7-11800H",
                "AMD Ryzen 7 5700U",
                "Intel Core i5-11500",
                "AMD Ryzen 5 5500U",
                "Apple M1",
                "Qualcomm Snapdragon 8cx Gen 3",
                "Intel Core i9-12900H",
                "AMD Ryzen 9 6900HX",
                "Intel Core i7-11700K",
                "AMD Ryzen 7 6800X",
                "Intel Core i5-11400F",
                "AMD Ryzen 5 4600H"
        };

        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user to input the number of devices they want to create.
        System.out.print("Enter the number of devices you want to create (between 1 and 20): ");
        int numberOfDevices = scanner.nextInt();

        // Validate input
        if (numberOfDevices < 1 || numberOfDevices > 20) {
            System.out.println("Please enter a valid number between 1 and 20.");
            return;
        }

        // Create lists to store devices and track distinct types
        ArrayList<Device> devices = new ArrayList<>();
        ArrayList<String> distinctTypes = new ArrayList<>();

        Random rand = new Random();

        // Step 2: Generate random instances of devices with different types, prices, and weights.
        for (int i = 0; i < numberOfDevices; i++) {
            // Generate random values for device properties
            String[] possibleTypes = { "Smartphone", "Laptop", "Headphones" };
            String randomType = possibleTypes[rand.nextInt(possibleTypes.length)];
            double randomPrice = Math.round(rand.nextDouble() * 1000.0); // Random price between 0 and 1000
            double randomWeight = rand.nextDouble() * 5.0; // Random weight between 0 and 5

            // Create devices based on the random type
            if (randomType.equals("Smartphone")) {
                devices.add(new Smartphone(randomType, randomPrice, randomWeight, companies[rand.nextInt(20)] + " " + uppercaseLetters[rand.nextInt(20)] + randomIntegers[rand.nextInt(20)], memories[rand.nextInt(11)], frameRates[rand.nextInt(20)]));
            } else if (randomType.equals("Laptop")) {
                devices.add(new Laptop(randomType, randomPrice, randomWeight, companies[rand.nextInt(20)] + " " + uppercaseLetters[rand.nextInt(20)] + randomIntegers[rand.nextInt(20)], laptopProcessors[rand.nextInt(20)], frameRates[rand.nextInt(20)]));
            } else if (randomType.equals("Headphones")) {
                devices.add(new Headphones(randomType, randomPrice, randomWeight, companies[rand.nextInt(20)] + " " + uppercaseLetters[rand.nextInt(20)] + randomIntegers[rand.nextInt(20)], randomColors[rand.nextInt(20)], rand.nextInt(10, 40)));
            }

            // Track distinct types
            if (!distinctTypes.contains(randomType)) {
                distinctTypes.add(randomType);
            }
        }

        // Step 3: Calculate and display the information
        double totalPrice = 0;
        double totalWeight = 0;

        for (Device device : devices) {
            totalPrice += device.getPrice();
            totalWeight += device.getWeight();
        }

        // Step 4: Display the calculated information
        System.out.println("Number of distinct device types created: " + distinctTypes.size());
        System.out.println("Total price of all devices: $" + totalPrice);
        System.out.println("Total weight of all devices: " + totalWeight + " kg");

        for (Device device : devices) {
            System.out.println("Device Type: " + device.getType());

            // Check the type of device and cast accordingly to access specific properties
            if (device instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) device;
                System.out.println("Device Name: " + smartphone.getName());
                System.out.println("Memory: " + smartphone.getMemory() + " GB");
                System.out.println("FPS: " + smartphone.getFps() + " fps");
            } else if (device instanceof Laptop) {
                Laptop laptop = (Laptop) device;
                System.out.println("Device Name: " + laptop.getName());
                System.out.println("Processor: " + laptop.getProcessor());
                System.out.println("FPS: " + laptop.getFps() + " fps");
            } else if (device instanceof Headphones) {
                Headphones headphones = (Headphones) device;
                System.out.println("Device Name: " + headphones.getName());
                System.out.println("Color: " + headphones.getColor());
                System.out.println("Durability: " + headphones.getDurability() + " hours");
            }

            System.out.println("Device Price: $" + device.getPrice());
            System.out.println("Device Weight: " + device.getWeight() + " kg");
            System.out.println(); // Add a line break between devices
        }

        // Close the scanner
        scanner.close();



    }
}
