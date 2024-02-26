package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;
import java.util.HashMap;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa", 234);
        map.put("bbb", 345);
        map.put("ccc", 456);

        request.setAttribute("yam", map);
        request.setAttribute("golu", "bbb");

        request.getRequestDispatcher("next.jsp").forward(request, response);

    }
}
