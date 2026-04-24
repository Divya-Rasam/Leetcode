public class LinearSearch {

    public static void main(String[] args) {
        
        int [] arr = { 10, 20, 30, 40};
        int key = 30;

        LinearSearch ls = new LinearSearch();
        int result = ls.linearSearch(arr, key);
        System.out.println(result);
    }
    
    int linearSearch(int [] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
