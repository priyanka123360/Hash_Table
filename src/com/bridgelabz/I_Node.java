package com.bridgelabz;

public interface I_Node<K> {

	K getKey();

	void setKey(K key);

	void setNext(I_Node<K> next);

	I_Node<K> getNext();

}
