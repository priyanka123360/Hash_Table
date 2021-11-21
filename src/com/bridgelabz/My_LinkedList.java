package com.bridgelabz;

public class My_LinkedList<K> {
	private I_Node<K> head;
	private I_Node<K> tail;

	public I_Node<K> search(K key) {
		I_Node<K> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	public void append(I_Node<K> myNode) {

		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	

	public boolean remove(K key) {
		
		I_Node<K> temp =head;
		I_Node<K> prev = null;
		while(temp != null) {
			if(temp.getKey()==key) {
				prev.setNext(temp.getNext());
				return true;
			} 
			prev = temp;
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}
