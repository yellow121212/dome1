import java.util.Scanner;
public class MyTest2 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int choose = sc.nextInt();
	if (choose==0) {
		System.out.println("小黑子");
		} else if (choose==2) {
				System.out.println("有没有树脂");
			} else if (choose==3) {
					System.out.println("好自为之");
				}	else {
						System.out.println ("就知道黑我们家哥哥");
					}
	}
}