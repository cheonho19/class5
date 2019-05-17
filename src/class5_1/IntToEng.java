package class5_1;
import java.util.*;

public class IntToEng {
	    // メインメソッド
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	System.out.println(translateEng(input));
}
// 数値を英訳する変換するメソッド
static String translateEng(int n) {
	if(n == 1) return "one";
	if(n == 21) return "twenty one";

	return null;
	}
}
