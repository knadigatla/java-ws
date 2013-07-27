package temp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.Callable;

public class UsersThread implements Callable<Integer> {
	
	private String fname=null;


	public UsersThread(String filename) {
		// TODO Auto-generated constructor stub
		fname= filename;
		
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		
		int count=0;
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		String s = null;
		while ((s = br.readLine()) != null) {
			String[] result = s.split(",");
			
			if(Integer.parseInt(result[4])>30 && Integer.parseInt(result[4])<40){
				count++;
				
			}
		}
		br.close();
		
		return count;
	}

}
