package assignment;

public class SLLNode {
	private String data;
	private int next;
	
	public SLLNode(String data){
		this.data = data;
	}
	
	public SLLNode(String data,int next){
		this.data = data;
		this.next = next;
	}
	
	public String getData(){
		return data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public int getNext(){
		return next;
	}
	
	public void setNext(int next){
		this.next = next;
	}
	
	public String toString(){
		/*return "Node[ data=" +data +"," +"next=" +next + "]";*/
		return data;
	}
}
