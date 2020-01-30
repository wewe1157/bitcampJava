package Day02;

class Q1{
	public Q1() {
		this.answer();
	}
	//연습문제 3-3
	//변수 num의 값에 따라 ''양수'' ''음수'' ''0'' 출력
	static public void answer() {
		int num = 0;
		System.out.printf("------%nQ1%n%n");
		System.out.println((num == 0 ? "0" : num > 0 ? "양수" : "음수" ));
	}
}

class Q2{
	public Q2() {
		this.answer();
	}
	//연습문제 3-5
	//변수 num의 1의 자리를 1로 봐꾸는 연산 작성
	//예 num = 797  -> 791 
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
	//연습문제 3-6
	//변수 num의 가장 가까운 10의자리를 구하고, num과 10의 자리와의 차를 구하시오.
	//예 24 = 6 , 53= 7
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
	//연습문제 3-7
	//화씨를 섭씨로 봐꾸기
	//C = 5/9 *(F-32) 라고할때, 4자리에선 반올림한다.
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
	//연습문제 3-8
	//코드를 수정해 올바르게 출력되게 하세요.
	static public void answer() {
		
		byte a = 10 ;
		byte b = 20 ;
		byte c = (byte)(a + b);
		//int보다 작은 두 변수가 연산될때. 연산결과값은 int로 변환된다.
		//그러므로 byte로 직접 캐스팅해줘야 오류없이 대입된다.
		
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
	//연습문제 3-10
	//유니코드에서 영어 소문자는 대문자보다 32만큼 더 크다.
	//A = 65 일때, 대문자를 소문자로 봐꾸는 코드를 작성해라
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
