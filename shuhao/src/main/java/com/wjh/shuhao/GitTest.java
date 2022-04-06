package com.wjh.shuhao;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @Author: wjh
 * @Date: 2022/4/6 0:18
 * @Version 1.0
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git!!");
        System.out.println("hello git!!2");
        System.out.println("test 分支");
        System.out.println("main merge");
        System.out.println("test merge");
        System.out.println("push github");
        System.out.println("pull github");
        System.out.println("ssh push test");
        int max = max(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(max);

    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //快速排序
    public static void quickSort(int[] arr,int low,int high){
        if (low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        while (low < high){
            while (low < high && arr[high] >= pivot){
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }
    //插入排序
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    //返回数组的最大值
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
