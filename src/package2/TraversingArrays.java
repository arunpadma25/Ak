package package2;

public class TraversingArrays {

	public static void main(String[] args) {

		int[] a= new int[5];
		
		for(int e: a) {
			System.out.println(e);
		}
		
		int len = a.length;
		
		for(int i = 0; i < len; i++) {
			a[i] = i+1;
			System.out.println("element "+i+" is: "+a[i]);
		}
		
		
		int[][] b = new int[2][3];
		
		for(int[] arr: b) {
			for(int e : arr) {
				System.out.println(e);
			}
		}
		for(int i = 0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}
		
	}

}
