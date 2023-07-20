package in.ashokit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ashokit.dao.UserDAO;
import in.ashokit.dto.UserDTO;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDAO userDao=new UserDAO();
		List<UserDTO> users = userDao.getUsers();
		
		req.setAttribute("users", users);
		
		req.getRequestDispatcher("/viewUsers.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//capture form data
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String Phno=req.getParameter("phno");
		
		//set form data to userdto object for transfer
		UserDTO user=new UserDTO();
		user.setUserName(name);
		user.setUserEmail(email);
		user.setUserPhno(Integer.parseInt(Phno));
		
		// call dao method
		UserDAO dao=new UserDAO();
		boolean isSaved = dao.saveUser(user);
		
		String msg = null;
		
		if(isSaved) {
			msg="User Saved";
			
		}else {
			msg="User Not Saved";
		}
		//setting msg to display on index page
		req.setAttribute("msg", msg);
		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
	}

}
