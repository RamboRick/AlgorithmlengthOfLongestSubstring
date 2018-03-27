package leetcode3;
import static java.lang.Math.*;

//LC3
//滑动窗口
//时间复杂度：
//空间复杂度：
//边界条件：字符集？只有字母？数字+字母？ ASCII？
//边界条件：大小写是否敏感？
public class Solution {
	public int lengthOfLongestSubstring ( String s){
		int[] freq = new int[256];
		int l = 0, r = -1; // 滑动窗口位s[l...r]
		int res = 0;
		
		while ( l < s.length()){
			if ( r +1 < s.length() && freq[s.charAt(r+1)] == 0){
				r ++;
				freq[s.charAt(r)] ++;
			}else {
				freq[s.charAt(l)] --;
				l ++;
			}
			res = max( res, r-l+1);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tst = "abcdre";
		Solution testSolution = new Solution();
		int q = testSolution.lengthOfLongestSubstring(tst);
		System.out.println(q);
	}
}
