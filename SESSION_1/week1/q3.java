package SESSION_1.week1;
class q3 {

    // Method to determine BMI status
    static String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } 
        else if (bmi < 25) {
            return "Normal";
        } 
        else if (bmi < 30) {
            return "Overweight";
        } 
        else {
            return "Obese";
        }
    }


    // Method to calculate BMI and print the wellness report
    static void printWellnessReport(double[] heights, double[] weights) {

        System.out.println("\n========== WELLNESS REPORT ==========");

        System.out.printf("%-10s %-15s %-15s %-10s %-15s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");

        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {

            // Calculate BMI
            double bmi = weights[i] / (heights[i] * heights[i]);

            // Get BMI status
            String status = getBmiStatus(bmi);

            // Print details
            System.out.printf("%-10d %-15.2f %-15.2f %-10.2f %-15s%n",
                    (i + 1),
                    heights[i],
                    weights[i],
                    bmi,
                    status);
        }
    }


    public static void main(String[] args) {

        // Arrays storing height in meters
        double[] heights = {
            1.75, 1.60, 1.80, 1.65, 1.70,
            1.72, 1.58, 1.85, 1.68, 1.78
        };

        // Arrays storing weight in kilograms
        double[] weights = {
            70, 90, 85, 55, 80,
            65, 50, 95, 75, 72
        };

        // Print BMI report
        printWellnessReport(heights, weights);
    }
}
