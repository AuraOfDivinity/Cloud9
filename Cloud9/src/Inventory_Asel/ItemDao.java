package Inventory_Asel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import Inventory_Asel.Item;

public class ItemDao {
	public static Connection getConnection() {
		Connection con = null;
		// db - ITPMain
		// Server - atawannama
		// Uname- atawannama
		// pw- ITPproject123
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(
					"jdbc:sqlserver://atawannama.database.windows.net:1433;database=ITPMain;user=atawannama;password=ITPproject123;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;

	}

	public static int addItem(Item i) {
		int status = 0;
		int s1 = 0;
		
		
		try {
			Connection con = ItemDao.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into items(Name, Description, Link, Supplier, Expiration, Quantity, Price) values (?, ?, ?, ?, ?, ?, ?)");

			ps.setString(1, i.getName());
			ps.setString(2, i.getDescription());
			ps.setString(3, i.getLink());
			ps.setString(4, i.getSupplier());
			ps.setString(5, i.getExpiration());
			ps.setInt(6, i.getQuantity());
			ps.setFloat(7, i.getPrice());

			status = ps.executeUpdate();
			
			PreparedStatement ps2 = con.prepareStatement(
					"insert into MobileItems(item_name, item_quanitity, item_link, item_supplier) values (?, ?, ?, ?)");
			
			ps2.setString(1, i.getName());
			ps2.setInt(2, i.getQuantity());
			ps2.setString(3, i.getLink());
			ps2.setString(4, i.getSupplier());
			
			status = ps2.executeUpdate();
			
			// the executeUpdate function returns the number of affected rows in the
			// database
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return status;
	}

	public static void editItem(Item i, int id) {
		int status = 0;

		try {
			Connection con = ItemDao.getConnection();
			ResultSet rset = null;
			Statement stmt = null;
			
			
			stmt = con.createStatement();

			String query = "UPDATE Items SET ";
			
			if (i.getName() != "") {
				query += "Name = " + "'"+i.getName()+"' ,";
			}
			if (i.getDescription() != "") {
				query += "Description = " + "'"+i.getDescription()+"' ,";
			}
			if (i.getLink() != "") {
				query += "Link = " +"'" + i.getLink()+"' ,";
			}
			if (i.getSupplier() != "") {
				query += "Supplier = " +"'"+ i.getSupplier()+"' , ";
			}
			if (i.getExpiration() != "") {
				query += "Expiration = " +"'"+ i.getExpiration() + "' ,";
			}

//			if (i.getQuantity() != 0) {
//				query += "Quantity = " + i.getQuantity() + ",";
//			}

			//if (i.getPrice() != 0) {
			//	query += "Price = " + i.getPrice() + ",";
			//}
			
			System.out.println("QB= "+query);
			int len = query.length();
			String fQuery =  query.substring(0, len-1);
			
			
			fQuery += " WHERE ID =" +id+";";
			System.out.println(fQuery);
			
			rset = stmt.executeQuery(fQuery);
			
			

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static List<Item> getLastFiveItems() {
		List<Item> list = new ArrayList<Item>();

		try {
			Connection con = ItemDao.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT TOP 5 * FROM Items ORDER BY ID DESC ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Item I = new Item();
				I.setID(rs.getInt(12));
				I.setName(rs.getString(1));
				I.setQuantity(rs.getInt(6));
				I.setDescription(rs.getString(2));
				I.setSupplier(rs.getString(4));
				I.setPrice(rs.getFloat(7));
				list.add(I);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static List<Item> getAllItems() {
		List<Item> list = new ArrayList<Item>();

		try {
			Connection con = ItemDao.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM Items ORDER BY ID");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Item I = new Item();
				I.setID(rs.getInt(12));
				I.setName(rs.getString(1));

				I.setQuantity(rs.getInt(6));
				I.setDescription(rs.getString(2));
				I.setSupplier(rs.getString(4));
				I.setPrice(rs.getFloat(7));
				list.add(I);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static Item searchSpecific(int id) {
		Item I = new Item();
		String Query = "SELECT * FROM Items WHERE ID = " + id;

		try {
			Connection con = ItemDao.getConnection();
			PreparedStatement ps = con.prepareStatement(Query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				I.setID(rs.getInt(12));
				I.setLink(rs.getString(3));
				I.setName(rs.getString(1));
				I.setQuantity(rs.getInt(6));
				I.setDescription(rs.getString(2));
				I.setSupplier(rs.getString(4));
				I.setPrice(rs.getFloat(7));

			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return I;
	}

	public static void delete(String s) {

		try {
			Connection con = ItemDao.getConnection();
			PreparedStatement pst = con.prepareStatement("delete from Items where Name =?");
			pst.setString(1, s);
			pst.executeUpdate();

			PreparedStatement pst2 = con.prepareStatement("delete from MobileItems where item_name =?");
			pst2.setString(1, s);
			pst2.executeUpdate();
			con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void Restock(int id, int amount) {
		Item I = ItemDao.searchSpecific(id);
		int oldAmount = I.getQuantity();
		int newAmount = oldAmount + amount;

		try {
			Connection con = ItemDao.getConnection();
			PreparedStatement pst = con.prepareStatement("UPDATE Items SET Quantity =? WHERE ID = ?");
			pst.setInt(1, newAmount);
			pst.setInt(2, id);
			pst.executeUpdate();

			PreparedStatement ps2 = con.prepareStatement("insert into TransHistory(TransactType, TransactDate, TransactAmount) values(?, ?, ?)");
			LocalDateTime ldt = LocalDateTime.now();
			String Date = DateTimeFormatter.ofPattern("yyyyMMdd", Locale.ENGLISH).format(ldt);
			
			
			Float expense = amount * I.getPrice();
			
			
			ps2.setString(1, "Restock");
			ps2.setString(2, Date);
			ps2.setFloat(3, expense);
			
			
			ps2.executeUpdate();
			con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void Consume(int id, int amount) {
		Item I = ItemDao.searchSpecific(id);
		int oldAmount = I.getQuantity();
		int newAmount = oldAmount - amount;

		try {
			Connection con = ItemDao.getConnection();
			PreparedStatement pst = con.prepareStatement("UPDATE Items SET Quantity =? WHERE ID = ?");
			pst.setInt(1, newAmount);
			pst.setInt(2, id);
			pst.executeUpdate();

			con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static List<Transaction> getLastFiveTransactions() {
		List<Transaction> listT = new ArrayList<Transaction>();

		try {
			Connection con = ItemDao.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT TOP 3 * FROM TransHistory ORDER BY TransactID DESC ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Transaction T = new Transaction();
				T.setId(rs.getInt(1));
				T.setType(rs.getString(2));
				//T.setDate(rs.getDate(3));
				T.setAmount(rs.getFloat(4));
				
				listT.add(T);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listT;
	}

	public static String[] findLabelType(int quantity) {
		String myArr[] = new String[2];

		if (quantity <= 2) {
			myArr[0] = "danger";
			myArr[1] = "low";
		} else if (quantity > 2 && quantity <= 5) {
			myArr[0] = "warning";
			myArr[1] = "average";
		} else if (quantity > 5) {
			myArr[0] = "success";
			myArr[1] = "decent";
		}
		return myArr;
	}

}
