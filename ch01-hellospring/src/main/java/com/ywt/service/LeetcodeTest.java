package com.ywt.service;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/27 12:47
 */
public class LeetcodeTest {

    public static void main(String[] args) {
        System.out.println(fourSumCount(new int[]{1,2},new int[]{-2,-1},new int[]{-1,2},new int[]{0,2}));
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int n = A.length,count=0;
        int[] newA = new int[n*n];
        int[] newB = new int[n*n];
        for(int i=0,index=-1; i<n; i++) {
            for(int j=0; j<n; j++) {
                newA[++index] = A[i]+B[j];
            }
        }
        for(int i=0,index=-1; i<n; i++) {
            for(int j=0; j<n; j++) {
                newB[++index] = C[i]+D[j];
            }
        }
        for(int i=0; i<n*n; i++) {
            for(int j=0; j<n*n; j++){
                if(newA[i]+newB[j]==0)
                    count++;
            }
        }

        return count;
    }
}
