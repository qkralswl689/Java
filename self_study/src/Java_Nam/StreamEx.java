package Java_Nam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
//		
//		// ����Ʈ ����
//		List<Integer> list = Arrays.asList(1,2,3,4,5); 
//		
//		// ����Ʈ -> ��Ʈ�� => list�� ������ �ҽ��� �ϴ� ���ο� ��Ʈ�� ����
//		Stream<Integer> intStream = list.stream();
//		
//		// ��Ʈ����� ���
//		intStream.forEach(System.out::print); // forEach : ��������
//		
//		System.out.println();
//		// Stream�� 1ȸ��, Stream�� ���� ���������� �����ϸ� Stream�� ������
//		// ���� ��� => ��Ʈ���� �������� �Ǿ��� ������ -> ��Ʈ�� �ٽ� �����ؼ� ����ؾ� �Ѵ�
//		intStream = list.stream(); // list�κ��� stream�� ����
//		intStream.forEach(System.out::print);	
//		
		// Stream.of �޼ҵ� ��� (�������� �Է�)
		// Stream<String> strStream = Stream.of("a","b","c");
		
		// �迭�� �ֱ�
		String[] strArr = new String[] {"a","b","c","d"};
		// Stream<String> strStream = Stream.of(strArr);
		// �Ǵ� 
		Stream<String> strStream = Arrays.stream(strArr);
		
		// ���� �� ���ٷ� ���ΰ�
		// Stream<String> strStream = Stream.of(new String[] {"a","b","c","d"});
		
		// Stream���
		strStream.forEach(System.out::println);
		
		// IntStream ��� => �⺻�� ��Ʈ���� �ȴ�
		// �⺻��Ʈ�� : COUNT �޼ҵ� �̿ܿ��� ���� �޼ҵ尡 �ִ� => SUM,AVG ��...
//		int[] intArr = {1,2,3,4,5};
//		IntStream intStream = Arrays.stream(intArr);
		
		// Stream<Integer> ��� => Integer��ü ��Ʈ���� �ȴ�
		// COUNT �޼ҵ� �� �����Ѵ�
		Integer[] intArr = {1,2,3,4,5};
		Stream<Integer> intStream = Arrays.stream(intArr);
		
		
		// Stream���
		intStream.forEach(System.out::println);
	}
}