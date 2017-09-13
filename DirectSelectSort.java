package sort;

import java.util.Arrays;

/** 直接选择排序
 *  每次循环找到最小的那个数再与做交换
 * Created by jing_xu on 2017/9/13.
 */
public class DirectSelectSort {
    public static void main(String[] args){
        int[] numbers = {12,1,8,2,5,4,20,7};
        directSelectSort(numbers);
    }
    public static void directSelectSort(int[] a) {
        int length = a.length;
            for (int i=0;i<length;i++) {
                int position = i;
                int minKey = a[i];
                //每一次循环找到最小那个数再交换
                for(int j=i+1;j<length;j++)
                {
                    if(minKey>a[j])
                    {
                        minKey = a[j];
                        position = j;
                    }
                }
                a[position] = a[i];
                a[i] = minKey;
                System.out.println(Arrays.toString(a));
            }
    }
}
