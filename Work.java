import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Work {
	public static void main(String args[]) {
		int choose1 = 2;
		int choose2 = 0;
		int num = 100;
		int number = 10;
		//Scanner scanner = new Scanner(System.in); // 接收数据
		Random random = new Random();
//		PrintStream ps;
//		try {
//			ps = new PrintStream("D:\\result.txt");
//			System.setOut(ps);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		while (true) {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.print("请选择二则运算或四则运算(请输入2或4)：");
				choose1 = scanner.nextInt();
				if (choose1 != 2 && choose1 != 4) {
					System.out.println("输入错误,请重新输入");
					continue;
				}
				System.out.print("请输入题目数量：");
				number = scanner.nextInt();
				System.out.print("请输入操作数数值范围：");
				num = scanner.nextInt();
				System.out.print("请选择操作数是否含有负数(请输入0或1)：");
				choose2 = scanner.nextInt();
				if (choose2 != 0 && choose1 != 1) {
					System.out.println("输入错误,请重新输入");
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("输入错误,请重新输入");
				continue;
			}
			break;
		}
		
		int operand1;
		int operand2;
		int operand3;
		int operand4;
		double result = 0;
		char operate = 0;
		int array1[] = new int[number];
		int array2[] = new int[number];
		if (choose1 == 2) {
			if (choose2 == 0) {
				label:for (int i1 = 0; i1 < number; i1++) {
					operand1 = (int) (Math.random() * num + 1);
					operand2 = (int) (Math.random() * num + 1);
					array1[i1] = operand1;
					array2[i1] = operand2;
						for (int i2 = 0; i2 < i1; i2++) {
							if (array1[i1] == array1[i2] && array2[i1] == array2[i2]) {
								i1=i1-1;
								//System.out.println("重复了,已剔除");
								continue label;
							}
						}
					switch (random.nextInt(2)) {
					case 0:
						operate = '+';
						result = operand1 + operand2;
						break;
					case 1:
						operate = '-';
						result = operand1 - operand2;
						break;
					}
					System.out.println(operand1 + "" + operate + operand2 + "=" + result);
				}

			} else if (choose2 == 1) {

				label:for (int i1 = 0; i1 < number; i1++) {
					operand1 = (int) (Math.random() * num + 1);
					operand2 = (int) (Math.random() * num + 1);
					operand3 = (int) (Math.random() * (num + 1) * (-1));
					operand4 = (int) (Math.random() * (num + 1) * (-1));
					array1[i1] = operand1;
					array2[i1] = operand2;
						for (int i2 = 0; i2 < i1; i2++) {
							if (array1[i1] == array1[i2] && array2[i1] == array2[i2]) {
								i1=i1-1;
								continue label;
							}
						}
					switch (random.nextInt(8)) {
					case 0:
						operate = '+';
						result = operand1 + operand2;
						System.out.println(operand1 + "" + operate + operand2 + "=" + result);
						break;
					case 1:
						operate = '-';
						result = operand1 - operand2;
						System.out.println(operand1 + "" + operate + operand2 + "=" + result);
						break;
					case 2:
						operate = '+';
						result = operand1 + operand3;
						System.out.println(operand1 + "" + operate + "(" + operand3 + ")" + "=" + result);
						break;
					case 3:
						operate = '-';
						result = operand1 - operand3;
						System.out.println(operand1 + "" + operate + "(" + operand3 + ")" + "=" + result);
						break;
					case 4:
						operate = '+';
						result = operand3 + operand1;
						System.out.println(operand3 + "" + operate + operand1 + "=" + result);
						break;
					case 5:
						operate = '-';
						result = operand3 - operand1;
						System.out.println(operand3 + "" + operate + operand1 + "=" + result);
						break;
					case 6:
						operate = '+';
						result = operand3 + operand4;
						System.out.println(operand3 + "" + operate + "(" + operand4 + ")" + "=" + result);
						break;
					case 7:
						operate = '-';
						result = operand3 - operand4;
						System.out.println(operand3 + "" + operate + "(" + operand4 + ")" + "=" + result);
						break;
					}
				}
			}
		} else if (choose1 == 4) {
			if (choose2 == 0) {
				label:for (int i1 = 0; i1 < number; i1++) {
					operand1 = (int) (Math.random() * num + 1);
					operand2 = (int) (Math.random() * num + 1);
					array1[i1] = operand1;
					array2[i1] = operand2;
						for (int i2 = 0; i2 < i1; i2++) {
							if (array1[i1] == array1[i2] && array2[i1] == array2[i2]) {
								i1=i1-1;
								System.out.println("重复了");
								continue label;
							}
						}
						if (operand1 * operand2 > Double.MAX_VALUE)
							{
								i1--;
								continue;
							}
					switch (random.nextInt(4)) {
					case 0:
						operate = '+';
						result = operand1 + operand2;
						break;
					case 1:
						operate = '-';
						result = operand1 - operand2;
						break;
					case 2:
						operate = '×';
						result = operand1 * operand2;
						break;
					case 3:
						operate = '÷';
						result = (double) operand1 / (double) operand2;
						break;
					}
					System.out.println(operand1 + "" + operate + operand2 + "=" + result);
				}
			} else if (choose2 == 1) {
				label:for (int i1 = 0; i1 < number; i1++) {
					operand1 = (int) (Math.random() * num + 1);
					operand2 = (int) (Math.random() * num + 1);
					operand3 = (int) (Math.random() * (num + 1) * (-1));
					operand4 = (int) (Math.random() * (num + 1) * (-1));
					array1[i1] = operand1;
					array2[i1] = operand2;
						for (int i2 = 0; i2 < i1; i2++) {
							if (array1[i1] == array1[i2] && array2[i1] == array2[i2]) {
								i1=i1-1;
								System.out.println("重复了");
								continue label;
							}
						}
						if (operand1 * operand2 > Double.MAX_VALUE || operand1 * operand3 < Double.MIN_VALUE
								|| operand3 * operand1 < Double.MIN_VALUE || operand3 * operand4 > Double.MAX_VALUE
								|| operand1 * operand3 < Double.MIN_VALUE || operand1 * operand3 < Double.MIN_VALUE
								|| operand3 / operand4 > Double.MAX_VALUE)
						{
							i1--;
							continue;
						}
					switch (random.nextInt(16)) {
					case 0:
						operate = '+';
						result = operand1 + operand2;
						System.out.println(operand1 + "" + operate + operand2 + "=" + result);
						break;
					case 1:
						operate = '-';
						result = operand1 - operand2;
						System.out.println(operand1 + "" + operate + operand2 + "=" + result);
						break;
					case 2:
						operate = '+';
						result = operand1 + operand3;
						System.out.println(operand1 + "" + operate + "(" + operand3 + ")" + "=" + result);
						break;
					case 3:
						operate = '-';
						result = operand1 - operand3;
						System.out.println(operand1 + "" + operate + "(" + operand3 + ")" + "=" + result);
						break;
					case 4:
						operate = '+';
						result = operand3 + operand1;
						System.out.println(operand3 + "" + operate + operand1 + "=" + result);
						break;
					case 5:
						operate = '-';
						result = operand3 - operand1;
						System.out.println(operand3 + "" + operate + operand1 + "=" + result);
						break;
					case 6:
						operate = '+';
						result = operand3 + operand4;
						System.out.println(operand3 + "" + operate + "(" + operand4 + ")" + "=" + result);
						break;
					case 7:
						operate = '-';
						result = operand3 - operand4;
						System.out.println(operand3 + "" + operate + "(" + operand4 + ")" + "=" + result);
						break;
					case 8:
						operate = '×';
						result = operand1 * operand2;
						System.out.println(operand1 + "" + operate + operand2 + "=" + result);
						break;
					case 9:
						operate = '×';
						result = operand1 * operand3;
						System.out.println(operand1 + "" + operate + "(" + operand3 + ")" + "=" + result);
						break;
					case 10:
						operate = '×';
						result = operand3 * operand1;
						System.out.println(operand3 + "" + operate + operand1 + "=" + result);
						break;
					case 11:
						operate = '×';
						result = operand3 * operand4;
						System.out.println(operand3 + "" + operate + "(" + operand4 + ")" + "=" + result);
						break;
					case 12:
						operate = '÷';
						result = (double) operand1 / (double) operand2;
						System.out.println(operand1 + "" + operate + operand2 + "=" + result);
						break;
					case 13:
						operate = '÷';
						result = (double) operand1 / (double) operand3;
						System.out.println(operand1 + "" + operate + "(" + operand3 + ")" + "=" + result);
						break;
					case 14:
						operate = '÷';
						result = (double) operand3 / (double) operand2;
						System.out.println(operand3 + "" + operate + operand1 + "=" + result);
						break;
					case 15:
						operate = '÷';
						result = (double) operand3 / (double) operand4;
						System.out.println(operand3 + "" + operate + "(" + operand4 + ")" + "=" + result);
						break;
					}
				}
			}
		}
	}
	
}
