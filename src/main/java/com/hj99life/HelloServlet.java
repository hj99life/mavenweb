package com.hj99life;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter(); //응답(출력) 준비 완료
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Response Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Welcome to Hello Servlet!</h2>");
        out.println("<h2>안녕하세요</h2>");
        out.println("</body>");
        out.println("</html>");

    }
}
