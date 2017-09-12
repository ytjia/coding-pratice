package leetcode;

/**
 * @author ytjia created on 2017-09-12 22:23
 */
public class ClimbingStairs {

  /**
   * You are climbing a stair case. It takes n steps to reach to the top.
   * <p>
   * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the
   * top?
   * <p>
   * https://leetcode.com/problems/climbing-stairs/description/
   */
  class Solution {

    public int climbStairs(int n) {
      if (n <= 1) {
        return n;
      }
      int[] ways = new int[n];
      ways[0] = 1;
      ways[1] = 2;
      for (int i = 2; i < n; i++) {
        ways[i] = ways[i-1] + ways[i-2];
      }

      return ways[n-1];
    }
  }

}
