package com.app;

import com.pattern.Pattern;
import com.pattern.Shape;

public class App {
	 public static void main(String[] args) {
		 Pattern pattern = new Pattern();

	      //get an object of Circle and call its draw method.
	      Shape circle = pattern.getShape("CIRCLE");

	      //call draw method of Circle
	      circle.draw();

	      //get an object of Rectangle and call its draw method.
	      Shape rectangle = pattern.getShape("RECTANGLE");

	      //call draw method of Rectangle
	      rectangle.draw();

	      //get an object of Square and call its draw method.
	      Shape square = pattern.getShape("SQUARE");

	      //call draw method of square
	      square.draw();
	   }
}
