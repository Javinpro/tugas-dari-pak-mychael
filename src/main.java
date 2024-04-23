import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        idol michie = new idol("Michelle Alexandra","Agus Alexandra", "Meilin Alexandra", 18, "22nd", 2009, "April");
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean jalan = true;

    while (jalan){
        //Menampilkan menu pilihan 
        System.out.println("\n Choose one from menu below :");
        System.out.println("1. Greeting " + michie.getNama());
        System.out.println("2. Say Happy Birthday to " + michie.getNama());
        System.out.println("3. " + michie.getNama() + " short biography");

        //Memasukkan input
        System.out.print("Your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello " + michie.getNama() + ", nice to meet you!");
                break;
            case 2:
                System.out.println("Happy Birthday " + michie.getNama() + " on your " + michie.getUsia() + " years old!");
                break;
            case 3:
                System.out.println(michie.getNama() + " is Mr. " + michie.getNama_ibu() + " & " + michie.getNama_ayah() + "'s " + "one & only daughter. Her birthday is on " + michie.getBln_ultah() + " " + michie.getTgl_ultah() + ", " + michie.getThn_ultah() + ". Now she is a member of jkt48.");
                break;
            default:
                System.out.println("Your choice is invalid! Please enter it again.");
        }

        System.out.print("Wanna continue? (yes/no) : ");
        String input = scanner.next();
        if (!input.equalsIgnoreCase("yes")){
            jalan = false;
        }
    } 

    System.out.println("Thank you for knowing our member!");
    scanner.close();
    }
}
