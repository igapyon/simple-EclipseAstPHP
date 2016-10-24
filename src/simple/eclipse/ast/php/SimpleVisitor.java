package simple.eclipse.ast.php;

import org.eclipse.php.internal.core.ast.nodes.*;
import org.eclipse.php.internal.core.ast.visitor.AbstractVisitor;

/**
 * https://github.com/eclipse/pdt/blob/master/plugins/org.eclipse.php.core/src/org/eclipse/php/internal/core/ast/visitor/AbstractVisitor.java
 */
public class SimpleVisitor extends AbstractVisitor {
	@Override
	public void preVisit(final ASTNode node) {
		System.out.println("preVisit: " + node.toString());
		super.preVisit(node);
	}

	@Override
	public boolean visit(ASTNode node) {
		System.out.println("visit(ASTNode): " + node.toString());
		return super.visit(node);
	}

	@Override
	public boolean visit(ArrayAccess arrayAccess) {
		System.out.println("visit(arrayAccess): " + arrayAccess.toString());
		return super.visit(arrayAccess);
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
		System.out.println("visit(assignment): " + assignment.toString());
		return super.visit(assignment);
	}

	@Override
	public boolean visit(ASTError astError) {
		return true;
	}

	@Override
	public boolean visit(BackTickExpression backTickExpression) {
		return true;
	}

	@Override
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

	@Override
	public boolean visit(ConstantDeclaration constantDeclaration) {
		System.out.println("visit(constantDeclaration): " + constantDeclaration.toString());
		return super.visit(constantDeclaration);
	}

	@Override
	public boolean visit(ClassDeclaration classDeclaration) {
		System.out.println("visit(ClassDeclaration):" + classDeclaration.toString());
		return super.visit(classDeclaration);
	}

	@Override
	public boolean visit(ClassInstanceCreation classInstanceCreation) {
		System.out.println("visit(classInstanceCreation): " + classInstanceCreation.toString());
		return super.visit(classInstanceCreation);
	}

	@Override
	public boolean visit(ClassName className) {
		System.out.println("visit(className): " + className.toString());
		return super.visit(className);
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
		System.out.println("visit(conditionalExpression): " + conditionalExpression.toString());
		return super.visit(conditionalExpression);
	}

	@Override
	public boolean visit(ContinueStatement continueStatement) {
		return true;
	}

	@Override
	public boolean visit(DeclareStatement declareStatement) {
		System.out.println("visit(declareStatement): " + declareStatement.toString());
		return super.visit(declareStatement);
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
		System.out.println("visit(fieldAccess): " + fieldAccess.toString());
		return super.visit(fieldAccess);
	}

	@Override
	public boolean visit(FieldsDeclaration fieldsDeclaration) {
		System.out.println("visit(fieldsDeclaration): " + fieldsDeclaration.toString());
		return super.visit(fieldsDeclaration);
	}

	@Override
	public boolean visit(ForEachStatement forEachStatement) {
		return true;
	}

	@Override
	public boolean visit(FormalParameter formalParameter) {
		System.out.println("visit(formalParameter): " + formalParameter.toString());
		return super.visit(formalParameter);
	}

	@Override
	public boolean visit(ForStatement forStatement) {
		return true;
	}

	@Override
	public boolean visit(FunctionDeclaration functionDeclaration) {
		System.out.println("visit(functionDeclaration): " + functionDeclaration.toString());
		return super.visit(functionDeclaration);
	}

	@Override
	public boolean visit(FunctionInvocation functionInvocation) {
		return true;
	}

	@Override
	public boolean visit(FunctionName functionName) {
		System.out.println("visit(functionName): " + functionName.toString());
		return super.visit(functionName);
	}

	@Override
	public boolean visit(GlobalStatement globalStatement) {
		System.out.println("visit(globalStatement): " + globalStatement.toString());
		return super.visit(globalStatement);
	}

	@Override
	public boolean visit(GotoLabel gotoLabel) {
		return true;
	}

	@Override
	public boolean visit(GotoStatement gotoStatement) {
		return true;
	}

	@Override
	public boolean visit(Identifier identifier) {
		System.out.println("visit(identifier): " + identifier.toString());
		return super.visit(identifier);
	}

	@Override
	public boolean visit(IfStatement ifStatement) {
		return true;
	}

	@Override
	public boolean visit(IgnoreError ignoreError) {
		return true;
	}

	@Override
	public boolean visit(Include include) {
		System.out.println("visit(include): " + include.toString());
		return super.visit(include);
	}

	@Override
	public boolean visit(InfixExpression infixExpression) {
		return true;
	}

	@Override
	public boolean visit(InLineHtml inLineHtml) {
		return true;
	}

	@Override
	public boolean visit(InstanceOfExpression instanceOfExpression) {
		return true;
	}

