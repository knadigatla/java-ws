package temp;

import java.util.Comparator;

import org.apache.commons.lang.StringUtils;

import com.cloudwick.io.User;

public class Temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "a";
		if(StringUtils.isNumeric(x))
		System.out.println(Integer.parseInt(x));
		else
			System.out.println("not a number");

	}


	
	

}
