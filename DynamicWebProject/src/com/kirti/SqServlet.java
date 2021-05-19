package com.kirti;

import java.io.IOException;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.tomcat.util.http.parser.Cookie;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	

        int k =0;
        Cookie cookies[] = req.getCookies();
		
        for(Cookie c : cookies)
        {
        	if(c.getName().equals("k"))
        	k = Integer.parseInt(c.getValue());
        }

		k = k*k;
		    
		PrintWriter out= res.getWriter();
		out.println("result is "+k);
	}

}
