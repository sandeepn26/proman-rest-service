<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="content">
		<form:form method="POST" action="addUser" class="appform" modelAttribute="userDetail">
		<p>Personal Information</p>

		<table>
			<tr>
				<td><form:errors path="username" cssClass="error" element="div"/></td>
			</tr>
			<tr>
				<td>
					<label for="firstName">Firstname<span>*</span></label>
					<br/>
					<form:input type="text" name="firstName" path="firstName" id="firstName" />
				</td>
				<td>
					<label for="lastName">Lastname</label>
					<br/>
					<form:input type="text" name="lastName" path="lastName" id="lastName" />
				</td>
			</tr>
			<tr>
				<td>
					<label for="streetAddress">Street Address</label>
					<br/>
					<form:input type="text" name="streetAddress" path="streetAddress" id="streetAddress" />
				</td>
				<td>
					<label for="city">City</label>
					<br/>
					<form:input type="text" name="city" path="city" id="city" />
				</td>
			</tr>
			
			<tr>
				<td>
					<label for="state">State</label>
					<label style="margin-left:100px;">Zip</label>
					<br/>
					<form:input type="text" id="state" name="state" path="state" maxlength="2" style="width:25%;"/>
					
					<form:input type="text" maxlength="5" name="zip" path="zip" id="zip" style="width:25%;"/>-<form:input type="text" maxlength="4" name="county" path="county" id="county" style="width:25%;"/>
				</td>
				<td>
					<label for="country">Country</label>
					<br/>
					<form:input type="text" name="country" path="country" id="country" />
				</td>
			</tr>
			
			<tr>
				<td>
					<label>DOB</label>
					<br/>
					<div class="container">
    
    <select class="bear-dates"></select>
    
    <select class="bear-months"></select>
    
    <select class="bear-years"></select>
</div>
				</td>
				<td>
					
				</td>
			</tr>
			
			<tr>
				<td>
					<label for="email">Email</label>
					<br/>
					<form:input type="email" name="email" id="email" path="email" />
				</td>
				<td>
					<label for="phone">Phone</label>
					<br/>
					<form:input type="tel" name="phone" id="phone" path="phone" />
					<form:input type="hidden" name="dob" id="dob" path="dob" value="09-26-1979"/>
				</td>
			</tr>
			
			<tr><td><a style="width:200px;" href="signin">CANCEL</a></td><td><input style="width:200px;float:right;" type="submit" value="SAVE"></td></tr>
			
		</table>
		</form:form>

	</div>
	
	<script src="/proman/resources/js/calender.js" type="text/javascript"></script>
<script type="text/javascript">
dates('option');
months('option');
//You can change the startYear(1990) and endYear(2017)
years('option', 2000, 2017);
</script>