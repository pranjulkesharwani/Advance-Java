package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ArrayList<String> list = new ArrayList<>();

        list.add("dholu");
        list.add("bholu");
        list.add("bheem");
        list.add("chutki");
        list.add("indumati");

        request.setAttribute("dholakpur", list);

        // request.setAttribute("", );

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}