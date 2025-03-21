/*public class Main {

    public static int[] filterEvenIndexOddValue(int[] arr){

        int[] res = new int[arr.length];

        int res_id = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(i%2==0 && arr[i]%2==1) {

                res[res_id] = arr[i];

                res_id++;

            }

        }

        return res;

    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};

        int[] res = filterEvenIndexOddValue(arr);

        int i=0;

        while(res[i] != 0) {

            System.out.print(res[i] + " ");

            i++;

        }

    }

}
*/

/*
import java.util.Arrays;
public class Main {
    public static int findDominant(int[] arr){
        Arrays.sort(arr);
        int max_el = arr[0];
        int max_counter = 1;
        int cur_el = arr[0];
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == cur_el){
                counter++;
            }
            else{
                if(counter>max_counter){
                    max_counter = counter;
                    max_el = cur_el;
                }
                counter = 1;
                cur_el = arr[i];
            }
        }
        if(counter>max_counter){
            max_counter = counter;
            max_el = cur_el;
        }
        if (max_counter>(arr.length/2)) return max_el;
        else return -1;
    }
    public static void main(String[] args){
        int[] arr1 = {3,3,3,2,2};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {5,5,5,1};
        int n1 = findDominant(arr1);
        int n2 = findDominant(arr2);
        int n3 = findDominant(arr3);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}
*/
public class Main {

    public static int[] rotateArray(int[] arr, int pos){

        pos = pos%arr.length;

        int[] res = new int[arr.length];

        for(int i=pos; i<arr.length;i++){

            res[i] = arr[i-pos];

        }

        for(int i=0; i<pos;i++){

            res[i] = arr[arr.length-pos+i];

        }

        return res;

    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        int[] res = rotateArray(arr, 3);

        for(int el: res) System.out.print(el + " "); // 3 4 5 1 2

    }

}