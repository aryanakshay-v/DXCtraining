package advance.thread;

public class sleep extends Thread{
		@Override
	    public void run()  
	    {    
	        for(int i=1;i<5;i++)  
	        {    
	            try  
	            {  
	                Thread.sleep(500);  
	            }catch(InterruptedException e){System.out.println(e);}    
	            System.out.println(i);    
	        }    
	    }    
	    public static void main(String args[])  
	    {    
	        sleep t1=new sleep();    
	        sleep t2=new sleep();    
	        t1.start();    
	        t2.start();    
	        
}
}
