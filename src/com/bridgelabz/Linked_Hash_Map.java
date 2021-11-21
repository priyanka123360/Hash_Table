package com.bridgelabz;

import java.util.ArrayList;

public class Linked_Hash_Map<K, V> {
	private final int numberOfBucket;
	ArrayList<My_LinkedList<K>> arrayList;

	public Linked_Hash_Map() {

		numberOfBucket = 10;
		arrayList = new ArrayList<>();
		for (int i = 0; i < numberOfBucket; i++) {
			arrayList.add(null);
		}
	}

	public Integer get(K key) {

		int indexNumber = this.getBucketNumber(key);
		My_LinkedList<K> linkedList = arrayList.get(indexNumber);

		if (linkedList == null) {
			return null;
		}
		My_Map_Node<K, V> mapNode = (My_Map_Node<K, V>) linkedList.search(key);
		return mapNode == null ? null : mapNode.getValue();
	}

	private int getBucketNumber(K key) {

		int hashCode = Math.abs(key.hashCode());
		return hashCode % this.numberOfBucket;
	}

	public void put(K key, Integer value) {

		int index = this.getBucketNumber(key);
		My_LinkedList<K> linkedList = this.arrayList.get(index);
		if (linkedList == null) {
			linkedList = new My_LinkedList<>();
			this.arrayList.set(index, linkedList);
		}

		My_Map_Node<K, V> my_Map_Node = (My_Map_Node<K, V>) linkedList.search(key);
		if (my_Map_Node == null) {
			my_Map_Node = new My_Map_Node<>(key, value);
			linkedList.append(my_Map_Node);
		} else {
			my_Map_Node.setValue(value);
		}
	}

	public boolean remove(K key) {

		int index = this.getBucketNumber(key);
		My_LinkedList<K> linkedList = this.arrayList.get(index);

		My_Map_Node<K, V> myMapNode = (My_Map_Node<K, V>) linkedList.search(key);

		linkedList.remove(key);
		arrayList.remove(index);
		return true;
	}

	@Override
	public String toString() {
		return "LinkedHashMap [arrayList=" + arrayList + "]";

	}
}
