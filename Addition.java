class Addition{	
	/*public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}*/
	public int add(int b,int... a){
             int sum=0;
		for(int i=0;i<a.length;i++){		
			sum=sum+a[i];
		}
          return sum;
}
	public static void main(String args[]){
		Addition a=new Addition();
		//int sum=a.add(3,4);
		//int sum2=a.add(4,5,6);
		int sum2=a.add(4,5,6,4,5);
 		//System.out.println("Addition of a and b is="+sum);
		System.out.println("Addition of a and b is="+sum2);
	}
}