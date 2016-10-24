package simple.eclipse.ast.php;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.eclipse.php.internal.core.PHPVersion;
import org.eclipse.php.internal.core.ast.nodes.ASTParser;
import org.eclipse.php.internal.core.ast.nodes.Program;

public class SimplePhpReader {
	public static void main(final String[] args) throws Exception {
		final ASTParser parser = ASTParser.newParser(PHPVersion.PHP7_1);
		parser.setSource(FileUtils.readFileToString(
			new File("./meta/helloworld.txt"), "UTF-8").toCharArray());

		final Program node = parser.createAST(null);

		final SimpleVisitor visitor = new SimpleVisitor();
		node.accept(visitor);
	}
}
