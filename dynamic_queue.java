
public class JavaBasics {   

	
	public static void main(String args[]){
		Dynamic_Queue dq=new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Display();
	}
}

	class Queue{
		protected int arr[];
		protected int front;
		protected int size;

		public Queue(){
				 arr=new int[5];
				front=0;
				size=0;
		}
		public Queue(int n){
			 arr=new int[n];
			front=0;
			size=0;
	}
		public boolean isEmpty(){
				return size==0;
			}

		public boolean isfull(){
				return size==arr.length;
			}

		public void Enqueue(int item){
			int idx=(front+size)%arr.length;
			arr[idx]=item;
			size++;
		} 

		public int Dequeue(){
			int rv=arr[front];
			front=(front+1)%arr.length;
			size--;
			return rv;
		}

		public int getfront(){
			int x=arr[front];
			return x;
		}

		public void Display(){
			for(int i=0;i<size;i++){
				int idx=(front+i)%arr.length;
				System.out.print(arr[idx]+" ");

			}System.out.println();
		}
	}

	class Dynamic_Queue extends Queue{
		@Override
		public void Enqueue(int item){
			if(isfull()){
			int ans[]=new int[2*arr.length];
				for(int i=0;i<arr.length;i++){
					int idx=(front+i)%arr.length;
					ans[i]=arr[idx];
				}
				front=0;
				arr=ans;
			}
			super.Enqueue(item);
			
		}
	}
