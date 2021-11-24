public class RotateArrayList{  
    
    public static void main(String[] args) {  
        int [] arr = new int [] {10, 20, 30, 40, 50,60};   
        int n = 4;  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");   
        }    
          
        for(int i = 0; i < n; i++){  
            int j, first;  
            first = arr[0];  
          
            for(j = 0; j < arr.length-1; j++){  
                arr[j] = arr[j+1];  
            }  
            arr[j] = first;  
        }  
          
        System.out.println();  
          
        System.out.println("Array after rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  