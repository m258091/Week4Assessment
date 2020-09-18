package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TemperatureConverter;

/**
 * Servlet implementation class getTemperatureServlet
 */
@WebServlet("/getTemperatureServlet")
public class getTemperatureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTemperatureServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userTemperature = request.getParameter("userTemperature");
		
		TemperatureConverter userTemp = new TemperatureConverter();
		if (request.getParameter("celsius") != null) {
			userTemp = new TemperatureConverter(Integer.valueOf(userTemperature), "Fahrenheit");
			request.setAttribute("userTemperature", userTemp);
		} else if (request.getParameter("fahrenheit") != null) {
			userTemp = new TemperatureConverter(Integer.valueOf(userTemperature), "Celsius");
			request.setAttribute("userTemperature", userTemp);
		}	
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(userTemp.toString());
		writer.close();

	}

}
