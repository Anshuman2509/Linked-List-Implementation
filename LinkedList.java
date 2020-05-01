package test6;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node(data);
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}

	public void disp() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void delete(int key) {
		Node current = head, previous = null;
		int counter = 0;
		if (counter == 0) {
			head=head.next;
		} else {
			while (current != null) {
				if (counter == key) {
					previous.next = current.next;
					break;
				}
				previous = current;
				current = current.next;
				counter++;
			}
		}
	}
	
	public void insertAtPosition(int data,int position) {
		Node current=head,previous=null;
		int index=0;
		while(current!=null) {
			if(index==position) {
				Node node=new Node(data);
				previous.next=node;
				node.next=current;
				break;
			}
			previous=current;
			current=current.next;
			index++;
		}
	}

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(30);
		list.insert(90);
		list.insert(50);
		list.insert(40);
		list.insert(10);
		list.insert(20);
		
		list.disp();
		list.delete(2);
		list.disp();
		list.delete(0);
		list.disp();
		list.insertAtPosition(25, 2);
		list.disp();
		list.insertAtPosition(52, 4);
		list.disp();
		
	}

}
