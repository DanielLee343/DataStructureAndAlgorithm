package assignment;


public class SinglyLinkedList {
	private static final int DEFAULT_MAXIMUM =20;
	private SLLNode[] listArray;
	private int first=-1;
	private int firstFree=0;
	public SinglyLinkedList() {
		first = -1;
		firstFree = 0;
		listArray = new SLLNode[DEFAULT_MAXIMUM];
		
	}

	public SinglyLinkedList(int size) {
		first = -1;
		firstFree = 0;
		listArray = new SLLNode[size];
		
	}
//	public SinglyLinkedList(){
//		listArray = new SLLNode[DEFAULT_MAXIMUM];
//	}
//	
//	public SinglyLinkedList(int size){
//		listArray = new SLLNode[size];
//	}
	public int size(){
		return firstFree;
	}
	
	/*
		This is task 1-6 insert() method
	*/
	public void insert(String data){
		SLLNode node = new SLLNode(data);
		listArray[firstFree]=node;
		int i=first;
		int oldIndex=-1;
		if(firstFree==0){
			
			listArray[firstFree].setNext(-1);
			firstFree++;
			first=0;
			return;
		}
		while(i!=-1){
			int compare = data.compareTo(listArray[i].getData());
			if(compare<0){
				if(i==first){
					first=firstFree;
					listArray[firstFree].setNext(i);
				}
				else{
					listArray[oldIndex].setNext(firstFree);
					listArray[firstFree].setNext(i);
				}
				firstFree++;
				return;
			}
			oldIndex=i;
			i=listArray[i].getNext();
		}
		
		listArray[oldIndex].setNext(firstFree);

		listArray[firstFree].setNext(-1);
		firstFree++;
	}
	
	/*
		This is insert() method in task 7
	*/
	public void insertTask7(String data) {
		int now = first;
		int previous = first;
		int insertedNode;
		if (first == -1) {
			listArray[firstFree] = new SLLNode(data);
			listArray[firstFree].setNext(-1);
			firstFree++;
			first = 0;
		} else {
			while ((listArray[now].getNext() != -1) && (data.compareTo(listArray[now].getData()) > 0)) {
				previous = now;
				now = listArray[now].getNext();
			}
			// to think of the situation that the node should insert in front of
			// the link
			if ((data.compareTo(listArray[now].getData()) <= 0) && (now == first)) {
				if (listArray[firstFree] == null) {
					listArray[firstFree] = new SLLNode(data);
					listArray[firstFree].setNext(first);
					first = firstFree;
					firstFree++;
				} else {
					insertedNode = firstFree;
					firstFree = listArray[firstFree].getNext();
					listArray[insertedNode] = new SLLNode(data);
					listArray[insertedNode].setNext(first);
					first = insertedNode;

				}

			}
			else if ((data.compareTo(listArray[now].getData()) <= 0) && (now != first)) {
				if (listArray[firstFree] == null) {
					listArray[firstFree] = new SLLNode(data);
					listArray[firstFree].setNext(now);
					listArray[previous].setNext(firstFree);
					firstFree++;
				} else {
					insertedNode = firstFree;
					firstFree = listArray[firstFree].getNext();
					listArray[insertedNode] = new SLLNode(data);
					listArray[insertedNode].setNext(now);
					listArray[previous].setNext(insertedNode);
				}
			}
			else if (data.compareTo(listArray[now].getData()) > 0) {
				if (listArray[firstFree] == null) {
					listArray[firstFree] = new SLLNode(data);
					listArray[firstFree].setNext(-1);
					listArray[now].setNext(firstFree);
					firstFree++;
				} else {
					insertedNode = firstFree;
					firstFree = listArray[firstFree].getNext();
					listArray[insertedNode] = new SLLNode(data);
					listArray[insertedNode].setNext(-1);
					listArray[now].setNext(insertedNode);
				}
			}
		}
	}
        


           /* 
            * This is remove() method in task 7
            * */
            
	public boolean removeTask7(String data) {
		int one = 0;
		int begin = first;
		int previousNode = 0;
		boolean finalboolean = false;
		boolean periodboolean = false;
		int savebegain = -1;
		while (one!=1) {
			if (listArray[begin].getData().equals(data)) {
				if (begin == first) {
					listArray[begin].setData(" ");
					first = listArray[first].getNext();
					savebegain = listArray[begin].getNext();
					listArray[begin].setNext(firstFree);
					firstFree = begin;
				}
				else if ((listArray[begin].getNext() == -1) && (begin != first)) {
					listArray[previousNode].setNext(-1);
					listArray[begin].setData(" ");
					// to save the value of the next
					savebegain = listArray[begin].getNext();
					//
					listArray[begin].setNext(firstFree);
					firstFree = begin;
				}
				else if ((listArray[begin].getNext() != -1) && (begin != first)) {
					listArray[begin].setData(" ");
					listArray[previousNode].setNext(listArray[begin].getNext());
					savebegain = listArray[begin].getNext();
					listArray[begin].setNext(firstFree);
					firstFree = begin;
				}
				one++;
				finalboolean = true;
				periodboolean = true;
			}
			if (periodboolean == false) {
				if (listArray[begin].getNext() == -1 || first == -1) {
					break;
				}
				previousNode = begin;
				begin = listArray[begin].getNext();
			} else {
				if (savebegain == -1 || first == -1) {
					break;
				}
				previousNode = begin;
				begin = savebegain;
			}
			periodboolean = false;
		}
		return finalboolean;
	}


	
	public String toString(){
		int i;
		String Node = "";
		for(i = 0; i<firstFree;i++)
		{
			Node = Node+String.valueOf(i)+": " +listArray[i].getData() +" " +listArray[i].getNext()+"\n";
		}
		return "first = "+ first + "\n" + "firstFree = "+firstFree +"\n\n" +Node;
	}
	
	public SLLIterator getIterator(){
		return new SLLIterator(first, listArray);
	}
	
	/*
		This is task 3:
	*/
	
/*	public boolean remove(String data){
		int i=first;
		int oldIndex=-1;
		while(i!=-1){
			int compare = data.compareTo(listArray[i].getData());
			if(compare == 0){
				if(i==first){
					first=listArray[i].getNext();
				}
				else{
					listArray[oldIndex].setNext(listArray[i].getNext());
				}
				return true;
			}
			oldIndex=i;
			i=listArray[i].getNext();
		}
		return false;		
	}*/
	
	/*
		This is remove() method in task 5:
	
	*/
	public boolean remove(String data){
		int i=first;
		int oldIndex=-1;
		while(i!=-1){
			int compare = data.compareTo(listArray[i].getData());
			if(compare == 0){
				if(i==first){
					first=listArray[i].getNext();
				}
				else{
					listArray[oldIndex].setNext(listArray[i].getNext());
				}
				if(i==firstFree-1){
					firstFree--;
					return true;
				}
				
				listArray[i]=listArray[firstFree-1];
				if(firstFree-1==first)
					first=i;
				else{
					int j=0;		
					for (; j < firstFree-2; j++) {
						if(firstFree-1==listArray[j].getNext())
							break;
					}
					listArray[j].setNext(i);
				}
				firstFree--;
				return true;
			}
			oldIndex=i;
			i=listArray[i].getNext();
		}
		return false;		
	}
}


