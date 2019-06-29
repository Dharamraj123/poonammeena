package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/add"})
public class add extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 double c1 = 0.0,c2 = 0.0 ,c3 = 0.0 ,c4 = 0.0 ,c5 = 0.0;
	     double cost1,cost2,cost3,cost4;
	     double C1,C2,C3,C4,C5,C11=0.0,C111=0.0,C1111=0.0,C22=0.0,C222=0.0,C2222=0.0,C33=0.0,C333=0.0,C3333=0.0;		
	     int flag = 1;
		
        
		PrintWriter out = response.getWriter();
		
		String ch1 = request.getParameter("C1");
		String ch2 = request.getParameter("C11");
		String ch3 = request.getParameter("C111");
		
		if(ch1.equals("A") || ch1.equals("0"))
		{     
			   if(ch1.equals("A"))
		       {  
			         C11 = 3;
			        
		       }
		       if(ch1.equals("0"))
	           {  
		              C11 = 0;
		              
	            }
		}
		else
		{
			 out.println("invalid data");
			 flag = 0;
		}
	    if(ch2.equals("B") || ch2.equals("0"))
		{      if(ch2.equals("B"))
		       {  
			        C111 = 2;
					
		       }
		       if(ch2.equals("0"))
	          {  
		              C111 = 0;
				
               } 
		}
	    else
	    {
			 out.println("invalid data");
			 flag = 0;}
		if(ch3.equals("C") || ch3.equals("0"))
	    {      if(ch3.equals("C"))
	           {  
	    	            C1111 = 8;
	 					
		       }
		       if(ch3.equals("0"))
		       {  
		                C1111 = 0;
						
	            }
	    }
		else
		{
			 out.println("invalid data");
			 flag = 0;}
		C1 = C11 + C111 + C1111;
		
		if(C1 == 3 || C1 == 2 || C1 == 8 || C1 == 5 || C1 == 11 || C1 == 10 || C1 == 13 || C1 == 0 )
		{
		 if (C1 > 0 && C1 < 5)
             c1 = 10;
		 if (C1 > 5 && C1 <= 13 )
         {
        	
             if(C1 % 5 == 0 )
                 c1 = 10 + (((C1 / 5) - 1) * 8);
             else
                 c1 = 10 + (((C1 / 5) - 1) * 8) + 8;
         }
		}
        
		
		  
		String ch4 = request.getParameter("C2");
		String ch5 = request.getParameter("C22");
		String ch6 = request.getParameter("C222");
		
		
		if(ch4.equals("D") || ch4.equals("0"))
		{      if(ch4.equals("D"))
		       {  
			         C22 = 12;
			
		       }
		       if(ch4.equals("0"))
	           {  
		              C22 = 0;
		              
	            }
		}
		else
		{
			 out.println("invalid data");
			 flag = 0;}
	    if(ch5.equals("E") || ch5.equals("0"))
		{      if(ch5.equals("E"))
		       {  
			        C222 = 25;
					
		       }
		       if(ch5.equals("0"))
	          {  
		              C222 = 0;
				
               } 
		}
	    else {
			 out.println("invalid data");
			 flag = 0;}
		if(ch6.equals("F") || ch6.equals("0"))
	    {      if(ch6.equals("F"))
	           {  
	    	            C2222 = 15;
	 					
		       }
		       if(ch6.equals("0"))
		       {  
		                C2222 = 0;
						
	            }
	    }
		else {
			 out.println("invalid data");
		}
		C2 = C22 + C222 + C2222;
		if(C2 == 12 || C2 == 15 || C2 == 25 || C2 == 27 || C2 == 37 || C2 == 40 || C2 == 52 || C2 == 0 )
		{
		 if (C2 > 0 && C2 < 5)
             c2 = 10;
		 if (C2 > 5 && C2 <=52) {
             if (C2 % 5 == 0)
                 c2 = 10 + (((C2 / 5) - 1) * 8);
             else
                 c2 = 10 + (((C2 / 5) - 1) * 8) + 8;
         }
		}
         
		
		String ch7 = request.getParameter("C3");
		String ch8 = request.getParameter("C33");
		String ch9 = request.getParameter("C333");
		   
		
		
		if(ch7.equals("G") || ch7.equals("0"))
		{      if(ch7.equals("G"))
		       {  
			         C33 = 0.5;
			
		       }
		       if(ch7.equals("0"))
	           {  
		              C33 = 0;
		
	            }
		}
		else {
			 out.println("invalid data");
			 flag = 0;}
	    if(ch8.equals("H") || ch1.equals("0"))
		{      if(ch8.equals("H"))
		       {  
			        C333 = 1;
					
		       }
		       if(ch8.equals("0"))
	          {  
		              C333 = 0;
				
               } 
		}
	    else {
			 out.println("invalid data");
			 flag = 0;}
		if(ch9.equals("I") || ch9.equals("0"))
	    {      if(ch9.equals("I"))
	           {  
	    	            C3333 = 2;
	 					
		       }
		       if(ch9.equals("0"))
		       {  
		                C3333 = 0;
						
	            }
	    }
		else {
			 out.println("invalid data");
		}
		C3 = C33 + C333 + C3333;
		if(C3 == 0.5 || C3 == 1 || C3 == 2 || C3 == 1.5 || C3 == 2.5 || C3 == 3 || C3 == 3.5 || C3 == 0 )
		{
		 if (C3 > 0 && C3 < 3.5)
             c3 = 10;
		}
		 if(flag == 1)
		 {
		 C4 = (C2 + C3);                             //C2 + C3
         if (C4 < 5)
             c4 = 10;
         if (C4 > 5 && C4 % 5 == 0)
             c4 = 10 + (((C4 / 5) - 1) * 8);
         else
             c4 = 10 + (((C4 / 5) - 1) * 8) + 8;
         C5 = C1 + C2;
         if (C5 < 5)
             c5 = 10;
         if (C5 > 5 && C5 % 5 == 0)
             c5 = 10 + (((C5 / 5) - 1) * 8);
         else
             c5 = 10 + (((C5 / 5) - 1) * 8) + 8;
         cost1 = c1 * 3 + c2 * 2.5 + c3 * 2;
         cost2 = c1 * 3 + c2 * 3 + c4 * 2;
         cost3 = c1 * 3 + c3 * 3 + c4 * 2.5;
         cost4 = c1 * 4 + c5 * 3 + c3 * 3;
         double min_cost1 = Math.min(cost1, cost2);
         double min_cost2 = Math.min(cost3, cost4); 
         out.println("\n \n \n--------------------------Minimum cost will be--------------------------->" + Math.min(min_cost1, min_cost2));
		 }
         out.println("\n \n \n -------------------------Thanks for using this service----------------------------------------------");
        
		
		
				
	    		 
	}
}
