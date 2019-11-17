package code.java8.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesStreaming {

	
	public static void fileStreamer(String fileLocation) {
		
		try {
			List<String> s=Files.lines(Paths.get(fileLocation))
			.filter(line->line.contains("groupId"))
			.map(x->x.trim().replace("<", "<<")
					.replace(">", ">>")
					.replace(" ", "\n"))
			.collect(Collectors.toList());
			
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	
	
	
	public static void main(String[] args) {
		FilesStreaming.fileStreamer("E:\\java project\\Spring4\\reactor_ws\\github\\R_D\\myFile2.txt");

		
		
	}

}
