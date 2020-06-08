package p1024;

/*
 * 작성자: 정은애
 * 작성일: 2020.06.08.
 * 코드업 1024. 입출력(단어 1개 나누어)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (String s : reader.readLine().split(""))
			System.out.println("'" + s + "'");
	}

}
