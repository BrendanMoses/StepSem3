public class BMI {
    static String getStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
    public static void main(String[] args) {
        double[] height = {1.75, 1.60, 1.80};
        double[] weight = {70, 90, 80};
        for (int i = 0; i < height.length; i++) {
            double bmi = weight[i] / (height[i] * height[i]);
            System.out.printf("Person %d: BMI = %.2f, Status = %s%n", i + 1, bmi, getStatus(bmi) );
        }
    }
}