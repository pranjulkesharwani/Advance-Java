package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.HashMap;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("3ab", 45);
        map.put("#er", 55);
        map.put("int", 65);

        request.setAttribute("map", map);
        request.setAttribute("float", 3.4);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}