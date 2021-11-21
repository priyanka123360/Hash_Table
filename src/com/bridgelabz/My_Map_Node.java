package com.bridgelabz;

public class My_Map_Node<K,V> implements I_Node<K> {
	private K key;
	private Integer value;
	private I_Node<K> next;

	public My_Map_Node(K key, Integer value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public K getKey() {

		return this.key;
	}

	@Override
	public void setKey(K key) {
		
		this.key = key;
	}

	@Override
	public void setNext(I_Node<K> next) {
		
		this.next = next;

	}

	@Override
	public I_Node<K> getNext() {
		return next;
	}

	@Override
	public String toString() {
		return "MyMapNode [key=" + key + ", value=" + value + "]";
	}

}
