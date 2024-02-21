package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import java.util.HashMap;
import java.io.IOException;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HashMap map = new HashMap();
        map.put("3ab", 45);
        map.put("#er", 55);
        map.put("int", 65);

        request.setAttribute("yam", map);
        request.setAttribute("float", 20.0);
        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}