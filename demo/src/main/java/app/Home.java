package app;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Home", value = "/home")
public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<form action=\"http://localhost:8080/home\" method=\"post\">\n" +
                "  <input type=\"text\" name=\"q\">\n" +
                "  <button>Search</button>\n" +
                "</form>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String value = request.getParameter("q");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello" + value + "</h1>");
    }
}

// Tạo một servlet và thực hiện cho người dùng nhập vào a,b => tính tổng từ a => b
