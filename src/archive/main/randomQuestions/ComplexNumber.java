package archive.main.randomQuestions;

public class ComplexNumber {

	int real;
	int img;

	public ComplexNumber addNum(ComplexNumber one, ComplexNumber two) {

		one.img = one.img + two.img;
		one.real = one.real + two.real;

		print(one);

		return one;
	}

	public ComplexNumber mulNum(ComplexNumber one, ComplexNumber two) {

		ComplexNumber result = new ComplexNumber();
		
		result.real = (one.real * two.real) - (one.img * two.img);
		result.img = (one.real * two.img) + (one.img * two.real);

		print(result);

		return one;

	}

	public void print(ComplexNumber num) {

		if (num.img < 0) {

			num.img = num.img * (-1);

			System.out.println(num.real + " - i" + num.img);

		} else {
			System.out.println(num.real + " + i" + num.img);

		}

	}

	public static void main(String[] args) {

		ComplexNumber cm = new ComplexNumber();

		cm.real = -5;
		cm.img = 6;

		ComplexNumber cm1 = new ComplexNumber();
		cm1.real = 2;
		cm1.img = 3;

		//cm.addNum(cm, cm1);
		cm.mulNum(cm, cm1);

	}
}
