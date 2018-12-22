package com.github.eskorpado.stack;

import com.github.eskorpado.vector.VersionedVector;

public class DummyStack<T> extends VersionedVector<T> {

	public T push (T item) {
		addElement(item);
		return item;
	}

	public T pop() {
		if (isEmpty()) throw new IllegalStateException("stack is empty");
		int index = size() - 1;
		T result = elementAt(index);
		removeElementAt(index);
		return result;
	}
}
