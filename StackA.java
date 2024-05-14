//Evan Lyons 4/2/24
//Program Two
//This class creates the functions for stack with an array. 

public class StackA
{
	private Node[] S = new Node[100];
	private int n = 0;
	
	public StackA(){
		
	}
	public Node top(){
		if(n==0)
			return null;
		else
			return S[n-1];
	}
	
	public void push(Node x){
		S[n]=x;
		n++;
	}
	public Node pop(){
		if(n!=0){
			n--;
			return S[n];
			}
		else
			return null;
	}
	
	public void printStack() {
       System.out.println(n);
	 for(int i = n-1; i >= 0; i--) {
            System.out.println(S[i].getKey());
       }
    }
    
	public boolean isEmpty(){
		if(n==0){
			return true;
			}
		else
			return false;
	}
	

}
