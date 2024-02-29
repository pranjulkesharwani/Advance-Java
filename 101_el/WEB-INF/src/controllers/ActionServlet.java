package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;
import java.util.HashMap;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HashMap<String, String[]> map = new HashMap<>();

        map.put("Sabji", new String[] { "bareja", "bathua", "cholal", "norpa" });
        map.put("fal", new String[] { "papti", "sab", "santara", "angoor" });
        map.put("sanganak", new String[] { "laptop", "desktop", "tablet", "smartphone" });

        request.setAttribute("recs", map);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}