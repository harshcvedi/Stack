	
	public static void main(String args[]){
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
		
	}

	public static void reverse(Stack<Integer> st){
		if(st.isEmpty()){
			return;
		}


		int item=st.pop();
		reverse(st);
		bottom(st, item);

	}
	public static void bottom(Stack<Integer> st,int extra){
		if(st.isEmpty()){
			st.push(extra);
			return;
		}
		int item=st.pop();
		bottom(st, extra);
		st.push(item);
	}
