	
	public static void main(String args[]){
		
		int arr[]={2,1,3,9,8,4,7,6};
		Next_greater(arr);

		
	}

	public static void Next_greater(int arr[]){
		Stack<Integer> st=new Stack<>();
		int ans[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			while((!st.isEmpty() && arr[i]>arr[st.peek()])){
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()){
			ans[st.pop()]=-1;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(ans[i]+" ");
		}System.out.println();

	}
