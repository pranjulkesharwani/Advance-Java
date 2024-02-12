import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;

@WebServlet("/add.do")
public class AddToCartServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        HashMap<String, Integer> cart = (HashMap) session.getAttribute("cart");

        if (cart == null) {
            cart = new HashMap<>();
            session.setAttribute("cart", cart);
        }

        int quantity = Integer.parseInt(request.getParameter("qt"));
        String value = request.getParameter("products");

        cart.put(value, quantity);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}