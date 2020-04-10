import java.util.Scanner;
public class Second{
	public static void main(String[] args)
	{
		System.out.println("Введите Ваше имя и фамилию");
		Scanner name = new Scanner(System.in);
		System.out.println("Здравствуйте, " + name.nextLine());
	}
}
