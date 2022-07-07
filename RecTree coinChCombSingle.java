

public class recursionTree {

    private static int coinChangeCombinationSingle(int[] arr , int target, String asf, int idx)
    {
        if(target==0)
         {
            System.out.println(asf);
            return 1;
         }
         int count=0;

         for(int i=idx;i<arr.length;i++)
         {
            if(target-arr[i]>=0)
            {
                count+=coinChangeCombinationSingle(arr, target-arr[i], asf+arr[i], i+1);
            }
         }
            return count;
    }

    public static void main(String[] args)
    {
        int arr[]={2,3,5,7};
        int target=10;
        int ans= coinChangeCombinationSingle(arr, target,"",0);
        System.out.println(ans+" ");

    }
    
}
