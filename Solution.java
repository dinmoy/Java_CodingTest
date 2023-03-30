package Ex09;

public class Solution {
	public String solution(String characters) {
		String result="";
		result+=characters.charAt(0);
		for(int i=0;i<characters.length()-1;i++) {
			if(characters.charAt(i)!=characters.charAt(i+1))
				result+=characters.charAt(i+1);
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		String characters="senteeeencccceee";
		String ret=sol.solution(characters);
		System.out.println("Solution: return value of the method is "+ret+".");
	}

}
