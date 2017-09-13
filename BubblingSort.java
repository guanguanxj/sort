package sort;

/**
 * Created by jing_xu on 2017/9/13.
 */
public class BubblingSort {
    public static void main(String[] args){
        int[] nummbers = {9,2,5,3,7,1,0,8,4};
        bubbleSort(nummbers);
    }

    //两两比较，大的往后放
    public static void bubbleSort(int[] a){
        int length=a.length;
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            int count =0;
            while (count<a.length) {
                System.out.print(a[count] +" ");
                count ++;
            }
            System.out.println("");
        }
    }
}
