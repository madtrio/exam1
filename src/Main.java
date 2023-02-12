public class Main {
    public static void main(String[] args) {
        int[] arr = new int [10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i * 3;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = ++arr[i];
                System.out.println("Значение в ячейке " + (i + 1) + " увеличилось на 1");
            }
        }
        for (int i = 2; i < 7; i++) {
            System.out.println(arr[i]);
        }
    }
}