package sort;

/**直接插入排序
 * 从第二个数开始遍历，将其作为待插入的数，与前面已经排好序的数进行比较
 * 比前面某个数小，则将某个数到带插入的数依次向后移动，将待插入的数插入
 *
 * 缺点：移动开来的成本
 * Created by jing_xu on 2017/9/13.
 */
public class DirectInsertSort {
    public static void main(String[] args){
        int[] nummbers = {9,2,5,3,7,1,0,8,4};
        insertSort(nummbers);
    }
    public static void insertSort(int[] a){
        int count = a.length;
        for(int i =1 ;i<count;i++)
        {
           int insertNum = a[i]; //待插入的数
            int j = i -1; //i之前都是已排序的数
            while(insertNum<a[j]) //如果待插入的数，比已排序的数小
            {
                a[j+1] = a[j]; // 向后移动
                j--;
            }
            a[i] = insertNum;
            int c =0;
            while (c<a.length) {
                System.out.print(a[c] +" ");
                count ++;
            }
            System.out.println("");
        }
    }
}