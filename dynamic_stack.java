public class JavaBasics {   

	
	public static void main(String args[]){
		Dynamic_Stack ds=new Dynamic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(60);
		ds.push(60);
		ds.display();

		}
		
	 }
 class Stack {


		protected int[] arr;
		protected int tos;//index
	
		public Stack(){//constructor
			arr=new int[5];
			tos=-1;//ek bhi element nhi hai isliye -1
		}
	
		public Stack(int n){
			arr=new int[n];
			tos=-1;
		}
	
		public boolean isEmpty(){
			return tos==-1;
		}
		public boolean isfull(){
			return tos==arr.length-1;
	
		}
		public void push(int item) {
			
			tos++;
			arr[tos]=item;
		}
	
		public int size(){
			return tos+1;
		}
	
		public int pop(){
		  
			int x=arr[tos];
			tos--;
			return x;
		}
	
		public int peek(){
			int x=arr[tos];
			return x;
		}
	
		public void display(){
			for(int i=0;i<=tos;i++){
				System.out.println(arr[i]+" ");
			}
			System.out.println(".");
		}
	}
	
class Dynamic_Stack extends Stack{
		@Override
		public void push(int item){
			if(isfull()){
				int [] a =new int[2*arr.length]; 
				for(int i=0;i<arr.length;i++){
					a[i]=arr[i];
				}
				arr=a;
			}
			//push(item);//stack overflow error pehle yeh same push ko kr rha tha recursive ho rha hai
			super.push(item);//ab yeh parent class ki chizo ko use krega super keyword ko use krke
		}
	}
