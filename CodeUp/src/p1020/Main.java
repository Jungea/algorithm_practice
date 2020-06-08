package p1020;

/*
 * 작성자: 정은애
 * 작성일: 2020.06.08.
 * 코드업 1020. 입출력(주민번호)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), "-");
		System.out.println(tokenizer.nextToken() + tokenizer.nextToken());
	}

}
