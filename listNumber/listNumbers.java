package listNumber;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class listNumbers {
    public static void numList(Integer [] listNum){
        Predicate<Integer> isPositive = (n) -> n >= 0;
        Predicate<Integer> isEven = (n) -> n % 2 ==0;
        Predicate<Integer> isGTen = (n) -> n > 10;
        List<Integer> evenNumbers= Arrays.stream(listNum).filter(isEven).collect(Collectors.toList());
        List<Integer> PositiveNumbers= Arrays.stream(listNum).filter(isPositive).collect(Collectors.toList());
        List<Integer> GreaterTen= Arrays.stream(listNum).filter(isGTen).collect(Collectors.toList());
        System.out.println("Positive Numbers : " +PositiveNumbers);
        System.out.println("Even Numbers : " +evenNumbers);
        System.out.println("Numbers Greater Than 10: " +GreaterTen);
    }
    public static void main(String[] args){
        Integer [] listNum = {3, -2, 10, 15, -7, 8, 0, 21, -3, 5 };
        List<Integer> numbers = Arrays.asList(listNum);
        System.out.println("Original List : "+numbers);
        listNumbers num = new listNumbers();

        num.numList(listNum);
        }

}

