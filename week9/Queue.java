interface Queue{
	abstract boolean isEmpty();
	abstract boolean isFull();
	abstract int enqueue(int item);
	abstract int dequeue();		
}

class MyQueue implements Queue
{
	int[] data= new int[10];
	int rear = -1;
	int front = 0;
	public boolean isEmpty()
	{
		if ((rear < front ))
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if (rear == 9 )
			return true;
		else
			return false;
	}
	

	@Override
	public int enqueue(int item) {
		// TODO Auto-generated method stub
		
		if(!isFull())
		{
			data[++rear] = item;
			
		}
		return 0;
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		if(!isEmpty ())
		{
			return data[front++];
		}
		return 0;
	}
}


public class Que  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue= new MyQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		queue.enqueue(4);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(5);
		System.out.println(queue.dequeue());
		queue.enqueue(6);
		System.out.println(queue.dequeue());	
	}
}
