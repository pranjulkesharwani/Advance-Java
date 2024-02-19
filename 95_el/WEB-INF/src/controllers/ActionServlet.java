package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.util.HashMap;
import java.io.IOException;
import javax.servlet.ServletException;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("aaa", 111);
        map.put("bbb", 222);
        map.put("ccc", 333);

        request.setAttribute("records", map);
        request.getRequestDispatcher("next1.jsp").forward(request, response);
        // request.getRequestDispatcher("next2.jsp").forward(request, response);
    }
}