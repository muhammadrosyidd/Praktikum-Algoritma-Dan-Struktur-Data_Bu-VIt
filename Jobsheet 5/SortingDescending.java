public class SortingDescending {
    public static int[] bubbleSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
    public static int[] selectionSort(int[] numbers) {
        int n = numbers. length;
        
        for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        
        for (int j = i + 1; j < n; j++) {
        if (numbers[j] > numbers[minIndex]) {
        minIndex = j;
        
        }
        
        }
        
        int temp = numbers[minIndex];
        numbers [minIndex] = numbers[i];
        numbers[i] = temp;
    }
        return numbers;
}
public static int[] insertionSort(int[] numbers) {
    int n = numbers. length;
    
    for (int i = 1; i < n; ++i) {
    int key = numbers[i];
    int j = i - 1;
    
    while (j >= 0 && numbers[j] < key) {
    numbers[j + 1] = numbers[j];
    j = j - 1;
    
    }
    
    numbers[j + 1] = key;
    
    }
    
    return numbers;
}
public static void printArray(int[] numbers){
    for (int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
    }
    System.out.println("\n");
}
public static void main(String[] args) {
    int my1stNumbers[] = { 8, 6, 10, 2, 4 };
    my1stNumbers = bubbleSort(my1stNumbers);
    System.out.println("Sorting menggunakan Bubble : ");
    printArray(my1stNumbers);
    
    int my2ndNumbers[] = { 7, 9, 3, 11, 1 };
    my2ndNumbers = selectionSort(my2ndNumbers);
    System.out.println("Sorting menggunakan selection : ");
    printArray(my2ndNumbers) ;
    
    int my3rdNumbers[] = { 4, 1, 12, 6, 5 };
    my3rdNumbers = insertionSort(my3rdNumbers);
    System.out.println("Sorting menggunakan insertion : ");
    printArray(my3rdNumbers);
}
}
