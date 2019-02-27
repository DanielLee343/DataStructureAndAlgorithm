package assignment;

public class SLLIterator implements java.util.Iterator<SLLNode>{
	private int currentPosition;
	private SLLNode[] iteratedListArray;
	
	public SLLIterator(int firstNode, SLLNode[] listArray){
		this.currentPosition = firstNode;
		this.iteratedListArray = listArray;
	}
	
	@Override
	public boolean hasNext() {
		if(currentPosition!=-1)
			return true;
		else return false;
	}

	@Override
//	public String next() {
//		int oldPosition=currentPosition;
//		currentPosition=iteratedListArray[currentPosition].getNext();
//		return iteratedListArray[oldPosition].getData();
//				
//	}
	public SLLNode next() {
		int oldPosition=currentPosition;
		currentPosition=iteratedListArray[currentPosition].getNext();
		return iteratedListArray[oldPosition];
				
	}
	
	public void remove() throws java.lang.UnsupportedOperationException{
		throw new java.lang.UnsupportedOperationException("Sorry, the operation is incorrect, please try again!");
	}
}
