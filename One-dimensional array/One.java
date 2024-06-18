package ArrayList;

public class One-dimensional_array {
     public static void main(String[] args) {
        
        //רשימות מערך לא דימיות - צריך להגדיר את גודל הרשימה
        int[] nums = new int[10];
        // אינדקס רנדומלי: אפשר להשתמש באינדקסים
        for(int i=0;i<10;++i)
           nums[i] =i;
        // מאפשר לגשת לאינקס של האלמנט
        // nums[0]=100;

        /**
         * אם אנחנו לא יודעים את מספר האינדקס 
         * צריך לבצע - חיפוש לינארי O(n)
         * אם אנחנו רוצים את האינדקס 6
         */
        for(int i=0; i<10; i++)
          if(nums[i]==6)
            System.out.println("we have found the item at index" + i);
     }
}
