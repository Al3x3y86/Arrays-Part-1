public class Main {
    public static void main(String[] args) {
        int[] weight = {1, 2, 3};
        double[] temp = {1.57, 7.654, 9.986};
        char[] speed ={'a', 'b', 'c'};

        for (int i = weight.length - 1; i >= 0 ; i--) {
            System.out.print(weight[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print(temp[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = speed.length - 1; i >= 0; i--) {
            System.out.print(speed[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}