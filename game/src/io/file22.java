package io;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

/*
 * 응용문제 info.txt를 이용하여 member.csv에 데이터를 입력시켜야 합니다.
 * comma 기준으로 각각의 data를 저장되도록
 * 코드를 작성하시오. 단, Stream, Writer 선택
 */

public class file22 {
	public static void main(String[] args) throws Exception{
		Path path = Paths.get("./game/src/io/info.txt");
		Path copyPath = Paths.get("./game/src/io/member.csv");
		List<String> list = Files.lines(path).collect(Collectors.toList());
		Files.write(copyPath, list, Charset.forName("euc-kr"));
	}
}
