package code.java8.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileExplorer {

	public static void createDir(Path p) {
		try {
			Files.createDirectory(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
	    String url="c:\\Users\\Admin\\Desktop\\temp\\" +  LocalTime.now().toString().replace(":", "-");
		Path p1=Paths.get(url);
		//FileExplorer.createDir(p1);
		Path p2=Paths.get("E:/Development EDI/Reactive_Workspace/api-batch-processor/src/main/resources/nifty500_1.csv");
		try {
			Stream<String> stream=Files.lines(p2);
			List<String> ss=stream.filter(x->x.contains("ENERGY")).collect(Collectors.toList());
			System.out.println(ss.stream().findFirst().get());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		

	}

}
