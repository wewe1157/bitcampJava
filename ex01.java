package Day02;

class Car {
	
	int width, height ;
	
	public Car() {
		width = 10;
		height = 10;
	}
	
	void powerOn() {
		System.out.println("�θ�~~~");
	}
}

class Police extends Car{
	boolean siren = false;
	
	void sirenOn() {
		this.siren = true;
		System.out.println("�߿�߿�");
	}
	void powerOn(){
		this.sirenOn();
		System.out.println("������ �θ�~~~");
	}
}

//���������� ����ȯ
public class ex01 {
	
	public static void main(String[] args)
	{
		Car c = new Car() ;
		Police p = new Police();
		
		c.powerOn();
		p.powerOn();
		
		// �θ� <- �ڽ�(������ ����ȯ)
		c = p;
		c.powerOn();
		//c.siren = false;
		
		p = (Police)c;
	}
}
