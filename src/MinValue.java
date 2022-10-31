public class MinValue {
    public static void main(String[] args) {
        int [] box = { 11,4,5,3,23,4,321,121,423,112,424,345,345,35,345,32,234,5};
        int minValue = box[0];

        for (int i = 0; i < box.length; i++) {
            if (box[i] > minValue){
                minValue = box[i];

        }

        }
        System.out.println(minValue);
        }
    }


