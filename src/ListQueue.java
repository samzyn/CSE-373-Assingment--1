//Sam Wahbeh
//1367607
//stwahbeh

public class ListQueue {
	
	private int size;
	private ListQueueNode front;
	private ListQueueNode back;
	
	
	public ListQueue(){
		front = null;
		back = null;
		size = 0;
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
		size++;
		if (size == 1) {
			back = new ListQueueNode (toEnqueue);
			front = back;
		}
		else {
		back.next = new ListQueueNode (toEnqueue);
		back = back.next;
		}
	}
	
	/**
	 * @function removes the string from the front of the queue
	 * @return the string from the front of the queue
	 */
	public String dequeue(){		
		if (isEmpty()){
			return "This dequeue operation is unavailable";
		} 
		else {
		size--;
		String toDequeue = "";
		toDequeue = front.data;
		front = front.next;
		return toDequeue;
		}
		
	}
		
	
	/**
	 * 
	 * @return returns true if the queue is empty, false otherwise
	 */
	public boolean isEmpty(){
		return front == null;
	}

	//Private listQueueNode class
	
	private class ListQueueNode {
	    public String data;        // this person's name
	    public ListQueueNode next;  // next node in the list
	    
    //constructs a ListQueueNode with just a string 

	    public ListQueueNode(String data) {
	        this (data, null);
	    }
	    
    //ListQueueNode constructs with data and next

	    public ListQueueNode(String data, ListQueueNode next) {
	        this.data = data;
	        this.next = next;
	    }
	}

}


