package laba04;

import java.util.*;
import java.io.IOException;
import java.util.logging.*;

public class Demo {
	 
	private static Logger log = Logger.getLogger(Demo.class.getName());
	public static void main(String[] args){
		
		 try {
             LogManager.getLogManager().readConfiguration(
                     Demo.class.getResourceAsStream("/logging.properties"));
         } catch (IOException e) {
             System.err.println("Could not setup logger configuration: " + e.toString());
         }
		 PersonGender person1=new Woman(60,170,18);
			assert person1.CaloriesP(1.2, 0.8) == 1380;
		 
		 @SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		int slimming, p, age, gender, level;
		double weight, height,lev = 0,slim = 0;
		log.severe("jfhskjdfhjksdfhsk");
		System.out.println("��� ��� � ��: ");
		weight=sr.nextDouble();
		System.out.println("��� ���� � ��: ");
		height=sr.nextDouble();
		System.out.println("��� �������: ");
		age=sr.nextInt();
		System.out.println("�������� ���������� �������: ");
		System.out.println("1 - ������� ����� ����� � ������ ���������� ");
		System.out.println("2 - 1-3 ���� � ������ ������� ���������� ");
		System.out.println("3 - 3-5 ��� � ������ ���������� ");
		System.out.println("4 - 5-7 ��� � ������ ���������� ��� ������� ������ ");
		level=sr.nextInt();
		switch(level){
		case 1:{lev=1.2;}break;
		case 2:{lev=1.38;}break;
		case 3:{lev=1.55;}break;
		case 4:{lev=1.73;}break;
		}
		System.out.println("��� ���: ");
		System.out.println("1 - ������� ");
		System.out.println("2 - ������� ");
		gender=sr.nextInt();
		PersonGender person = null;
		switch(gender){
		case 1:{person=new Woman(weight,height,age);}break;
		case 2:{person=new Man(weight,height,age);}break;
		}
		System.out.println("���� ����.");
		System.out.println("1 - �������� ����.");
		System.out.println("2 - ����� ���� (�������� �����).");
		System.out.println("3 - ����������� ����.");
		slimming=sr.nextInt();
		switch(slimming){
		case 1:{slim=0.8;}break;
		case 2:{slim=1.2;}break;
		case 3:{slim=1.0;}break;
		}
		System.out.println("���� �������");
		System.out.println("1 - �������(��� �������� ����, ������ ����, ����������� ����).");
		System.out.println("2 - �����������(��� �������� ����, ����������� ����).");
		System.out.println("3 - ��������������(��� �������� ����, ������ ����, ����������� ����).");
		p=sr.nextInt();
		WeightLoss plan = null;
		switch(p){
		case 1:{plan=new BasicProgram();}break;
		case 2:{plan=new ExpandedProgram();}break;
		case 3:{plan=new IndividuallyProgram();}break;
		}
		System.out.println("");
		
		person.PFC(lev,slim);
		System.out.println("���������� ��� ������ ���� � �������� " + person.CaloriesP(lev,slim) + " ����");
		System.out.println("");
		System.out.println("�������� ������ ��������� ��� �������");
		switch(slimming){
		case 1:{plan.getInfoLoss();}break;
		case 2:{plan.getInfoGaining();}break;
		case 3:{plan.getInfoMaintenance();}break;
		}
		System.out.println("");
		System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
    }
}

@SuppressWarnings("serial")
class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}