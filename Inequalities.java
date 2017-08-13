import java.util.Arrays;

public class Inequalities {
	public static int dotProduct(int[] a, int[] b){
		if(a.length!=b.length){
			return 0;
		}
		int sum = 0;
		for(int i = 0;i<a.length;i++){
			sum+=a[i]*b[i];
		}
		return sum;
	}

	public static int[] concatenate (int[] a, int[] b){
		int[] c = new int[a.length+b.length];
		for(int i = 0;i<a.length;i++){
			c[i] = a[i];
		}
		
		for(int i = a.length;i<c.length;i++){
			c[i] =b[i-a.length];
		}
		
		return c;
	}
	
	public static boolean cs(int[] a, int[] b){
		if(a.length!=b.length){
			return false;
		}
		int lhs = dotProduct(a,b);
		int rhs = dotProduct(a,a)*dotProduct(b,b);
		return lhs <= rhs;
	}
	
	public static boolean amgm(int[] a){
		int sum = 0;
		for(int i =0;i<a.length;i++){
			sum+=a[i];
		}
		int arithmeticmean = sum/a.length;
		
		int result =1;
		for(int i =0;i<a.length;i++){
			sum*=a[i];
		}
		double geometricmean = Math.pow(result, 1/a.length);
		return arithmeticmean>geometricmean;
	}
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		
		int[] arr1 = new int[(args.length-1)/2];
		int[] arr2 = new int[(args.length-1)/2];
		for(int i = 1;i<=length;i++){
			arr1[i-1]= Integer.parseInt(args[i]);
		}
					// 3        5
		for(int i = length+1;i<args.length;i++){
			arr2[i-(length+1)]= Integer.parseInt(args[i]);
		}
		
		System.out.println(cs(arr1, arr2));
		System.out.println(amgm(concatenate(arr1,arr2)));
	}
	
	
}
