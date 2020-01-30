package Day02;

class Car {
	
	int width, height ;
	
	public Car() {
		width = 10;
		height = 10;
	}
	
	void powerOn() {
		System.out.println("부릉~~~");
	}
}

class Police extends Car{
	boolean siren = false;
	
	void sirenOn() {
		this.siren = true;
		System.out.println("삐용삐용");
	}
	void powerOn(){
		this.sirenOn();
		System.out.println("경찰차 부릉~~~");
	}
}

//참조변수의 형변환
public class ex01 {
	
	public static void main(String[] args)
	{
		Car c = new Car() ;
		Police p = new Police();
		
		c.powerOn();
		p.powerOn();
		
		// 부모 <- 자식(묵시적 형변환)
		c = p;
		c.powerOn();
		//c.siren = false;
		
		p = (Police)c;
	}
}
