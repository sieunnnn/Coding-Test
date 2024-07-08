package elice.day01;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PROB06 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static List<Long> numbers = new ArrayList<>();
    static long sum = 0;

    public static void main(String[] args) throws IOException {
        String input = br.readLine();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            numbers.add(Long.parseLong(matcher.group()));
        }

        for(long number: numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
