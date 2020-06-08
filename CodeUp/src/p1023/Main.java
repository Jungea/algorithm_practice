package p1023;

/*
 * 작성자: 정은애
 * 작성일: 2020.06.08.
 * 코드업 1023. 입출력(실수 1개)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), ".");
		System.out.println(tokenizer.nextToken());
		System.out.println(tokenizer.nextToken());
	}

}
