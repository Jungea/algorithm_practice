package p1014;

/*
 * 작성자: 정은애
 * 작성일: 2020.06.08.
 * 코드업 1014. 입출력(정수 2개)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		char x = tokenizer.nextToken().charAt(0);
		char y = tokenizer.nextToken().charAt(0);
		System.out.println(y + " " + x);
	}

}
