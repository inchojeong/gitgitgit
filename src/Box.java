public class Box {
	private int width, height; //�ڽ��� �ʺ�� ����
	private char fillchar; //�ڽ��� �׸��� �� ����ϴ� ����
	
	public Box() { //�Ű� ���� ���� ������. 10x1�� �ڽ� ����
		this(10 ,1); //this �̿��Ͽ� �ϼ��϶�
	}
	
	public Box(int width, int height) { //�ʺ�, ������ �� �Ű� ������ ���� ������
		this.width = width; // this ���۷����� �̿��϶�
		this.height = height; // this ���۷����� �̿��϶�
	}
	
	public void draw() { //�ڽ� �׸��� �޼ҵ�
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print(fillchar);
			}
			System.out.println("");
		}
	}
	
	public void fill(char c) { //�ڽ��� �׸��� �� ����ϴ� ���� ����
		this.fillchar = c;
	}
	
	public static void main(String[] args) {
		Box a = new Box(); // 10x1 �簢��
		Box b = new Box(20, 3); //20x3 �簢��
		a.fill('*'); //box�׸� �� ����ϴ� ���� '*'
		b.fill('%'); //box�׸� �� ����ϴ� ���� '%'
		a.draw(); //�ڽ� a �׸���
		b.draw(); //�ڽ� b �׸���
	}
}
