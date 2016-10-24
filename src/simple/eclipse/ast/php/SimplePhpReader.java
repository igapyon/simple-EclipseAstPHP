package simple.eclipse.ast.php;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.eclipse.php.internal.core.PHPVersion;
import org.eclipse.php.internal.core.ast.nodes.ASTParser;
import org.eclipse.php.internal.core.ast.nodes.Program;

public class SimplePhpReader {
	public static void main(final String[] args) throws Exception {
		final BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream("./meta/helloworld.txt"), "UTF-8"));
		final StringBuffer buf = new StringBuffer();
		for (;;) {
			String line = reader.readLine();
			if (line == null)
				break;
			buf.append(line);
			buf.append('\n');
		}
		reader.close();

		final ASTParser parser = ASTParser.newParser(PHPVersion.PHP7_1);
		parser.setSource(buf.toString().toCharArray());

		final Program node = parser.createAST(null);

		final SimpleVisitor visitor = new SimpleVisitor();
		node.accept(visitor);
	}
}
