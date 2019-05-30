package code.test.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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
		if (list != null && list.size() > 0) {
			return Collections.min(list);
		}
		return null;
	}

	public static void main(String[] args) {
		final ArrayListSync arrayListSync = new ArrayListSync();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					arrayListSync.addElement(new Random().nextInt(10));
				}

			}
		});

		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					arrayListSync.addElement(new Random().nextInt(50));
				}

			}
		});

		t2.start();

		System.out.println(arrayListSync.getMax());
		System.out.println(arrayListSync.getMin());
		System.out.println(arrayListSync.getList());

	}

}
