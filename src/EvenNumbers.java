public class EvenNumbers {
    public static void main(String[] args) {

        System.out.println(10%2);
        int array [] = {4,3,7,23,54,12,4,7,8,0,11,16,17};
        search(array);

    }


    public static void search(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
