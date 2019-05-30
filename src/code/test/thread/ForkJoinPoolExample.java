package code.test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

//RecursiveAction-> compute() does not return any thing RETURN TYPE = VOID
/*RecursiveTask-> compute() return value*/

public class ForkJoinPoolExample extends RecursiveAction {
	
	private static final long serialVersionUID = 1L;
	private long workLoad = 0;

	@Override
	protected void compute() {
		//if work is above threshold, break tasks up into smaller tasks
        if(this.workLoad > 26) {
            System.out.println("Splitting workLoad : " + this.workLoad);

            List<ForkJoinPoolExample> subtasks =
                new ArrayList<ForkJoinPoolExample>();

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
        List<ForkJoinPoolExample> subtasks =
            new ArrayList<ForkJoinPoolExample>();

        ForkJoinPoolExample subtask1 = new ForkJoinPoolExample(this.workLoad / 2);
        ForkJoinPoolExample subtask2 = new ForkJoinPoolExample(this.workLoad / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }
	
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(2);
		ForkJoinPoolExample myRecursiveAction = new ForkJoinPoolExample(100);
		forkJoinPool.invoke(myRecursiveAction);

	}


}
