package code.test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

//RecursiveAction-> compute() does not return any thing RETURN TYPE = VOID
/*RecursiveTask-> compute() return value*/


class ForkRecursiveTask extends RecursiveTask<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Integer compute() {
		
		 List<ForkRecursiveTask> subtasks =new ArrayList<ForkRecursiveTask>();
		 ForkRecursiveTask task=new ForkRecursiveTask();
		 ForkRecursiveTask task2=new ForkRecursiveTask();
         subtasks.add(task);
         subtasks.add(task2);

         for(RecursiveTask<Integer> subtask : subtasks){
             subtask.fork();
         }
		Integer sum=0;
		for (int i = 0; i < 10000000; i++) {
			sum=sum+i;
		}
		return sum;
	}
	
}


public class ForkJoinPoolExample extends RecursiveAction {
	
	private static final long serialVersionUID = 1L;
	private long workLoad = 0;

	@Override
	protected void compute() {
		//if work is above threshold, break tasks up into smaller tasks
        if(this.workLoad > 25) {
            System.out.println("Splitting workLoad : " + this.workLoad);

            List<ForkJoinPoolExample> subtasks =new ArrayList<ForkJoinPoolExample>();

            subtasks.addAll(createSubtasks());

            for(RecursiveAction subtask : subtasks){
                subtask.fork();
            }

        } else {
            System.out.println("Doing workLoad myself: " + this.workLoad);
        }
		
	}
	

    public ForkJoinPoolExample(long workLoad) {
        this.workLoad = workLoad;
    }
    
	private List<ForkJoinPoolExample> createSubtasks() {
        List<ForkJoinPoolExample> subtasks =new ArrayList<ForkJoinPoolExample>();

        ForkJoinPoolExample subtask1 = new ForkJoinPoolExample(this.workLoad / 2);
        ForkJoinPoolExample subtask2 = new ForkJoinPoolExample(this.workLoad / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }
	
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(5);
		ForkJoinPoolExample myRecursiveAction = new ForkJoinPoolExample(33);
		forkJoinPool.invoke(myRecursiveAction);
		
		ForkRecursiveTask task=new ForkRecursiveTask();
		
		ForkJoinPool forkJoinPool1 = new ForkJoinPool(2);
		System.out.println(forkJoinPool1.invoke(task));
		

	}


}
