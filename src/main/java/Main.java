class Main {
  public static int exe14(int[] arr, int i) {
		if(i==0)
			return arr[0];
	return arr[i]+exe14(arr,i-1);
	}
	public static int exe15(int[] arr, int i) {
		if(i==0) {
			if(arr[i]>0)
				return 1;
			else
				return 0;
		}
		if(arr[i]>0)
			return 1+exe15(arr,i-1);
		else
			return exe15(arr,i-1);
	}
	public static int exe16(int[] arr,int num,int i) {
		if(i==arr.length)
			return -1;
		if(arr[i]==num)
			return i;
		return exe16(arr,num,i+1);
	}
	public static boolean exe17(int[] arr, int i) {
		if(i==arr.length-1)
			return true;
		int prev=arr[i];
		int curr=arr[i+1];
		if(prev>curr)
			return false;
		return exe17(arr,i+1);
		
	}
	public static boolean exe8(int n,int p) {
		if(p==1)
			return true;
		if(n%p==0)
			return false;
		return exe8(n,p-1);
		
	}
	public static boolean exe18(int[] arr, int i) {
		if(i==arr.length)
			return true;
		if(exe8(arr[i],arr[i]/2))
			return false;
		return exe18(arr,i+1);
	}
	public static boolean ezer19(int[] a, int num, int n) {
		if(n<0)
			return false;
		else
			if(a[n]==num)
				return true;
			else
				return ezer19(a,num,n-1);
	}
	public static int exe19(int[][] arr, int num, int i) {
		if(i==-1)
			return 0;
		if(ezer19(arr[i],num,arr[i].length-1))
			return 1+exe19(arr,num,i-1);
		return exe19(arr,num,i-1);
	}
	public static boolean ezer20(int[] arr, int l,int r) {
		if(l>=r)
			return true;
		if(arr[r]!=arr[l])
			return false;
		return ezer20(arr,l+1,r-1);
	}
	public static boolean exe20(int[] arr ) {
		int a=(int)(Math.random()*arr.length);
		int b=(int)(Math.random()*arr.length);
		if(a>b) {
			return ezer20(arr,b,a);
		}
		else {
			return ezer20(arr,a,b);
		}
		
	}
  public static void main(String[] args) {
    int[][] a= {{1,2,3,4},{2,4,8,9},{1,6,8,6}};
		int[] c= {15,4,8,12};
		System.out.println(exe14(c,2));
		System.out.println(exe15(c,3));
		System.out.println(exe16(c,4,0));
		System.out.println(exe17(c,0));
		System.out.println(exe18(c,0));
		System.out.println(exe19(a,1,2));
		System.out.println(exe20(c));
  }
}
