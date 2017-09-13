package sort;

import java.util.Arrays;

/** 希尔排序：直接插入排序的升级版
 * 为了减少移动次数
 * Created by jing_xu on 2017/9/13.
 */
public class ShellSort {
    public static void main(String[] args){
        int[] nummbers = {9,2,5,3,7,1,0,8,4};
        shellSort(nummbers);
    }

    public static void shellSort(int[] data) {
        // 计算出最大的h值
        int h = 1;
        while (h <= data.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < data.length; i += h) {
                if (data[i] < data[i - h]) {
                    int tmp = data[i];
                    int j = i - h;
                    while (j >= 0 && data[j] > tmp) {
                        data[j + h] = data[j];
                        j -= h;
                    }
                    data[j + h] = tmp;
                    System.out.println(Arrays.toString(data));
                }
            }
            // 计算出下一个h值
            h = (h - 1) / 3;
        }
    }
}
