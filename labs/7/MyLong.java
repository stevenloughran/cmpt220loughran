// Steven Loughran
// Lab 7 - My Long
// April 3, 2019

public class MyLong {
	long value;

	MyLong(long value) {
		this.value = value;
	}

	long getValue() {
		return value;
	}

	boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	boolean isOdd() {
		if (value % 2 == 0)
			return false;
		else
			return true;
	}

	boolean isPrime() {
		if (value == 1)
			return false;
		for (int i = 2; i * i <= value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	static boolean isEven(long value) {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	static boolean isOdd(long value) {
		if (value % 2 == 0)
			return false;
		else
			return true;
	}

	static boolean isPrime(long value) {
		if (value == 1)
			return false;
		for (int i = 2; i * i <= value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	static boolean isEven(MyLong mylongl) {
		if (mylongl.getValue() % 2 == 0)
			return true;
		else
			return false;
	}

	static boolean isOdd(MyLong mylongl) {
		if (mylongl.getValue() % 2 == 0)
			return false;
		else
			return true;
	}

	static boolean isPrime(MyLong mylongl) {
		if (mylongl.getValue() == 1)
			return false;
		for (int i = 2; i * i <= mylongl.getValue(); i++) {
			if (mylongl.getValue() % i == 0)
				return false;
		}
		return true;
	}

	static long parseLong(char ch[]) {
		String str = "";
		
		for (int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		return Long.parseLong(str);
	}

	static long parseLong(String str) {
		return Long.parseLong(str);
	}

}
