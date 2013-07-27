package temp;

public class HashTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>(4,1.5f);
		
		hm.put(122, "kiran");
		hm.put(111, "Kiran");
		hm.put(133, "Kiran2");
		hm.put(144, "Kiran3");
		hm.put(155, "Kiran4");
		hm.put(111, "Kiran66");
		hm.put(1221, "Kiran1");
//		hm.put(1331, "Kiran2");
//		hm.put(1441, "Kiran3");
		
		System.out.println(hm.size);
		
		System.out.println(hm.get(122));
		System.out.println(hm.get(111));
		System.out.println(hm.get(133));
		System.out.println(hm.get(144));
		System.out.println(hm.get(155));
		System.out.println(hm.get(1221));
		
		

	}

}
