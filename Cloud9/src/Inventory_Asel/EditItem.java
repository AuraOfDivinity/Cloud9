package Inventory_Asel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EditItem")
public class EditItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EditItem() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		System.out.println("Edit Item servelet called!");
		
		HttpSession s1 = request.getSession();
		int id= Integer.parseInt(s1.getAttribute("displayID").toString());
		
		System.out.println("id is:"+ id);
		
		
		String name = request.getParameter("itemName");
		//int quantity = Integer.parseInt(request.getParameter("itemQuantity"));
		String link = request.getParameter("itemLink");
		String supplier = request.getParameter("itemSupplier");
		String expiration = request.getParameter("itemExpiration");
		String description = request.getParameter("itemDescription");
		//float price = Float.parseFloat(request.getParameter("itemPrice"));
		
		Item i = new Item();
		
		i.setName(name);
		//i.setQuantity(quantity);
		i.setLink(link);
		i.setSupplier(supplier);
		i.setExpiration(expiration);
		i.setDescription(description);
		//i.setPrice(price);
		
		ItemDao.editItem(i, id);
		
		response.sendRedirect("Inventory_Dashboard.jsp");
		return;
		
	}

}
