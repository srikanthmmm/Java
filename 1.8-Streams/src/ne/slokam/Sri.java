package ne.slokam;

public class Sri {
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,8,9,12,123,11232,56};
		
		for(int i=1;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("Is prime: "+arr[i]);
			}else {
				System.out.println("Is not Prime: "+arr[i]);
			}
		}
		
		
		
		
		
		
		
		//Missing Number
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		System.out.println("Sum : "+sum1);
		
		int sum2=0;
		for(int i=1;i<=9;i++) {
			sum2=sum2+i;
		}
		System.out.println("Total numbers: "+sum2);
		System.out.println("Missing number: "+(sum2-sum1));
	}

}
