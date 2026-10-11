public class BodaBoda {
    private String plateNumber;
    private String riderName;
    private double farePerKm;

    // Constructor
    public BodaBoda(String plateNumber, String riderName,
                    double farePerKm) {
        this.plateNumber = plateNumber;
        this.riderName = riderName;
        setFarePerKm(farePerKm);
    }

    // Setters
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public void setFarePerKm(double farePerKm) {
        if (farePerKm > 0) {
            this.farePerKm = farePerKm;
        } else {
            System.out.println("Invalid fare!");
        }
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getRiderName() {
        return riderName;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Rider Name: " + riderName);
        System.out.println("Fare Per Km: UGX " + farePerKm);
    }

    // Calculate fare
    public double computeFare(double distanceKm) {
        return farePerKm * distanceKm;
    }
}
