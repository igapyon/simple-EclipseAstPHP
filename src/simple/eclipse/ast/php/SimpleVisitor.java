package simple.eclipse.ast.php;

import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.php.internal.core.ast.nodes.ASTError;
import org.eclipse.php.internal.core.ast.nodes.ASTNode;
import org.eclipse.php.internal.core.ast.nodes.ArrayAccess;
import org.eclipse.php.internal.core.ast.nodes.ArrayCreation;
import org.eclipse.php.internal.core.ast.nodes.ArrayElement;
import org.eclipse.php.internal.core.ast.nodes.Assignment;
import org.eclipse.php.internal.core.ast.nodes.BackTickExpression;
import org.eclipse.php.internal.core.ast.nodes.BreakStatement;
import org.eclipse.php.internal.core.ast.nodes.CastExpression;
import org.eclipse.php.internal.core.ast.nodes.CatchClause;
import org.eclipse.php.internal.core.ast.nodes.ClassDeclaration;
import org.eclipse.php.internal.core.ast.nodes.ClassInstanceCreation;
import org.eclipse.php.internal.core.ast.nodes.ClassName;
import org.eclipse.php.internal.core.ast.nodes.CloneExpression;
import org.eclipse.php.internal.core.ast.nodes.Comment;
import org.eclipse.php.internal.core.ast.nodes.ConditionalExpression;
import org.eclipse.php.internal.core.ast.nodes.ContinueStatement;
import org.eclipse.php.internal.core.ast.nodes.DeclareStatement;
import org.eclipse.php.internal.core.ast.nodes.DoStatement;
import org.eclipse.php.internal.core.ast.nodes.EchoStatement;
import org.eclipse.php.internal.core.ast.nodes.EmptyStatement;
import org.eclipse.php.internal.core.ast.nodes.ExpressionStatement;
import org.eclipse.php.internal.core.ast.nodes.FieldAccess;
import org.eclipse.php.internal.core.ast.nodes.FieldsDeclaration;
import org.eclipse.php.internal.core.ast.nodes.ForEachStatement;
import org.eclipse.php.internal.core.ast.nodes.ForStatement;
import org.eclipse.php.internal.core.ast.nodes.FormalParameter;
import org.eclipse.php.internal.core.ast.nodes.FunctionDeclaration;
import org.eclipse.php.internal.core.ast.nodes.FunctionInvocation;
import org.eclipse.php.internal.core.ast.nodes.FunctionName;
import org.eclipse.php.internal.core.ast.nodes.GlobalStatement;
import org.eclipse.php.internal.core.ast.nodes.Identifier;
import org.eclipse.php.internal.core.ast.nodes.IfStatement;
import org.eclipse.php.internal.core.ast.nodes.IgnoreError;
import org.eclipse.php.internal.core.ast.nodes.InLineHtml;
import org.eclipse.php.internal.core.ast.nodes.Include;
import org.eclipse.php.internal.core.ast.nodes.InfixExpression;
import org.eclipse.php.internal.core.ast.nodes.InstanceOfExpression;
import org.eclipse.php.internal.core.ast.nodes.InterfaceDeclaration;
import org.eclipse.php.internal.core.ast.nodes.ListVariable;
import org.eclipse.php.internal.core.ast.nodes.MethodDeclaration;
import org.eclipse.php.internal.core.ast.nodes.MethodInvocation;
import org.eclipse.php.internal.core.ast.nodes.ParenthesisExpression;
import org.eclipse.php.internal.core.ast.nodes.PostfixExpression;
import org.eclipse.php.internal.core.ast.nodes.PrefixExpression;
import org.eclipse.php.internal.core.ast.nodes.Program;
import org.eclipse.php.internal.core.ast.nodes.Quote;
import org.eclipse.php.internal.core.ast.nodes.Reference;
import org.eclipse.php.internal.core.ast.nodes.ReflectionVariable;
import org.eclipse.php.internal.core.ast.nodes.ReturnStatement;
import org.eclipse.php.internal.core.ast.nodes.Scalar;
import org.eclipse.php.internal.core.ast.nodes.SingleFieldDeclaration;
import org.eclipse.php.internal.core.ast.nodes.StaticConstantAccess;
import org.eclipse.php.internal.core.ast.nodes.StaticFieldAccess;
import org.eclipse.php.internal.core.ast.nodes.StaticMethodInvocation;
import org.eclipse.php.internal.core.ast.nodes.StaticStatement;
import org.eclipse.php.internal.core.ast.nodes.SwitchCase;
import org.eclipse.php.internal.core.ast.nodes.SwitchStatement;
import org.eclipse.php.internal.core.ast.nodes.ThrowStatement;
import org.eclipse.php.internal.core.ast.nodes.TryStatement;
import org.eclipse.php.internal.core.ast.nodes.UnaryOperation;
import org.eclipse.php.internal.core.ast.nodes.Variable;
import org.eclipse.php.internal.core.ast.nodes.WhileStatement;
import org.eclipse.php.internal.core.ast.visitor.AbstractVisitor;

public class SimpleVisitor extends AbstractVisitor {
	@Override
	public void preVisit(final ASTNode node) {
		System.out.println("preVisit: " + node.toString());
		super.preVisit(node);
	}

	@Override
	public boolean visit(ASTNode node) {
		return true;
	}

	@Override
	public boolean visit(ArrayAccess arrayAccess) {
		return true;
	}

	@Override
	public boolean visit(ArrayCreation arrayCreation) {
		return true;
	}

	@Override
	public boolean visit(ArrayElement arrayElement) {
		return true;
	}

	@Override
	public boolean visit(Assignment assignment) {
		return true;
	}

