public class CombineArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        char[] arr2 = {'a', 'b', 'c', 'd', 'e'};

        String[] result = new String[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + "" + arr2[i];
        }

        
        System.out.print("{ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.print(" }");
    }
}


