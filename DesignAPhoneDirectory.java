package LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
public class DesignAPhoneDirectory {
	/*
	 * Design a Phone Directory which supports the following operations:

		get: Provide a number which is not assigned to anyone.
		check: Check if a number is available or not.
		release: Recycle or release a number.
	 */
	int max;
	HashSet<Integer> set;
	LinkedList<Integer> queue;
	/**
	 * 
	 * @param maxNumbers - Maximum numbers that can be stored in the phone Directory
	 */
	public DesignAPhoneDirectory(int maxNumbers){
		set = new HashSet<>();
		queue = new LinkedList<>();
		for(int i=0;i<maxNumbers;i++){
			queue.offer(i);
		}
		max = maxNumbers-1;
	}
		/**
		 * @return return an available number
		 */
		public int get() {
			if(queue.isEmpty()) return -1;
			int e = queue.poll();
			set.add(e);
			return e;
		}
		public void recycle(int number){
			if(set.contains(number)){
				set.remove(number);
				queue.offer(number);
			}
		}
	}


