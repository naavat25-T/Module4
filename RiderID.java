public class RiderID {
public static void main(String[] args) {

    String riderName = "NAAVA TEDDY";
    String plateNumber = "UBD325L";

    String firstThreeLetters =
            riderName.substring(0, 3).toUpperCase();

    String riderID =
            firstThreeLetters + "-" + plateNumber;

    System.out.println("Rider Name: " + riderName);
    System.out.println("Plate Number: " + plateNumber);
    System.out.println("Rider ID: " + riderID);
}

}