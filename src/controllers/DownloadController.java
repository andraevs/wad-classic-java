package controllers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadController
 */
@WebServlet("/DownloadController")
public class DownloadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("f"));
		String fName = request.getParameter("f");
		String UPLOAD_DIRECTORY="F:\\uploads\\audio";
		Path filePath = Paths.get(UPLOAD_DIRECTORY,fName);
		
        ServletContext context = getServletContext();
        String mimeType = context.getMimeType(fName);
        if (mimeType == null) {        
            mimeType = "application/octet-stream";
	}
        
        System.out.println("MIME type: " + mimeType);
        
        // modifies response
        response.setContentType(mimeType);
        
        // modifies response
        response.setContentType(mimeType);
        response.setContentLengthLong(Files.size(filePath));

        // forces download
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"", fName);
        response.setHeader(headerKey, headerValue);
        
        OutputStream outStream = response.getOutputStream();
        InputStream in = Files.newInputStream(filePath);
	byte[] outputByte = new byte[4096];
	while(in.read(outputByte, 0, 4096) != -1)
	{
		outStream.write(outputByte, 0, 4096);
	}

}
}
