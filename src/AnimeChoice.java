import java.util.Scanner;

public class AnimeChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Which anime do you like? ");
        String anime = scanner.nextLine().trim();
        
        switch (anime) {
            case "One Piece":
            case "Attack on Titan":
            case "Death Note":
            case "Bleach":
            case "Dragon ball":
            case "Naruto":
                System.out.println("Good Choice");
                break;
            default:
                System.out.println("Average");
        }
        
        scanner.close();
    }
}

