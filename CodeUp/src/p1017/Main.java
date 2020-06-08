package p1017;

/*
 * 작성자: 정은애
 * 작성일: 2020.06.08.
 * 코드업 1017. 입출력(3번 출력)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		System.out.println(a + " " + a + " " + a);
	}

}
