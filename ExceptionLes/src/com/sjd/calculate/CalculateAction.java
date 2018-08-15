package com.sjd.calculate;

import com.sjd.exception.MyException;

public class CalculateAction {
  
   public String getDevine(int a,int b) {
   Calculate calc = new Calculate();
   calc.setNum1(a);
   try {
	  calc.setNum2(b); 
   }catch (MyException e) {
	  System.err.println(e.getMessage());
	  System.exit(0);
   }
   String result =Integer.toString(a/b);
   return result;
   }
}
