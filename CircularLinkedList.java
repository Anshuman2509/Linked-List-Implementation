package test6;

public class CircularLinkedList {
	Node head;
	Node tail;
	
	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			tail.next=head;
		}else {
			tail.next=node;
			tail=node;
			tail.next=head;
		}
	}
	
	public void disp() {
		Node current=head;
		do {
			System.out.print(current.data+" ");
			current=current.next;
		}while(current!=head);
		System.out.println();
	}

	public int nodeCount() {
		int count=0;
		Node current=head;
		do {
			current=current.next;
			count++;
		}while(current!=head);
		return count;
	}
	public void delete(int index) {
		int counter=0,count=nodeCount()-1;
		Node current=head,previous=null;
		if(index==0) {
			head=head.next;
		}else {
			do {
				if(counter==index) {
					if(counter!=count)
					previous.next=current.next;
					else {
						previous.next=tail.next;
						tail=previous;
					}
				}
				previous=current;
				current=current.next;
				counter++;
			}while(current!=head);
		}
		
	}
	public static void main(String[] args) {
		CircularLinkedList list =new CircularLinkedList();
		list.insert(20);
		list.insert(90);
		list.insert(50);
		list.insert(40);
		list.insert(270);
		list.insert(80);
		
		list.disp();
		list.delete(5);
		list.disp();
		

		

	}

}
