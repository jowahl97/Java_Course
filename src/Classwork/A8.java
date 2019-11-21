package Classwork;

public class A8 {
    public static void main(String[] args) {
        String[] foodPortion = {"1 dl milk", "slice of bread", "100 gr chicken breast", "200gr salad"};
        int[] kcalPerPortion = {62, 74, 165, 33};

        String[] breakfast = {"2 x " + foodPortion[0], "3 x " + foodPortion[1], "0 x " + foodPortion[2], "0 x " + foodPortion[3]};
        String[] lunch = {"0 x " + foodPortion[0], "1 x " + foodPortion[1], "2 x " + foodPortion[2], "1 x " + foodPortion[3]};
        String[] dinner = {"2 x " + foodPortion[0], "3 x " + foodPortion[1], "0 x " + foodPortion[2], "0 x " + foodPortion[3]};

        System.out.println("BREAKFAST");
        System.out.println("===========");
        PortionPerMeal(breakfast);
        System.out.println("LUNCH");
        System.out.println("===========");
        PortionPerMeal(lunch);
        System.out.println("DINNER");
        System.out.println("===========");
        PortionPerMeal(dinner);

    }

    private static void PortionPerMeal(String[] meal) {
        for (String food : meal) {
            if (food.contains("0 x ")){
            } else {
                System.out.println(food);
            }
        }
    }

    private static void KcalPerMeal(String[] meal, int[] kcal) {
        
    }
}
