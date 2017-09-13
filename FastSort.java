package sort;

/** 以第一个为因子，大的放右边，小的放左边 ，递归
 * Created by jing_xu on 2017/9/13.
 */
public class FastSort {
    public static void main(String[] args){
        int[] nummbers = {9,2,5,3,7,1,0,8,4};
        fastSort(nummbers,0,nummbers.length-1);
    }

    public static void fastSort(int[] a,int start,int end)
    {
        if(start<end)
        {

            System.out.println("");
            int middle = getMiddle(a,start,end);
            int count =0;
            while (count<a.length) {
                System.out.print(a[count] +" ");
                count ++;
            }
            fastSort(a,start,middle-1);
            fastSort(a,middle+1,end);
        }
    }

    public static int getMiddle(int[] a,int low ,int high) {
       int temp = a[low];
        while (low<high)
        {
            while(low<high &&temp<a[high])
            {
                high--;
            }
            a[low] = a[high];
            while (low<high && temp>a[low])
            {
                low ++;
            }
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }
}
