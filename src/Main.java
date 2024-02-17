public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 1, 2, 4, 7, 12};

        int min = numbers[0];
        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(min + " " + max);
    }
}