package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
  
    public static void main(String[] args) {

      // רשימת מערכים משתמשת במערך בודד בפנים
       List<String> names = new ArrayList<>(); 
       
       // הוספת שמות לרשימה
       names.add("Eylon");
       names.add("Daniel");
       names.add("Meir");
       names.add("Nizan");
     
       //O(n) - מחקית אלמנט 
       names.remove(0);
       System.out.println(names.get(1));

       //רשימות מערך לא דינמיות - צריך להגדיר את גודל הרשימה
       int[] nums = new int[10];

       // אינדקס רנדומלי: אפשר להשתמש באינדקסים
       for(int i = 0; i < 10; ++i)
           nums[i] = i;

       // הדפסת ערכים באינדקסים מסוימים
       // nums[0] = 100; // אפשר לשנות את הערך באינדקס מסוים

       /**
        * אם אנחנו לא יודעים את מספר האינדקס 
        * צריך לבצע - חיפוש לינארי O(n)
        * אם אנחנו רוצים את האינדקס 6
        */
      //  for(int i = 0; i < 10; i++)
      //     if(nums[i] == 6)
      //       System.out.println("we have found the item at index " + i);
     }
}
