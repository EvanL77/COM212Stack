//Evan Lyons 4/2/24
//Program Two
//This class creates the functions for stack with an Linked List. 

public class StackLL
{
	private Node S = null;
	
	public StackLL(){
		
	}
	public Node top(){
		return S;
	}
	
	public void push(Node x){
		
		
		x.setNext(S);
		S=x;
			
	}
	public Node pop(){
		Node temp=S;
		S = S.getNext();
		temp.setNext(null);
		return temp;
	}
	
	// printStack method for StackLL
    public void printStack() {
        Node temp = S;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }
    
	public boolean isEmpty(){
		return S == null;
	}
	

}
