/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two * lines,
 * which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * <p>
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * @author tsuixh
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int cursorLeft = 0;
        int cursorRight = height.length - 1;
        int maxArea = 0;
        while (cursorLeft != cursorRight) {
            int leftHeight = height[cursorLeft];
            int rightHeight = height[cursorRight];
            int area = leftHeight >= rightHeight ? rightHeight * (cursorRight - cursorLeft) : leftHeight * (cursorRight - cursorLeft);
            maxArea = area > maxArea ? area : maxArea;
            if (leftHeight >= rightHeight) {
                cursorRight--;
            } else {
                cursorLeft++;
            }
        }
        return maxArea;
    }
}
