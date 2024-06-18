/**
 * בתרגיל זה,
 *  עליך להפוך מערך 
 * T[]
 *  במורכבות זמן לינארית 
 * O(N) ואנו רוצים שהאלגוריתם יהיה במקום גם כן 
 * - כך שהאלגוריתם לא יכול להשתמש בזיכרון נוסף

לדוגמה: הקלט הוא [1,2,3,4,5] ואז הפלט הוא [5,4,3,2,1]
 */

public class ReverseArrayProblem {

	// no need for extra memory (in-place algorithm)
	// O(N/2) = O(N) linear running time
	public int[] solve(int[] nums) {
    
		int lowIndex = 0;
		int highIndex = nums.length - 1;
		
		while (lowIndex < highIndex) {
			int temp = nums[lowIndex];
			nums[lowIndex] = nums[highIndex];
			nums[highIndex] = temp;
			
			lowIndex++;
			highIndex--;
		}
		
		return nums;
	}
}	