package temp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsersExample {

	/**
	 * @param args
	 */
	private static final int NUMTHREADS = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService ex = Executors.newFixedThreadPool(NUMTHREADS);
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();

		File folder = new File("C:\\Users\\Kiran\\Desktop\\java_pract");
		List<String> filenames =filesList(folder);

		for (int i = 0; i < filenames.size(); i++) {
			
			UsersThread obj = new UsersThread(filenames.get(i));

			Future<Integer> d = ex.submit(obj);
			list.add(d);
		}

		int records = 0;
		for (Future<Integer> c : list) {
			try {
				records += c.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Total number of records: " + records);
		ex.shutdown();
	}

	static List<String> filesList(File f) {
		List<String> filenames = new ArrayList<String>();
		for (final File fileEntry : f.listFiles()) {
			if (fileEntry.isDirectory()) {
				filenames.addAll(filesList(fileEntry));
			} else {
				filenames.add(fileEntry.getAbsolutePath());
			}

		}
		return filenames;
	}

}
