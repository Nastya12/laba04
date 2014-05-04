package laba04;

public interface WeightLoss {
	void getInfoLoss();
	void getInfoGaining();
	void getInfoMaintenance();
}

class BasicProgram implements  WeightLoss{
	public void getInfoLoss(){
		System.out.println("�������� ������� 1");
		System.out.println("��������������� ���������");
		System.out.println("������������ ������� ������������");
		System.out.println("Cell-U-Loss");
	}
	public void getInfoGaining(){
		System.out.println("�������� ������� 1");
		System.out.println("���������������� �������� ������� 2");
		System.out.println("����������� ����� ������� 3");
		System.out.println("�������������");
		System.out.println("����������� ���������");
	}
	public void getInfoMaintenance(){
		System.out.println("�������� ������� 1");
		System.out.println("���������������� �������� ������� 2");
		System.out.println("����������� ����� ������� 3");
		System.out.println("������� � �������� N-R-G");
	}
}

class ExpandedProgram extends BasicProgram implements  WeightLoss{
	public void getInfoLoss(){
		super.getInfoLoss();
		System.out.println("���������������� �������� ������� 2");
		System.out.println("��� Gerbal Aloe");
		System.out.println("��������� ���������");
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
		System.out.println("����������� ����� ������� 3");
		System.out.println("������������");
	}
	public void getInfoGaining(){
		super.getInfoGaining();
		System.out.println("������� ��� �������� N-R-G");
		System.out.println("����������");
	}
	public void getInfoMaintenance(){
		super.getInfoMaintenance();
		System.out.println("�������������");
		System.out.println("����������");
		System.out.println("��������");
	}
}
