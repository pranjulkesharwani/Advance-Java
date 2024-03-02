package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.HashMap;

import models.Student;
import models.Employee;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HashMap<String, Object[]> map = new HashMap<>();

        map.put("students", new Student[] {
                new Student("Rohan", 20, "SRIT"),
                new Student("Rahul", 21, "GGIT"),
                new Student("Shid", 23, "JEC")
        });

        map.put("employees", new Employee[] {
                new Employee("Aman", 10, 4000),
                new Employee("gourav", 7, 3000),
                new Employee("pulkit", 4, 2200)
        });

        request.setAttribute("recs", map);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}
