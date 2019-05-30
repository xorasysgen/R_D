package com.skbh.impl.InterView;

import java.util.Comparator;

public class BufferAdaptor implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return o2.toString().compareTo(o1.toString());	
	
	}
}
