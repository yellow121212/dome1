import java.util.Scanner;
public class MyTest2 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int choose = sc.nextInt();
	if (choose==0) {
		System.out.println("С����");
		} else if (choose==2) {
				System.out.println("��û����֬");
			} else if (choose==3) {
					System.out.println("����Ϊ֮");
				}	else {
						System.out.println ("��֪�������ǼҸ��");
					}
	}
}