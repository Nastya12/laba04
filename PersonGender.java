package laba04;

import java.io.IOException;
import java.util.logging.*;

@SuppressWarnings("unused")
public interface PersonGender{
	double Calories();
	void PFC(double goal,double slimming);
	double CaloriesP(double level, double slimming);
}

class Woman implements PersonGender {
	private static Logger log = Logger.getLogger(Demo.class.getName());
	double weight, height;
	int age;
	Woman ( double weight, double height, int age){
		log.entering(Woman.class.getName(), "Woman ( double weight, double height, int age)");
        assert weight > 0 : "Invalid weight value";
        log.finest("assert weight > 0 is validated");
        assert  height > 0 : "Invalid  height value";
        log.finest("assert  height > 0 is validated");
        assert  age > 0 : "Invalid  age value";
        log.finest("assert  age > 0 is validated");
		this.weight=weight;
		this.height=height;
		this.age=age;
		log.exiting(Woman.class.getName(), "Woman ( double weight, double height, int age)");
	}
	public double Calories(){
		return 655+(9.5*weight)+(1.8*height)-(4.7*age);
	}
	public void PFC(double level,double slimming){
		//System.out.println("��������� ��� ������ ���� � �������� " + Math.rint(((this.Calories()*level)* slimming)) + " ����");
		System.out.println("������ " + Math.rint(((((this.Calories()*level)* slimming)*0.30)/4)) + " �");
		System.out.println("����� " + Math.rint(((((this.Calories()*level)* slimming)*0.15)/9)) + " �");
		System.out.println("��������� " + Math.rint(((((this.Calories()*level)* slimming)*0.45)/4)) + " �");
		}
	public double CaloriesP(double level, double slimming)
	{
		return Math.rint(((this.Calories()*level)* slimming));
	}
	
}

class Man implements PersonGender{
	private static Logger log = Logger.getLogger(Demo.class.getName());
	double weight, height;
	int age;
	Man ( double weight, double height, int age){
		
		log.entering(Man.class.getName(), "Man ( double weight, double height, int age)");
        assert weight > 0 : "Invalid weight value";
        log.finest("assert weight > 0 is validated");
        assert  height > 0 : "Invalid  height value";
        log.finest("assert  height > 0 is validated");
        assert  age > 0 : "Invalid  age value";
        log.finest("assert  age > 0 is validated");
		this.weight=weight;
		this.height=height;
		this.age=age;
		log.exiting(Man.class.getName(), "Man ( double weight, double height, int age)");
	}
	public double Calories(){
		return 66+(13.7*weight)+(5*height)-(6.8*age);
	}
	public void PFC(double level, double slimming){
		//System.out.println("��������� ��� ������ ���� � �������� " + Math.rint(((this.Calories()*level)* slimming)) + " ����");
		System.out.println("������ " + Math.rint(((((this.Calories()*level)* slimming)*0.30)/4)) + " �");
		System.out.println("����� " + Math.rint(((((this.Calories()*level)* slimming)*0.15)/9)) + " �");
		System.out.println("��������� " + Math.rint(((((this.Calories()*level)* slimming)*0.45)/4)) + " �");
	}
	public double CaloriesP(double level, double slimming)
	{
		return Math.rint(((this.Calories()*level)* slimming));
	}
}
