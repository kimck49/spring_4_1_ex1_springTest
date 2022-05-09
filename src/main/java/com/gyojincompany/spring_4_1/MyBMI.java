package com.gyojincompany.spring_4_1;

import java.util.ArrayList;

public class MyBMI {
	
	private String name;
	private double weight;
	private double height;
	private BMICalculator bmiCalcu;
	private ArrayList<String> hobbys;	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public BMICalculator getBmiCalcu() {
		return bmiCalcu;
	}

	public void setBmiCalcu(BMICalculator bmiCalcu) {
		this.bmiCalcu = bmiCalcu;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	public void myBmiCalculation() {
		bmiCalcu.bmiCalculation(weight, height);	
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("취미 : " + hobbys);
		
		myBmiCalculation();
	}
	
	
	
}
