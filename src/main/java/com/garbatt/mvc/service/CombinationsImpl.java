package com.garbatt.mvc.service;

public class CombinationsImpl implements Combinations {
	private String input;
	private StringBuffer result;
	/* (non-Javadoc)
	 * @see com.garbatt.mvc.service.CombinationsItf#getInput()
	 */
	@Override
	public String getInput() {
		return input;
	}
	/* (non-Javadoc)
	 * @see com.garbatt.mvc.service.CombinationsItf#setInput(java.lang.String)
	 */
	@Override
	public void setInput(String input) {
		this.input = input;
	}
	/* (non-Javadoc)
	 * @see com.garbatt.mvc.service.CombinationsItf#getResult()
	 */
	@Override
	public String getResult() {
		return result.toString();
		//return "you got me";
	}
	/* (non-Javadoc)
	 * @see com.garbatt.mvc.service.CombinationsItf#setResult(java.lang.String)
	 */
	@Override
	public void setResult(String result) {
		this.result = new StringBuffer(result);
	}
	public CombinationsImpl() {
		super();
		this.input = "default";
		this.result = new StringBuffer("");
	}
	
	/* (non-Javadoc)
	 * @see com.garbatt.mvc.service.CombinationsItf#permute()
	 */
	@Override
	public void permute(){
		if ( this.input == null || this.input.isEmpty()){
			this.input = "NO INPUT";
		}else{
			this.permutation("", this.input);
		}
	}
	
	private void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {
	    	//System.out.println(prefix);
	    	this.result.append( prefix + "\n");
	    }
	    else {
	        for (int i = 0; i < n; i++){
//	        	System.out.println("prefix_in: " + prefix + " str_in: " + str);
//	        	System.out.println("i: " + i + " n: " + n);
//	        	System.out.println("Prefix: " + prefix + str.charAt(i));
//	            System.out.println("sub1: " + str.substring(0, i));
//	            System.out.println("sub2: " + str.substring(i+1, n));
//	            System.out.println("permutation(" + prefix + str.charAt(i) + "," + str.substring(0, i) + str.substring(i+1, n) + ")");
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	        }
	        	
	}	
}
