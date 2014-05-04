package laba04;

public interface WeightLoss {
	void getInfoLoss();
	void getInfoGaining();
	void getInfoMaintenance();
}

class BasicProgram implements  WeightLoss{
	public void getInfoLoss(){
		System.out.println("Коктейль Формула 1");
		System.out.println("Активированнная клетчатка");
		System.out.println("Растительный напиток Термоджетикс");
		System.out.println("Cell-U-Loss");
	}
	public void getInfoGaining(){
		System.out.println("Коктейль Формула 1");
		System.out.println("Мультивитаминный комплекс Формула 2");
		System.out.println("Протеиновая смесь Формула 3");
		System.out.println("Гербалайфлайн");
		System.out.println("Протеиновые батончики");
	}
	public void getInfoMaintenance(){
		System.out.println("Коктейль Формула 1");
		System.out.println("Мультивитаминный комплекс Формула 2");
		System.out.println("Протеиновая смесь Формула 3");
		System.out.println("Напиток и таблетки N-R-G");
	}
}

class ExpandedProgram extends BasicProgram implements  WeightLoss{
	public void getInfoLoss(){
		super.getInfoLoss();
		System.out.println("Мультивитаминный комплекс Формула 2");
		System.out.println("Сок Gerbal Aloe");
		System.out.println("Клеточный активатор");
	}
	public void getInfoGaining(){
		super.getInfoGaining();
	}
	public void getInfoMaintenance(){
		super.getInfoMaintenance();
	}
}

class IndividuallyProgram extends ExpandedProgram implements  WeightLoss{
	public void getInfoLoss(){
		super.getInfoLoss();
		System.out.println("Протеиновая смесь Формула 3");
		System.out.println("Термокомплит");
	}
	public void getInfoGaining(){
		super.getInfoGaining();
		System.out.println("Напиток или таблетки N-R-G");
		System.out.println("ЭкстраКаль");
	}
	public void getInfoMaintenance(){
		super.getInfoMaintenance();
		System.out.println("Гербалайфлайн");
		System.out.println("ЭкстраКаль");
		System.out.println("РоузГрад");
	}
}
