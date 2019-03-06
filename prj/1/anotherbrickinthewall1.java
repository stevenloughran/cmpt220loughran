import java.util.Scanner;

public class anotherbrickinthewall1 {

	public static void main(String[] args) {
		System.out.print("a");
		int h = 0;
		int w = 0;
		int b = 0;
		int sizes = 0;

		Scanner input = new Scanner(System.in);

		h = input.nextInt();
		w = input.nextInt();
		b = input.nextInt();
		sizes = input.nextInt();

		boolean complete = false;

		int width = 0;
		int height = 0;

		while (b!=0) {
			b--;
		if (height < h) {
			width += sizes;
		if (width == w) {
			++height;
			width = 0;
		} else if (width > w) {
			height = h + 1;
		}
		if (height == h)
			complete = true;
		}
}
		if (complete)
			System.out.println("YES");
		else
			System.out.println("NO");
		}
	}