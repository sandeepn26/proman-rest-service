<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="content">
	<form:form method="POST" action="addUser" class="signupform"
		modelAttribute="user">
		<table>
			<%-- <tr>
				<td><spring:message code="label.firstName" /></td>
			</tr> --%>
			<spring:message code="placeholder.username" var="usernameplaceholder" />
			<spring:message code="placeholder.password" var="passwordplaceholder" />
			<spring:message code="placeholder.retypePassword" var="rtpasswordplaceholder" />
			<spring:message code="submit.createAccount" var="createAccount" />
			
			<tr>
				<td><form:input type="text"
						placeholder="${usernameplaceholder}" name="username"
						path="username" id="usernameInput" />
						</td>
						<td><form:errors path="username" cssClass="error" element="div"/></td>
			</tr>
			
			<tr>
				<td><form:input type="password"
						placeholder="${passwordplaceholder}" path="password" /></td>
						<td><form:errors path="password" cssClass="error" element="div"/></td>
			</tr>
			<tr>
				<td><form:input type="password"
						placeholder="${rtpasswordplaceholder}" path="retypedpassword" /></td>
						<td><form:errors path="retypedpassword" cssClass="error" element="div"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="${createAccount}" /></td><td/>
			</tr>
		</table>
	</form:form>
</div>
