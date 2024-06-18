/**
 * המשימה שלך היא לבנות אלגוריתם שיבדוק אם שתי מילים (או ביטויים) הן אנאגרמות או לא

"אנגרמה היא מילה או ביטוי שנוצרו על ידי סידור מחדש של האותיות של מילה או ביטוי אחר,
 בדרך כלל תוך שימוש בכל האותיות המקוריות פעם אחת בדיוק
 */


package com.globalsoftwaresupport;

import java.util.Arrays;

public class AnagramProblem {
     // בךואיני עם שני מערים לשני מילים
	public boolean solve(char[] s1, char[] s2) {
		// נכנס ללולאה רק אם האורך שווה
		if(s1.length != s2.length) return false;
		
		// sort the letters of the strings
		// O(NlogN) this is the "bottleneck" of the algorithm
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		// consider all the letters one by one and we have to
		// compare these letters
		// O(N) but the overall running time is O(NlogN) + O(N) = O(NlogN)
		for(int i=0;i<s1.length;++i) 
			if(s1[i] != s2[i])
				return false;
		
		return true;
	}
}
