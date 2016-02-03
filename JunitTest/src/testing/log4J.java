package testing;

import org.apache.log4j.Logger;

public class log4J {
	
	public static final Logger log = Logger.getLogger(log4J.class);
	
	public static void main(String[] args){
		
		log.debug("test message");
		JunitTesting jtest = new JunitTesting();
		
		System.out.println(jtest.square(30));
		log.debug(jtest.square(30));
	}

}
