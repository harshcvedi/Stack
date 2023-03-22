
public class JavaBasics {   

	
	public static void main(String args[]){
		Queue q=new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Display();
	}
}

	class Queue{
		private int arr[];
		private int front;
		private int size;

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
