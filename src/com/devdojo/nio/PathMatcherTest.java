package com.devdojo.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTest extends SimpleFileVisitor<Path> {

	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
	
	@Override
	public FileVisitResult visitFile(Path arg0, BasicFileAttributes arg1) throws IOException {
		// TODO Auto-generated method stub
		if(matcher.matches(arg0)) {
			
			System.out.println(arg0.getFileName());
			
		}
		return FileVisitResult.CONTINUE;
	}
	
}

public class PathMatcherTest {
	
	public static void main(String[] args) throws IOException {
		
		Path path1 = Paths.get("pasta/subpasta/file.bkp");
		Path path2 = Paths.get("file.bkp");
		Path path3 = Paths.get("william-suane");
		//Files.walkFileTree(path1, new findAllBkps());
		//O asterístico considera qualquer coisa menos o divisor de diretorios / e \
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
		//false porque é o caminho absoluto
		System.out.println(matcher.matches(path1));
		//true
		System.out.println(matcher.matches(path2));
		System.out.println("-------------------------------------------------------------------");
		matches(path1, "glob:*.bkp");
		//dois asteristicos considera qualquer coisa ou **/*.bkp
		matches(path1, "glob:**.bkp");
		//não encontra
		matches(path1, "glob:*");
		//encontra qualquer coisa
		matches(path1, "glob:**");
		System.out.println("-------------------------------------------------------------------");
		//verifica se tem três caracteres no fim
		matches(path1, "glob:*.???");
		matches(path1, "glob:**/*.???");
		matches(path1, "glob:**.???");
		System.out.println("-------------------------------------------------------------------");
		matches(path3, "glob:{william*,suane*}");
		matches(path3, "glob:{william,suane}*");
		matches(path3, "glob:{william,suane}");
		
		Files.walkFileTree(Paths.get("./"), new FindAllTest());
		
	}
	
	private static void matches(Path path, String glob) {
		
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(glob+": "+matcher.matches(path));
		
	}

}
