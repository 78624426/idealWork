package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/hello")
public class Hello extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name","tom");
        List<Integer>nums = Arrays.asList(12,23,15);
        req.setAttribute("nums",nums);
        req.getRequestDispatcher("hello.jsp").forward(req,resp);
    }
}
