
public class Operator03 {
	public static void main(String[] args) {
		/* 산술연산자 : (이항 연산자 == 두개의 값을 가지고 연산한다)
		 * +, -, *, /, % 순서는 (*, /, %) (+ -) 순이다
		 * 
		 * 복합 대입 연산자 : 산술연산자와 대입연산자가 결합되어있는 형태
		 * 연산처리 속도가 빨라지므로 사용하는 걸 권장!
		 * 
		 * +=, -=, *=, /=, %=
		 * ex) a = a + 3 >> a += 3
		 * a = a - 3 >> a -= 3
		 * a = a * 3 >> a *= 3
		 * a = a / 3 >> a /= 3
		 * a = a % 3 >> a %= 3
		 */
		int a = 5; // a=5
		int b = 10; // a=5 b=10
		
		//a = a + b; 이 식을 복합 대입 연산자를 사용해 a += b 이런식으로 사용 가능;
		int score = 0;
		score = score + 100; // => score += 100;
		
		int c = (++a) + b; // a=6 b=10 c=16
		int d = c / a; // a=6 b=10 c=16 d=2
		int e = c % a; // a=6 b=10 c=16 d=2 e=4
		int f = e++; // a=6 b=10 c=16 d=2 e=4 f=4
		int g = (--b) + (d--); // a=6 b=9 c=16 d=2 e=5 f=4 g=11
		int h = 2; // a=6 b=9 c=16 d=1 e=5 f=4 g=11 h=2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		// a=6 b=9 c=15 d=1 e=6 f=4 g=11 h=2 i=12
		// 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		// 6 + 9 / 3 * 10 % 8
		// 6 + 30 % 8
		// 12
		
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
		System.out.println("a = " + a); // 7
		System.out.println("b = " + b); // 9
		System.out.println("c = " + c); // 15
		System.out.println("d = " + d); // 1
		System.out.println("e = " + e); // 6
		System.out.println("f = " + f); // 4
		System.out.println("g = " + g); // 10
		System.out.println("h = " + h); // 2
		System.out.println("i = " + i); // 12
		System.out.println(score);
	}
}
