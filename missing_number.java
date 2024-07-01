public class missing_number {

  public static void main(String[] args) {
    int arr[] = { 3, 5, 2, 1 ,6};
    System.out.println(cyclesort(arr));
  }

  public static int cyclesort(int arr[]) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i];
      if (arr[i] < arr.length && arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index) {
        return index;
      }
    }
    return arr.length;
  }

  public static void swap(int arr[], int first, int last) {
    int temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;
  }
}
