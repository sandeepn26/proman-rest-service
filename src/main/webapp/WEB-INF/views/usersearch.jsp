<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<div class="content">
		<table>
			<tr>
				<td class="formtitle">
						Search User
				</td>
			</tr>
			<tr>
				<td>
					<div class="searchform">
						<div>
							<form>
							<input type="text" id="first_name" placeholder="Firstname"/>
							<input type="text" id="first_name" placeholder="Firstname"/>
							<input type="submit" id="first_name" value="Search"/>
							</form>
						</div>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="searchresults">
						<table>
							<tr>
								<th style="padding-right: 250px;">
									User
								</th>
								<th>
									No of failed logins
								</th>
								<th>
									Locked
								</th>
								<th>
									Last login date
								</th>
							</tr>
								
							<c:forEach items="${users}" var="user">
    							<tr>
								<td>
									<a href="#">${user.username}</a>
								</td>
								<td>
									${user.failedLogins}
								</td>
								<td>
									${user.locked}
								</td>
								<td>
									${user.lastLoginDate}
								</td>
							</tr>
							</c:forEach>			
						</table>
					</div>
				</td>
			</tr>
		</table>
	</div>