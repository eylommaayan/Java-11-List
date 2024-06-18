public class IntegerReversion {

	public int reverse(int n) {
		
		int reversed = 0;
		int remainder = 0;
		
		while(n>0) {
            // בשביל לקבל את המספר האחורון
			remainder = n % 10;
            //בשביל לקבל את המספרים השלמים ללא השארית
			n = n / 10;
            // מוסיפים את הספרה האחרונה למשתנה reversed 
			reversed = reversed * 10 + remainder;		
		}
		
		return reversed;
	}
}


/**
 * n = 1234
reversed = 0
בלולאה הראשונה:

remainder = 4 (1234 % 10)
n = 123 (1234 / 10)
reversed = 0 * 10 + 4 = 4
בלולאה השנייה:

remainder = 3 (123 % 10)
n = 12 (123 / 10)
reversed = 4 * 10 + 3 = 43
בלולאה השלישית:

remainder = 2 (12 % 10)
n = 1 (12 / 10)
reversed = 43 * 10 + 2 = 432
בלולאה הרביעית:

remainder = 1 (1 % 10)
n = 0 (1 / 10)
reversed = 432 * 10 + 1 = 4321
בסוף הלולאה, המשתנה reversed יכיל את המספר ההפוך 4321.
 */