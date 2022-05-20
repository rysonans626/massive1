public class Main {
    public static void main(String[] args) {
//задание 1-2
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.print("\n");

        float[] numbers2 = new float[]{1.57f, 7.654f, 9.986f};
        for (int i = 0; i < numbers2.length; i++) {
            if (i != numbers2.length - 1) {
                System.out.print(numbers2[i] + ", ");
            } else {
                System.out.print(numbers2[i]);
            }
        }
        System.out.print("\n");

        int[] smth;
        smth = new int[]{13, 14, 15};
        for (int i = 0; i < smth.length; i++) {
            if (i != smth.length - 1) {
                System.out.print(smth[i] + ", ");
            } else {
                System.out.print(smth[i]);
            }
        }
        System.out.print("\n");
//задание 3
        for (int i = smth.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(smth[i] + ", ");
            } else {
                System.out.print(smth[i]);
            }
        }
        System.out.print("\n");

        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers2[i] + ", ");
            } else {
                System.out.print(numbers2[i]);
            }
        }
        System.out.print("\n");

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.print("\n");
//задание 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        }

    }
