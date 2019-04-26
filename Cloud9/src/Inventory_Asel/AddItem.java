package Inventory_Asel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Inventory_Asel.ItemDao;
import Inventory_Asel.Item;


@WebServlet("/AddItem")
public class AddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Add Item servelet called!");
		
		String name = request.getParameter("itemName");
		int quantity = Integer.parseInt(request.getParameter("itemQuantity"));
		String link = request.getParameter("itemLink");
		String supplier = request.getParameter("itemSupplier");
		String expiration = request.getParameter("itemExpiration");
		String description = request.getParameter("itemDescription");
		float price = Float.parseFloat(request.getParameter("itemPrice"));
		
		Item i = new Item();
		
		i.setName(name);
		i.setQuantity(quantity);
		i.setLink(link);
		i.setSupplier(supplier);
		i.setExpiration(expiration);
		i.setDescription(description);
		i.setPrice(price);
		
		int status = ItemDao.addItem(i);
		
		response.sendRedirect("Inventory_Dashboard.jsp");
	}

}
