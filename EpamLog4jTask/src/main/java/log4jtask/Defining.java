package log4jtask;

import java.util.logging.Logger;





import org.apache.logging.log4j.LogManager;
public class Defining {
	
	private static final org.apache.logging.log4j.Logger LOGme1=LogManager.getLogger(Defining.class);
	
	public double simple(double p,double n,double  pe)
	{
		double meg=(p*n*pe)/100;
		LOGme1.info(meg);
		LOGme1.error("There is a corrrection see it");
		LOGme1.warn("There is something wrong in code please check it");
		LOGme1.fatal("There is a case of Exit the application Please see it");return meg;
	}
	public double  compound(double pem,double  n,double  pe)
	{
		double  meg2=pem*(Math.pow((1+(n/100)),pe));
		meg2=meg2-pem;
		
		LOGme1.info(meg2);
		LOGme1.error("There is a corrrection see it");
		LOGme1.warn("There is something wrong in code please check it");
		LOGme1.fatal("There is a case of Exit the application Please see it");
		return meg2;
	
	}
	

}
