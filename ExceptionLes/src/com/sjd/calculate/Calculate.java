package com.sjd.calculate;

import com.sjd.exception.MyException;

public class Calculate {
private int num1;
private int num2;
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) throws MyException {
		if (num2 == 0)
		throw new MyException("divine at zero!") ;
	this.num2 = num2;
}
public void calc(int num1,int num2) {
	
}
}
