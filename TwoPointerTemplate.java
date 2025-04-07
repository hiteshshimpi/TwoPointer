package TwoPointer;

public class TwoPointerTemplate {
    public static void main(String[] args) {


        int arr[] = {1 ,2 ,2 ,3 ,1 ,2};
        int k = 1;
        int count = 0;
        int sum = 0;
        for (int i=0 ,j = 0;j < arr.length;j++)
        {
            sum=sum+arr[j];
            while(sum<=k)
            {
                sum =sum -arr[i];
                i++;
            }
            count=count+j-i+1;
        }
        System.out.println(count);
    }
}