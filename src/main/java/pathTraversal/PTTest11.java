package pathTraversal;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

public class PTTest11 {
	private final String BASE_DIRECTORY = "src";

	public void Test(HttpServletRequest request) {
		String filename = request.getParameter("filename");
		try {
			int idx = filename.lastIndexOf('/');
			File dictionaryFile = new File("c/" + filename.substring(0, idx),filename);
			dictionaryFile.delete();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.print("sdfsf");
	}
}