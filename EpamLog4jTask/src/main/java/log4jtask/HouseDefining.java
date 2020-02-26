package log4jtask;

import org.apache.logging.log4j.LogManager;

public class HouseDefining {
	double m1=0;
	private static final org.apache.logging.log4j.Logger LOGme1 =LogManager.getLogger(HouseDefining.class);
	double cost(String s,double megh,String y)
	{
		if (s.equals("It_is_StandardMaterials"))
		{
			
			
			m1=m1+(1200*megh);
			
			LOGme1.info(m1);
			LOGme1.error("There is a corrrection see it");
			LOGme1.warn("There is something wrong in code please check it ");
			LOGme1.fatal("There is a case of Exit the application Please see it ");
				
		}
		
		else if (s.equals("It_is_above standard materials"))
		{
			
			m1=m1+(1500*megh);
			LOGme1.info(m1);
			LOGme1.error("There is a corrrection see it");
			LOGme1.warn("There is something wrong in code please check it ");
			LOGme1.fatal("There is a case of Exit the application Please see it");
			
		}
		else
		{
			if (y.equals("fully automated home" ))
			{m1=m1+(2500*megh);
			}
			else
			{
				m1=m1+(1800*megh);
			}
			LOGme1.info(m1);
				LOGme1.error("There will be corrrection");
			LOGme1.warn("there is something wrong in code");
			LOGme1.fatal("there is any case of abort");
			
			
		}
		
		
	return(m1);	
	}

}
