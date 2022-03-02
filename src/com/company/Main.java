package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {44, 52, 1, 2, 5, 10, 22, 26, 31};
        int[] nums2 = new int [nums.length];

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Вывод преобразованного массива: ");
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












