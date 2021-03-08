package Java_Nam;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {

		// RandomŬ���� ��ü ���� .ints �޼ҵ� ȣ��
		// int���� ��Ʈ�� ��ȯ
		// IntStream intStream = new Random().ints();// ���ѽ�Ʈ��
		// IntStream intStream = new Random().ints(5,10); // ���ѽ�Ʈ��, ���� ���� => 5���� 10���� => 10�� ����X
//		IntStream intStream = new Random().ints(7,5,10); // limit 7��,5���� 10���� 
//		
//		// ��Ʈ�� ���
//		// limit(5) : 5���� ����ϱ�
//		intStream.limit(5).forEach(System.out::println);
		
		
		// iterate(T seed, UnaryPoerator(���׿�����) f) 
		// 1) iterate() �̿��� ¦�� ��Ʈ�� ����
		// n -> n + 2 : ���ٽ� 
		// Stream<Integer> intStream = Stream.iterate(2, n -> n + 2); 
		
		// 1-2) iterate() �̿��� Ȧ�� ��Ʈ�� ����
		Stream<Integer> intStream = Stream.iterate(1, n -> n + 2); 
		
		// 1) Stream ���
		//intStream.limit(10).forEach(System.out::println);
		
		// generate(Supplier s) : �ֱ⸸ �ϴ°� �Է�X, ��� O
		// 2) generate() �̿� : 1�� �ݺ��ؼ� ���
		Stream<Integer> oneStream = Stream.generate(()->1);
		
		// 2) Stream ���
		oneStream.limit(10).forEach(System.out::println);

 	}
}