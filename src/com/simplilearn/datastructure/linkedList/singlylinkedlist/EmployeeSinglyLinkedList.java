package com.simplilearn.datastructure.linkedList.singlylinkedlist;

public class EmployeeSinglyLinkedList {

	private EmployeeNode head;
	private int size;
	
	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	public void addToFront(Employee employee){
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size ++;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while(current !=null) {
			System.out.print(current.getData());
			System.out.print("->");
			current = current.getNext();
			
		}
		System.out.println("null");
	}
}
