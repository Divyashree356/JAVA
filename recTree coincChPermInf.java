

public class recursionTree {

    private static int coinChangePermutationInf(int[] arr , int target, String asf)
    {
        if(target==0)
         {
            System.out.println(asf);
            return 1;
         }
         int count=0;

         for(int i=0;i<arr.length;i++)
         {
            if(target-arr[i]>=0)
            {
                count+=coinChangePermutationInf(arr, target-arr[i], asf+arr[i]);
            }
         }
            return count;
    }

    public static void main(String[] args)
    {
        int arr[]={2,3,5,7};
        int target=15;
        int ans= coinChangePermutationInf(arr, target,"");
        System.out.println(ans+" ");

    }
    
}
