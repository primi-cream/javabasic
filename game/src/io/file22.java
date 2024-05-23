package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		
		Files.list(Paths.get(".")).forEach(System.out::println);
		
		Path path = Paths.get("./src/io/info.txt");
		Path copyPath = Paths.get("./src/io/member.csv");
		List<String> list = Files.lines(path).collect(Collectors.toList());
		Files.write(copyPath, list, Charset.forName("euc-kr"));
		
		
//		String inputPath = ".\\src\\io\\info.txt";
//        String outputPath = ".\\src\\io\\member.csv";
//
//        List<String> lines = new ArrayList<>();
//
//        // 파일 읽기
//        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
//            String textLines;
//            while ((textLines = br.readLine()) != null) {
//                lines.add(textLines);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 파일 쓰기
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath, Charset.forName("euc-kr")))) {
//            for (String line : lines) {
//                bw.write(line);
//                bw.newLine();
//                bw.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		
	}
}
