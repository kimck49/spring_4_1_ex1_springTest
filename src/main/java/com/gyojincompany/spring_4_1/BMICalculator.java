package com.gyojincompany.spring_4_1;

public class BMICalculator {
	
	private double lowWeight;//저체중 기준 지수
	private double normalWeight;//정상체중 기준 지수
	private double overWeight;//과체중 기준 지수
	private double obesityWeight;//비만 기준 지수
	
	public void bmiCalculation(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h*h);//몸무게 나누기 키*0.01의 제곱 = BMI지수
		
		System.out.println("BMI 지수 : " + result);
		
		if(result > obesityWeight) {
			System.out.println("비만 입니다");
		} else if(result > overWeight) {
			System.out.println("과체중 입니다");
		} else if(result > normalWeight) {
			System.out.println("정상체중 입니다");		
		} else {			
			System.out.println("저체중 입니다");
		}
	
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormalWeight(double normalWeight) {
		this.normalWeight = normalWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesityWeight(double obesityWeight) {
		this.obesityWeight = obesityWeight;
	}
	
	
	
}
