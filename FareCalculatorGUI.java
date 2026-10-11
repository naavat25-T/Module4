import javax.swing.*;

public class FareCalculatorGUI {
    public static void main(String[] args) {

        BodaBoda boda = new BodaBoda(
            "UBD325L", "Naava Teddy", 1500
        );

        JFrame frame = new JFrame("Fare Calculator");

        JLabel label = new JLabel("Distance (km):");
        JTextField distance = new JTextField(10);
        JButton button = new JButton("Calculate");
        JLabel result = new JLabel("Total fare appears here");

        button.addActionListener(e -> {
            try {
                double km = Double.parseDouble(distance.getText());

                if (km < 0) {
                    result.setText("Invalid distance");
                } else {
                    double fare = boda.computeFare(km);
                    result.setText("Fare: UGX " + fare);
                }
            } catch (NumberFormatException ex) {
                result.setText("Enter a valid number");
            }
        });

        frame.setLayout(null);

        label.setBounds(20, 20, 120, 25);
        distance.setBounds(145, 20, 100, 25);
        button.setBounds(80, 60, 120, 30);
        result.setBounds(20, 105, 300, 25);

        frame.add(label);
        frame.add(distance);
        frame.add(button);
        frame.add(result);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
