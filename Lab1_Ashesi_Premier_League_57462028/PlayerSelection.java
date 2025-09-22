import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Collecting player information
        String name;
        final int convertCm = 100;
        final double convertKg = 0.45359237; 
        int age;
        double height;
        double weight;
        int jerseyNumber;
        String position = "";
        String attacker;
        String eligible;
        String category = "";
        String lineup;
        String finalDecision;

        System.out.print("Enter player name: ");
        name = scanner.nextLine();

        System.out.print("Enter player age: ");
        age = scanner.nextInt();

        System.out.print("Enter player height: ");
        height = scanner.nextDouble();

        System.out.print("Enter player weight: ");
        weight = scanner.nextDouble();

        System.out.print("Enter player's jersey number: ");
        jerseyNumber = scanner.nextInt();

        attacker = "No";
        //Converting Height from m to cm
        int heightCm = (int) (height * convertCm);

        //Converting Weight from Pounds to kg
        int weightKg = (int)(convertKg * weight);

        switch (jerseyNumber){
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 3:
            case 4:     
            case 5:
                position = "Defender";
                break;
            case 6:
                position = "Midfielder";
                break;
            case 8:
                position = "Midfielder";
                attacker = "Yes";
                break;
            case 7:
            case 11:
                position = "Winger";
                attacker = "Yes";
                break;
            case 9:
                position = "Striker";
                attacker = "Yes";
                break;
            case 10:
                position = "Playmaker";
                attacker = "Yes";
                break;
            default:
                position = "Player position not known";

        }


        //Checking Player Eligibility
        if (age >= 18 &&  age <= 35 && weightKg < 90){
            eligible = "Eligible";
        }else{
            eligible = "Not Eligible";
        }

        // Classifying players 
        if (age > 30){
            category = "Veteran";
        }
        else if (age >= 20){
            category = "Prime Player";
        } 
        else if (age > 0){
            category = "Rising player";
        }

        if (category.equals("Prime Player") && weightKg < 80){
            lineup = "Yes";
        }
        else{
            lineup = "No";
        }

        finalDecision = (eligible.equals("Eligible")) ? "Play" : "Rest";

        System.out.println("Player Name " + name);
        System.out.println("Age: " + age + " [" + category + "]");
        System.out.println("Height: " + heightCm + " cm");
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + attacker);
        System.out.println("Eligibility: " + eligible);
        System.out.println("Lineup Decision: " + lineup);
        System.out.println("Final Decision: " + finalDecision);
   

    }
}