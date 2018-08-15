package com.sjd;



import java.util.logging.Level;
import java.util.logging.Logger;
import com.sjd.calculate.CalculateAction;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
   		CalculateAction calc = new CalculateAction();
   		logger.log(Level.INFO,"Devine result: " + calc.getDevine(1,0));
	}

}
