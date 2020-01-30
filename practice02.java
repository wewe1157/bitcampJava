package Day02;

class Q1{
	public Q1() {
		this.answer();
	}
	//�������� 3-3
	//���� num�� ���� ���� ''���'' ''����'' ''0'' ���
	static public void answer() {
		int num = 0;
		System.out.printf("------%nQ1%n%n");
		System.out.println((num == 0 ? "0" : num > 0 ? "���" : "����" ));
	}
}

class Q2{
	public Q2() {
		this.answer();
	}
	//�������� 3-5
	//���� num�� 1�� �ڸ��� 1�� ���ٴ� ���� �ۼ�
	//�� num = 797  -> 791 
	static public void answer() {
		int num =  889;
		System.out.printf("------%nQ2%n%n");
		System.out.println((num / 10 * 10 + 1));
	}
}

class Q3{
	public Q3() {
		this.answer();
	}
	//�������� 3-6
	//���� num�� ���� ����� 10���ڸ��� ���ϰ�, num�� 10�� �ڸ����� ���� ���Ͻÿ�.
	//�� 24 = 6 , 53= 7
	static public void answer() {
		int num =  58;
		System.out.printf("------%nQ3%n%n");
		System.out.println(10-(num % 10));
	}
}

class Q4{
	public Q4() {
		this.answer();
	}
	//�������� 3-7
	//ȭ���� ������ ���ٱ�
	//C = 5/9 *(F-32) ����Ҷ�, 4�ڸ����� �ݿø��Ѵ�.
	static public void answer() {
		int farenheight = 100;
		float celcius = (float)5/9 *(farenheight-32);
		if(celcius * 10000 % 10 >= 5) {
			celcius = (int)(celcius * 1000 + 10) / 10 ;
			celcius *= 0.01;
		}
		System.out.printf("------%nQ4%n%n");
		System.out.println("farenheight:" + farenheight);
		System.out.println("celcuius:" + celcius);
	}
}

class Q5{
	public Q5() {
		this.answer();
	}
	//�������� 3-8
	//�ڵ带 ������ �ùٸ��� ��µǰ� �ϼ���.
	static public void answer() {
		
		byte a = 10 ;
		byte b = 20 ;
		byte c = (byte)(a + b);
		//int���� ���� �� ������ ����ɶ�. ���������� int�� ��ȯ�ȴ�.
		//�׷��Ƿ� byte�� ���� ĳ��������� �������� ���Եȴ�.
		
		char ch = 'A';
		ch = (char)(ch + 2) ;
		
		float f = (float)3 / 2;
		
		System.out.printf("------%nQ5%n%n");
		System.out.println("byte c :" + c);
		System.out.println("ch : " + ch);
		System.out.println("f : " + f);
	}
}

class Q6{
	public Q6() {
		this.answer();
	}
	//�������� 3-10
	//�����ڵ忡�� ���� �ҹ��ڴ� �빮�ں��� 32��ŭ �� ũ��.
	//A = 65 �϶�, �빮�ڸ� �ҹ��ڷ� ���ٴ� �ڵ带 �ۼ��ض�
	static public void answer() {
		
        char ch = 'A';
        char lowerCase = ch < 97 ? (char)(ch + 32) : ch;
		
		System.out.printf("------%nQ6%n%n");
		System.out.println("ch : " + ch);
		System.out.println("lowerCase : " + lowerCase);
	}
}


public class practice02 {
	public static void main(String[] args) {
		
		Q1.answer();
		Q2.answer();
		Q3.answer();
		Q4.answer();
		Q5.answer();
		Q6.answer();
	}
}
