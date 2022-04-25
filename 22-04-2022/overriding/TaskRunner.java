package com.suhas.overriding;

public class TaskRunner {

	public static void main(String[] args) {

		Task task=new Task();
		task.clone();
		
		Object obj1=true;
		task.equals(obj1);
		
		task.finalize();
		
		task.hashCode();
		
		
	}

}
