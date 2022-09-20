public class HWAPT {
        public static void main(String[] args){
            int[] arr = generateRandomArray();
            System.out.println();

            // Массивы ч.2. Задание 1.
            System.out.println("Массивы ч.2. Задание 1.");
            int sum = 0;
            for (int element : arr) {
                sum += element;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

            // Массивы ч.2. Задание 2.
            System.out.println();
            System.out.println("Массивы ч.2. Задание 2.");

            int maxSum = Integer.MIN_VALUE;
            int minSum = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                }
                if (arr[i] < minSum) {
                    minSum = arr[i];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей.");

            // Массивы ч.2. Задание 3.
            System.out.println();
            System.out.println("Массивы ч.2. Задание 3.");
            double averAmount = (double) sum / arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + averAmount + " рублей.");

            // Массивы ч.2. Задание 4.
            System.out.println();
            System.out.println("Массивы ч.2. Задание 4.");
            char[] reverceFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverceFullName.length - 1; i >=0; i--)
                {
                    System.out.print(reverceFullName[i]);
                }


        }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
        }
        }



