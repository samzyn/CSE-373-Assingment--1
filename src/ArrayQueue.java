	//Sam Wahbeh
	//1367607
	//stwahbeh

public class ArrayQueue {
	private String[] queueArray;
	private int size;
	private int front;
	private int back;
	
	public ArrayQueue(){
		queueArray = new String[100];
		size = 0;
		front = 0;
		back = -1;
	}
	
	public ArrayQueue(int startSize){
		queueArray = new String[startSize];
		size = 0;
		front = 0;
		back = -1;
	}
	/**
	 * @function returns the number of elements in the queue
	 * @return size
	 */
	public int getSize(){
		return size;
	}
	/**
	 * @function adds a string to the end of the queue
	 * @param toEnqueue: the input to be inserted
	 */
	
	
	
	public void enqueue(String toEnqueue){
		if(!isFull()){
			size++;
			if (back == queueArray.length){
				back = 0;
				queueArray[back] = toEnqueue;
			}
			else {
				int place = (back + 1) % queueArray.length;
				queueArray[place] = toEnqueue;
				back = place;
			}
		}
		
	}
	
	
	/**
	 * @function removes the string from the front of the queue
	 * @return the string from the front of the queue
	 */
	public String dequeue(){
		if (isEmpty()){
			return "This operation is unavailable";
		} 
		else {
			size--;
			String toDequeue = "";
			toDequeue = queueArray[front];
			front = (front + 1) % queueArray.length;
			return toDequeue;
		}
	}
	
	/**
	 * 
	 * @return returns true if the queue is empty, false otherwise
	 */
	public boolean isEmpty(){
		return size == 0;
	}

	/**
	 * 
	 * @return returns true if the queue is full, false otherwise
	 */
	public boolean isFull(){
		return size == queueArray.length;
	}
}
