package test6;

public class DoublyLinkedList {
	Node head;
	Node tail;
	
	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			head.next=null;
			tail.previous=null;
		}else {
			tail.next=node;
			node.previous=tail;
			tail=node;
			node.next=null;
		}
	}
	
	public void disp1() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	public void disp2() {
		Node current=tail;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.previous;
		}
		System.out.println();
	}
	
	public void insertAtPos(int data,int position) {
		int index=0;
		Node current=head,previous=null;
		while(current!=null) {
			if(index==position) {
				Node node=new Node(data);
				previous.next=node;
				node.previous=previous;
				current.previous=node;
				node.next=current;
				break;
			}
			previous=current;
			current=current.next;
			index++;
		}
	}
	
	public void delete(int position) {
		Node current=head,previous=null;
		int index=0;
		
		if(position!=0) {
		while(current!=null) {
			if(index==position) {
				previous.next=current.next;
				current=current.next;
				current.previous=previous;
				break;
			}
			previous=current;
			current=current.next;
			index++;
		}
		}else {
			current=current.next;
			head=current;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.insert(20);
		list.insert(90);
		list.insert(50);
		list.insert(40);
		list.insert(270);
		list.insert(80);
		
		list.disp1();
		list.disp2();
		list.insertAtPos(370,2);

		list.disp1();
		list.disp2();
		
		list.delete(2);
		list.disp1();
		list.delete(0);
		list.disp1();
		
	}

}
