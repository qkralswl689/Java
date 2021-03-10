package com.javateam.jse;

public class OuterClass3 {
	
	// ������
	OuterClass3(){
		System.out.println("�ܺ� Ŭ������ ������");
	}
	
	// �Լ�(�޼ҵ�) ����
	void localMethod() {
		
		// ���� Ŭ���� => �޼��� ���ο� �����Ǹ� ���� Ŭ���� �̴�
		class LocalClass{
			
			// �ʵ�
			String name;
			
			// ������
			public LocalClass() {
				System.out.println("���� Ŭ������ ������");
			}
			
			// �޼���
			void print() {
				System.out.println("���� Ŭ������ �޼���");
			}
					
			
		} // LocalClass �� ��
		
		// �޼��� ���ο��� ����ϱ� ������ ���������� ����ϴ� ��
		LocalClass local = new LocalClass();
		local.name = "�ڹ�";
		local.print();
		
	} // localMethod() �� ��
	
	
	// �ٷ� mainŬ���� �����ϱ� 
	public static void main(String[] args) {
		
		// �͸� �޼ҵ� ȣ��(�ѹ����� ��)
		new OuterClass3().localMethod();
		
	}
	// localMethod �ϳ� �� ���� => bin �������� $2 �� �����Ǿ��ִ°� Ȯ��
		void localMethod2() {
			
			// ���� Ŭ���� => �޼��� ���ο� �����Ǹ� ���� Ŭ���� �̴�
			class LocalClass{
				
				// �ʵ�
				String name;
				
				// ������
				public LocalClass() {
					System.out.println("���� Ŭ������ ������");
				}
				
				// �޼���
				void print() {
					System.out.println("���� Ŭ������ �޼���");
				}
						
				
			} // LocalClass �� ��
			
			// �޼��� ���ο��� ����ϱ� ������ ���������� ����ϴ� ��
			LocalClass local = new LocalClass();
			local.name = "�ڹ�";
			local.print();
			
		} // localMethod() �� ��
		
		
}
