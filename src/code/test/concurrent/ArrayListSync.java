package code.test.concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ArrayListSync {

	private List<Integer> list = new ArrayList<>();
	ReadWriteLock lock = new ReentrantReadWriteLock();

	public ArrayListSync() {
		for (int i = 112; i < 120; i++) {
			list.add(i);
		}
	}

	public void addElement(int a) {
		try {
			lock.writeLock().lock();
			list.add(a);
		} finally {
			lock.writeLock().unlock();
		}
	}

	public Integer getMax() {
		try {
			lock.readLock().lock();
			if (list != null && list.size() > 0) {
				return Collections.max(list);
			}
		} finally {
			lock.readLock().unlock();
		}
		return null;
	}

	public Integer getList() {
		try {
			lock.readLock().lock();
			if (list != null && list.size() > 0) {
				System.out.println(list);
			}
		} finally {
			lock.readLock().unlock();
		}
		return null;
	}

	public Integer getMin() {
		try {
			lock.readLock().lock();
		if (list != null && list.size() > 0) {
			return Collections.min(list);
		}
		} finally {
			lock.readLock().unlock();
		}
		return null;
	}

	public static void main(String[] args) {
		final ArrayListSync arrayListSync = new ArrayListSync();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i =1111; i < 11019; i++) {
					arrayListSync.addElement(i);
				}

			}
		});

		t1.start();
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					arrayListSync.addElement(i);
				}

			}
		});

		t2.start();

		System.out.println("Max " + arrayListSync.getMax());
		System.out.println("Min " + arrayListSync.getMin());
		arrayListSync.getList();
		System.out.println("sushil");

	}

}
