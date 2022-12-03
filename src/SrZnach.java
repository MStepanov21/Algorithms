public class SrZnach {
    public static void main(String[] args) {
        int [] box = {2, 4, 3, 3, 5, 4};
        int sum = 0;

        for (int i = 0; i < box.length; i++) {
        sum = box[i] + sum;
        }

        System.out.println(sum / box.length);

    }
}
