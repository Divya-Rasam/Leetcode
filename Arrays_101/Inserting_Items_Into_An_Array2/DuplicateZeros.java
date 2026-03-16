package Inserting_Items_Into_An_Array2;
public class DuplicateZeros {
    
    public void duplicateZeros(int [] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                
                for ( int j = arr.length-1; j > i; j-- ) {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }

    }

    public static void main(String[] args) {
        
        int [] arr = {1,0,2,3,0,4,5,0};

        DuplicateZeros dz = new DuplicateZeros();
        dz.duplicateZeros(arr);
        // {1,0,0,2,3,0,0,4}

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}






// shift array