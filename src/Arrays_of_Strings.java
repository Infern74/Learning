public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 7;
        String[] strings = new String[3];
        strings[0] = "Z";
        strings[1] = "ZZ";
        strings[2] = "ZZZ";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();

        for(String string:strings){
            System.out.println(string);
        }

        int [] numbers2 = {1,2,3,4,5};
        int sum = 0;
        for (int x:numbers2){
            sum += x;
        }

        System.out.println();
        System.out.println(sum);
    }
}
