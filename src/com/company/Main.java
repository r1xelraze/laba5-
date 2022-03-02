package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int size = scan.nextInt();
        int[] nums = new int [size];
        int[] nums2 = new int [nums.length];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < size; i++) {
            nums[i]= scan.nextInt();
        }
        System.out.print ("Полученный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        System.out.print("Вывод преобразованного массива: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums2[i]=nums[i];
            }
        }
        for (int i=nums2.length-1;i>=0;i--){
            boolean check=true;
            for (int j=0;j<i;j++) {
                if (nums2[j]>nums2[j+1]) {
                    int temp=nums2[j];
                    nums2[j]=nums2[j+1];
                    nums2[j+1]=temp;
                    check=false;
                }
            }
            if (check)
                break;
            System.out.print (nums2[i]+" ");
        }







    }

    }












