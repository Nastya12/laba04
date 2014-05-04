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
		System.out.println("Ваш вес в кг: ");
		weight=sr.nextDouble();
		System.out.println("Ваш рост в см: ");
		height=sr.nextDouble();
		System.out.println("Ваш возраст: ");
		age=sr.nextInt();
		System.out.println("Выберите подходящий вариант: ");
		System.out.println("1 - сидячий образ жизни с пешими прогулками ");
		System.out.println("2 - 1-3 раза в неделю обычные тренировки ");
		System.out.println("3 - 3-5 раз в неделю тренировки ");
		System.out.println("4 - 5-7 раз в неделю тренировки или тяжелая работа ");
		level=sr.nextInt();
		switch(level){
		case 1:{lev=1.2;}break;
		case 2:{lev=1.38;}break;
		case 3:{lev=1.55;}break;
		case 4:{lev=1.73;}break;
		}
		System.out.println("Ваш пол: ");
		System.out.println("1 - женский ");
		System.out.println("2 - мужской ");
		gender=sr.nextInt();
		PersonGender person = null;
		switch(gender){
		case 1:{person=new Woman(weight,height,age);}break;
		case 2:{person=new Man(weight,height,age);}break;
		}
		System.out.println("Ваша цель.");
		System.out.println("1 - Снижение веса.");
		System.out.println("2 - Набор веса (мышечной массы).");
		System.out.println("3 - Поддержание веса.");
		slimming=sr.nextInt();
		switch(slimming){
		case 1:{slim=0.8;}break;
		case 2:{slim=1.2;}break;
		case 3:{slim=1.0;}break;
		}
		System.out.println("План питания");
		System.out.println("1 - Базовый(для снижения веса, набора веса, поддержания веса).");
		System.out.println("2 - Расширенный(для снижения веса, поддержания веса).");
		System.out.println("3 - Индивидуальный(для снижения веса, набора веса, поддержания веса).");
		p=sr.nextInt();
		WeightLoss plan = null;
		switch(p){
		case 1:{plan=new BasicProgram();}break;
		case 2:{plan=new ExpandedProgram();}break;
		case 3:{plan=new IndividuallyProgram();}break;
		}
		System.out.println("");
		
		person.PFC(lev,slim);
		System.out.println("Количество еды должно быть в пределах " + person.CaloriesP(lev,slim) + " ккал");
		System.out.println("");
		System.out.println("Получить нужный результат вам помогут");
		switch(slimming){
		case 1:{plan.getInfoLoss();}break;
		case 2:{plan.getInfoGaining();}break;
		case 3:{plan.getInfoMaintenance();}break;
		}
		System.out.println("");
		System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
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