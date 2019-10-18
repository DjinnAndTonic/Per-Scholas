package com.perscholas.exercises;


public class ExerciseOne {
	private int x,y;
	
	public ExerciseOne() {
		x = 0;
		y = 0;
	}

	public ExerciseOne(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int add() {
		return x + y;
	}
	
	public int subtract() {
		return x - y;
	}
	
	public int multiply() {
		return x * y;
	}
	
	public double divide() {
		return (double)x / y;
	}
}

