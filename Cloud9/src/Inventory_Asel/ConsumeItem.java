package Inventory_Asel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConsumeItem")
public class ConsumeItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConsumeItem() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int amount = Integer.parseInt(request.getParameter("amount2"));

		int id = (Integer) request.getSession().getAttribute("displayID");

		ItemDao.Consume(id, amount);
		response.sendRedirect("Inventory_Dashboard.jsp");
	}

}
