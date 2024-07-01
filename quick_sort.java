import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int arr[]={4,2,5,6,1,3};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int nums[],int li,int hi){
        if(li>=hi){
            return;
        }
        int s=li;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=nums[m];

        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        sort(nums, li, e);
        sort(nums, s, hi);
    }
}