	@Override
	public boolean visit(InterfaceDeclaration interfaceDeclaration) {
		System.out.println("visit(interfaceDeclaration): " + interfaceDeclaration.toString());
		return super.visit(interfaceDeclaration);
	}

	@Override
	public boolean visit(LambdaFunctionDeclaration lambdaFunctionDeclaration) {
		return true;
	}

	@Override
	public boolean visit(AnonymousClassDeclaration anonymousClassDeclaration) {
		return true;
	}

	@Override
	public boolean visit(ListVariable listVariable) {
		return true;
	}

	@Override
	public boolean visit(MethodDeclaration methodDeclaration) {
		System.out.println("visit(methodDeclaration): " + methodDeclaration.toString());
		return super.visit(methodDeclaration);
	}

	@Override
	public boolean visit(MethodInvocation methodInvocation) {
		System.out.println("visit(MethodInvocation):" + methodInvocation.toString());
		return super.visit(methodInvocation);
	}

	@Override
	public boolean visit(NamespaceDeclaration namespaceDeclaration) {
		System.out.println("visit(namespaceDeclaration):" + namespaceDeclaration.toString());
		return super.visit(namespaceDeclaration);
	}

	@Override
	public boolean visit(NamespaceName namespaceName) {
		System.out.println("visit(namespaceName):" + namespaceName.toString());
		return super.visit(namespaceName);
	}

	@Override
	public boolean visit(ParenthesisExpression parenthesisExpression) {
		return true;
	}

	@Override
	public boolean visit(PostfixExpression postfixExpression) {
		return true;
	}

	@Override
	public boolean visit(PrefixExpression prefixExpression) {
		return true;
	}

	@Override
	public boolean visit(Program program) {
		return true;
	}

	@Override
	public boolean visit(Quote quote) {
		System.out.println("visit(quote):" + quote.toString());
		return super.visit(quote);
	}

	@Override
	public boolean visit(Reference reference) {
		System.out.println("visit(reference): " + reference.toString());
		return super.visit(reference);
	}

	@Override
	public boolean visit(ReflectionVariable reflectionVariable) {
		return true;
	}

	@Override
	public boolean visit(ReturnStatement returnStatement) {
		return true;
	}

	@Override
	public boolean visit(YieldExpression YieldExpression) {
		return true;
	}

	@Override
	public boolean visit(Scalar scalar) {
		System.out.println("visit(Scalar):" + scalar.toString());
		return super.visit(scalar);
	}

	@Override
	public boolean visit(SingleFieldDeclaration singleFieldDeclaration) {
		System.out.println("visit(singleFieldDeclaration): " + singleFieldDeclaration.toString());
		return super.visit(singleFieldDeclaration);
	}

	@Override
	public boolean visit(StaticConstantAccess classConstantAccess) {
		return true;
	}

	@Override
	public boolean visit(StaticFieldAccess staticFieldAccess) {
		System.out.println("visit(staticFieldAccess): " + staticFieldAccess.toString());
		return super.visit(staticFieldAccess);
	}

	@Override
	public boolean visit(StaticMethodInvocation staticMethodInvocation) {
		return true;
	}

	@Override
	public boolean visit(StaticStatement staticStatement) {
		System.out.println("visit(staticStatement): " + staticStatement.toString());
		return super.visit(staticStatement);
	}

	@Override
	public boolean visit(SwitchCase switchCase) {
		return true;
	}

	@Override
	public boolean visit(SwitchStatement switchStatement) {
		return true;
	}

	@Override
	public boolean visit(ThrowStatement throwStatement) {
		return true;
	}

	@Override
	public boolean visit(TryStatement tryStatement) {
		return true;
	}

	@Override
	public boolean visit(UnaryOperation unaryOperation) {
		return true;
	}

	@Override
	public boolean visit(UseStatement useStatement) {
		System.out.println("visit(useStatement): " + useStatement.toString());
		return super.visit(useStatement);
	}

	@Override
	public boolean visit(UseStatementPart useStatementPart) {
		return true;
	}

	@Override
	public boolean visit(Variable variable) {
		System.out.println("visit(Variable):" + variable.toString());
		return super.visit(variable);
	}

	@Override
	public boolean visit(WhileStatement whileStatement) {
		return true;
	}

	// php5.4 starts

	public boolean visit(FullyQualifiedTraitMethodReference node) {
		return true;
	}

	public boolean visit(TraitAlias node) {
		return true;
	}

	public boolean visit(TraitAliasStatement node) {
		return true;
	}

	public boolean visit(TraitDeclaration node) {
		return true;
	}

	public boolean visit(TraitPrecedence node) {
		return true;
	}

	public boolean visit(TraitPrecedenceStatement node) {
		return true;
	}

	public boolean visit(TraitUseStatement node) {
		return true;
	}

	// php5.4 ends

	public boolean visit(FinallyClause node) {
		return true;
	}
}
