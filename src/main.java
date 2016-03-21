
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniPID miniPID; 
		
		//miniPID=new MiniPID( .05 , 0 , .1);
		//miniPID=new MiniPID( .1 , 0 , .1);
		//miniPID=new MiniPID( .2 , 0.01 , .1);
		miniPID=new MiniPID( .3 , 0.01 , 0.1);
		miniPID.setMaxOutput(-50,10);
		miniPID.setMaxIOutput(2);
//		miniPID.setDirection(false);
		
		double target=100;
		
		double actual=0;
		double output=0;
		
		miniPID.setSetpoint(0);
		miniPID.setSetpoint(target);
		
		System.err.printf("Target,Actual\tOutput\tError\n");
		//System.err.printf("Output\tP\tI\tD\n");

		/* Position based test code
		for (int i=0;i<100 ;i++){
			
			//if(i==50)miniPID.setI(.05);
			if(i==25)target=(50);
			//if(i==75)target=(100);
			//if(i>50 && i%4==0)target=target+(Math.random()-.5)*50;
			
			output=miniPID.getOutput(actual,target);

			//System.out.println("=========================="); 
			//System.out.printf("Current: %3.2f , Actual: %3.2f, Error: %3.2f\n",actual, output, (target-actual));
			System.err.printf("%3.2f\t%3.2f\t%3.2f\t%3.2f\n",target,actual, output, (target-actual));
			
			
			actual=actual+output;
			if(i>50 && i%5==0)actual+=(Math.random()-.5)*20;
		}
		//*/
		
	}

}
