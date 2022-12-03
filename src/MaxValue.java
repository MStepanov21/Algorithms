public class MaxValue {
    public static void main(String[] args) {
        int [] box = { 11,4,5,3,23,4,321,121,423,112,424,345,345,35,345,32,234,5};
        int maxValue = box[0];

        int [] rox = {12,5,6,7,8,4,3,2,224,54,75,685,764,553,23,3,34};
        int massiveTw0 = rox[0];

        for (int i = 1; i < box.length; i++) {
            if (box[i] > maxValue){
                maxValue = box[i];
            }
        }

        System.out.println(maxValue);


    }
}
