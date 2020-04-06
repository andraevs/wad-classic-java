package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class DailyUploadController
 */
@WebServlet("/DailyUploadController")
@MultipartConfig
public class DailyUploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DailyUploadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	String UPLOAD_DIRECTORY="F:\\uploads\\audio";
		    final Part filePart = request.getPart("file");
		    String fileName = filePart.getSubmittedFileName();
		    Path uploadDir = Paths.get(UPLOAD_DIRECTORY);
		    try {
		    Files.createDirectory(uploadDir);}
		    catch (FileAlreadyExistsException fe) {}
		    System.out.println(uploadDir.toString());
		    Path uploadPath=Paths.get(uploadDir.toString(),fileName);
		    filePart.write(uploadPath.toString());
		    
		    request.getRequestDispatcher("upload.jsp").forward(request, response);
	}
	
	

}
