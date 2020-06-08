package p1012;

/*
 * 작성자: 정은애
 * 작성일: 2020.06.08.
 * 코드업 1012. 입출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float x = Float.parseFloat(reader.readLine());
		System.out.printf("%f", x);
	}

}
