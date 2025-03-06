package apna;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("hell");
		
		for(int i=0;i<sb.length()/2;i++) {
			int front=i;
			int back=sb.length()-1-i;
			
			char frontChar=sb.charAt(front);
			char backChar=sb.charAt(back);
			
		sb.setCharAt(front, backChar);
		sb.setCharAt(back, frontChar);
			
		}
		System.out.println(sb);
		
		/*System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'S');
		System.out.println(sb);
		
		sb.insert(2, 'n');
		System.out.println(sb);
		
		sb.delete(2,4 );
		System.out.println(sb);*/

		int a=10;
		int b=0;
		b=a--;
		System.out.println(a);
		System.out.println(b);
	}

}