	@Override
	public boolean visit(ASTError astError) {
		return true;
	}

	@Override
	public boolean visit(BackTickExpression backTickExpression) {
		return true;
	}

	// @Override
	public boolean visit(Block block) {
		return true;
	}

	@Override
	public boolean visit(BreakStatement breakStatement) {
		return true;
	}

	@Override
	public boolean visit(CastExpression castExpression) {
		return true;
	}

	@Override
	public boolean visit(CatchClause catchClause) {
		return true;
	}

	// @Override
	// public boolean visit(ClassConstantDeclaration classConstantDeclaration) {
	// return true; }

	@Override
	public boolean visit(ClassDeclaration classDeclaration) {
		System.out.println("visit(ClassDeclaration):" + classDeclaration.toString());
		return super.visit(classDeclaration);
	}

	@Override
	public boolean visit(ClassInstanceCreation classInstanceCreation) {
		return true;
	}

	@Override
	public boolean visit(ClassName className) {
		return true;
	}

	@Override
	public boolean visit(CloneExpression cloneExpression) {
		return true;
	}

	@Override
	public boolean visit(Comment comment) {
		System.out.println("visit(Comment):" + comment.toString());
		return super.visit(comment);
	}

	@Override
	public boolean visit(ConditionalExpression conditionalExpression) {
		return true;
	}

	@Override
	public boolean visit(ContinueStatement continueStatement) {
		return true;
	}

	@Override
	public boolean visit(DeclareStatement declareStatement) {
		return true;
	}

	@Override
	public boolean visit(DoStatement doStatement) {
		return true;
	}

	@Override
	public boolean visit(EchoStatement echoStatement) {
		return true;
	}

	@Override
	public boolean visit(EmptyStatement emptyStatement) {
		System.out.println("visit(EmptyStatement):" + emptyStatement.toString());
		return super.visit(emptyStatement);
	}

	@Override
	public boolean visit(ExpressionStatement expressionStatement) {
		System.out.println("visit(expressionStatement):" + expressionStatement.toString());
		return super.visit(expressionStatement);
	}

	@Override
	public boolean visit(FieldAccess fieldAccess) {
		return true;
	}

	public boolean visit(FieldsDeclaration fieldsDeclaration) {
		return true;
	}

	public boolean visit(ForEachStatement forEachStatement) {
		return true;
	}

	public boolean visit(FormalParameter formalParameter) {
		return true;
	}

	public boolean visit(ForStatement forStatement) {
		return true;
	}

	public boolean visit(FunctionDeclaration functionDeclaration) {
		return true;
	}

	public boolean visit(FunctionInvocation functionInvocation) {
		return true;
	}

	public boolean visit(FunctionName functionName) {
		return true;
	}

	public boolean visit(GlobalStatement globalStatement) {
		return true;
	}

	public boolean visit(Identifier identifier) {
		return true;
	}

	public boolean visit(IfStatement ifStatement) {
		return true;
	}

	public boolean visit(IgnoreError ignoreError) {
		return true;
	}

	public boolean visit(Include include) {
		return true;
	}

	public boolean visit(InfixExpression infixExpression) {
		return true;
	}

	public boolean visit(InLineHtml inLineHtml) {
		return true;
	}

	public boolean visit(InstanceOfExpression instanceOfExpression) {
		return true;
	}

	public boolean visit(InterfaceDeclaration interfaceDeclaration) {
		return true;
	}

	public boolean visit(ListVariable listVariable) {
		return true;
	}

	public boolean visit(MethodDeclaration methodDeclaration) {
		return true;
	}

	public boolean visit(MethodInvocation methodInvocation) {
		System.out.println("visit(MethodInvocation):" + methodInvocation.toString());
		return super.visit(methodInvocation);
	}

	public boolean visit(ParenthesisExpression parenthesisExpression) {
		return true;
	}

	public boolean visit(PostfixExpression postfixExpression) {
		return true;
	}

	public boolean visit(PrefixExpression prefixExpression) {
		return true;
	}

	public boolean visit(Program program) {
		return true;
	}

	@Override
	public boolean visit(Quote quote) {
		System.out.println("visit(quote):" + quote.toString());
		return super.visit(quote);
	}

	public boolean visit(Reference reference) {
		return true;
	}

	public boolean visit(ReflectionVariable reflectionVariable) {
		return true;
	}

	public boolean visit(ReturnStatement returnStatement) {
		return true;
	}

	@Override
	public boolean visit(Scalar scalar) {
		System.out.println("visit(Scalar):" + scalar.toString());
		return super.visit(scalar);
	}

	public boolean visit(SingleFieldDeclaration singleFieldDeclaration) {
		return true;
	}

	public boolean visit(StaticConstantAccess classConstantAccess) {
		return true;
	}

	public boolean visit(StaticFieldAccess staticFieldAccess) {
		return true;
	}

	public boolean visit(StaticMethodInvocation staticMethodInvocation) {
		return true;
	}

	public boolean visit(StaticStatement staticStatement) {
		return true;
	}

	public boolean visit(SwitchCase switchCase) {
		return true;
	}

	public boolean visit(SwitchStatement switchStatement) {
		return true;
	}

	public boolean visit(ThrowStatement throwStatement) {
		return true;
	}

	public boolean visit(TryStatement tryStatement) {
		return true;
	}

	public boolean visit(UnaryOperation unaryOperation) {
		return true;
	}

	public boolean visit(Variable variable) {
		System.out.println("visit(Variable):" + variable.toString());
		return super.visit(variable);
	}

	public boolean visit(WhileStatement whileStatement) {
		return true;
	}
}
