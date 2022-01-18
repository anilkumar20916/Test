import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.IntStream;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Java method :::");
		
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.of(12, 20);
		LocalDateTime localDateTime = LocalDateTime.now(); 
		System.out.println("localDate"+localDate);
		System.out.println("localTime"+localTime);
		System.out.println("localDateTime  "+localDateTime);
		
		System.out.println("Normal...");
	      
		IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);

        System.out.println("Parallel...");
		
		anil
		anild
		asdd
		asd

        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println); 
		
		sanjay
		
	}
	
	public void test(test){
		

}
