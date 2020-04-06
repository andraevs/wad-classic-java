package controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetFilesController
 */
@WebServlet("/GetFilesController")
public class GetFilesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFilesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UPLOAD_DIRECTORY="F:\\uploads\\audio";
		Path uploadDir = Paths.get(UPLOAD_DIRECTORY);
		List<String> files =Files.list(uploadDir)
			.filter(p -> !Files.isDirectory(p))
			.map(p -> p.getFileName().toString())
			.collect(Collectors.toList());
		request.setAttribute("files", files);
		request.getRequestDispatcher("download.jsp").forward(request, response);
	}


}
