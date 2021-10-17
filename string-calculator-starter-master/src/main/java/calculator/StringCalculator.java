package calculator;

class StringCalculator {

	public int add(String numbers ) {
		String str=numbers;
		StringTokenizer st = new StringTokenizer(str, ",\\n");
		
		int sum=0;
		while(st.hasMoreTokens()) {
			sum+= Integer.parseInt((String) st.nextElement());
		}	
		return sum;
	} 

}