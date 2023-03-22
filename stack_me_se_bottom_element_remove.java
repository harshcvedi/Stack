public static void main(String args[]){
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(Lastvalue(st));
	}

	public static int Lastvalue(Stack<Integer> st){
		if(st.size()==1){
			return st.peek();
		}


		int item=st.pop();
		int x=Lastvalue(st);
		st.push(item);
		return x;

	}
