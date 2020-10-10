package parallelism;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoin {
	

		   public static void main(String[] args) {
		      int[] array = getData();

		      ForkJoinPool pool = new ForkJoinPool();
		      Integer max = pool.invoke(new FindMaxTask(array, 0, array.length));
		      System.out.println("result : " + max);
		   }

		   private static int[] getData() {
			// TODO Auto-generated method stub
			   int n=10000;
			   int[] num = new int[n];
			   for(int i=0; i<n ; i++) {
				   num[i] = i + 1;
			   }
			return num;
		}

		static class FindMaxTask extends RecursiveTask<Integer> {

		      private int[] array;
		      private int start, end;

		      public FindMaxTask(int[] array, int start, int end) {
		          this.array = array;
		          this.start = start;
		          this.end = end;
		      }

		      @Override
		      protected Integer compute() {
		          if (end - start <= 3000) {
		              int max = -99;
		              for (int i = start; i < end; i++) {
		                 max = Integer.max(max, array[i]);
		              }
		              return max;

		          } else {
		              int mid = (end - start) / 2 + start;
		              FindMaxTask left = new FindMaxTask(array, start, mid);
		              FindMaxTask right = new FindMaxTask(array, mid + 1, end);
		              System.out.println("left: "+ left.getRawResult());
		              System.out.println("right: "+right.getRawResult());

		              ForkJoinTask.invokeAll(right, left);
		              int leftRes = left.getRawResult();
		              int rightRes = right.getRawResult();
		              System.out.println("leftRes: "+leftRes);
		              System.out.println("rightRes: "+rightRes);

		              return Integer.max(leftRes, rightRes);
		          }
		      } //end of compute

		   }
		}
	


