package Inventory_Asel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RestockItems")
public class RestockItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RestockItems() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int amount = Integer.parseInt(request.getParameter("amount1"));
	
		
		int id = (Integer) request.getSession().getAttribute("displayID");
		
		ItemDao.Restock(id, amount);
		response.sendRedirect("Inventory_Dashboard.jsp");
	}

	

}
