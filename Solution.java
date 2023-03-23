package Ex06;

import java.util.Arrays;

class Solution{
	public int[] solution(int[] arr) {
		int left=0,temp=0;
		int right=arr.length-1;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		int[] arr= {1,4,2,3};
		int[] ret=sol.solution(arr);
		System.out.println("Solution: return value of the method is "+Arrays.toString(ret)+".");
	}

}
