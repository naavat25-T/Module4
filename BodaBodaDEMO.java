public class BodaBodaDEMO {
public static void main(String[] args) {

    BodaBoda boda1 = new BodaBoda(
        "UBD325L", "Naava Teddy", 1500
    );

    BodaBoda boda2 = new BodaBoda(
        "UBD341K", "Lin Baker", 2000
    );

    boda1.displayDetails();
    System.out.println("Fare for 5 km: UGX "
            + boda1.computeFare(5));
    System.out.println("Fare for 10 km: UGX "
            + boda1.computeFare(10));

    System.out.println();

    boda2.displayDetails();
    System.out.println("Fare for 3 km: UGX "
            + boda2.computeFare(3));
    System.out.println("Fare for 8 km: UGX "
            + boda2.computeFare(8));
}

}
