<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student registation from</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body>
	<h2>Add Student Data</h2>


	<div class="container">
		<form:form method="POST"
			action="http://localhost:8081/collegemanagement/save"
			modelAttribute="studentbean">
			<table>
				<tr>
					<td><form:label path="studentId">Student ID: </form:label></td>
					<td><form:input path="studentId"
							value="${studentbean.studentId}" /></td>
				</tr>

				<tr>
					<td><form:label path="studentFullName">Student FullName: </form:label></td>
					<td><form:input path="studentFullName"
							value="${studentbean.studentFullName}" /></td>
				</tr>

				<tr>
					<td><form:label path="studentFatherName">Student FatherName: </form:label></td>
					<td><form:input path="studentFatherName"
							value="${studentbean.studentFatherName}" /></td>
				</tr>

				<tr>
					<td><form:label path="studentMotherName">Student MotherName: </form:label></td>
					<td><form:input path="studentMotherName"
							value="${studentbean.studentMotherName}" /></td>
				</tr>

				<tr>
					<td><form:label path="studentGender">Student Gender: </form:label></td>
					<td><form:input path="studentGender"
							value="${studentbean.studentGender}" /></td>
				</tr>

	<tr>
					<td><form:label path="birthDate">Student BirthDate: </form:label></td>
					<td><form:input path="birthDate"
							value="${studentbean.birthDate}" /></td>
				</tr>

<tr>
					<td><form:label path="yearLevel">Student YearLevel: </form:label></td>
					<td><form:input path="yearLevel"
							value="${studentbean.yearLevel}" /></td>
				</tr>

<tr>
					<td><form:label path="emailId">Student EmailId: </form:label></td>
					<td><form:input path="emailId"
							value="${studentbean.emailId}" /></td>
				</tr>

<tr>
					<td><form:label path="mobileNumber">Student MobileNumber: </form:label></td>
					<td><form:input path="mobileNumber"
							value="${studentbean.mobileNumber}" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Submit" /></td>
				</tr>

			</table>
		</form:form>



		<hr>

		<c:if test="${!empty students}">
			<h2>List Students</h2>
			<table align="left" border="1">
				<tr>
					<th>Student ID</th>
					<th>Student FullName</th>
					<th>Student FatherName</th>
					<th>Student MotherName</th>
					<th>Student Gender</th>
					<th>Student BirthDate</th>
					
					<th>Student YearLevel</th>
					<th>Student EmailId</th>
					<th>Student MobileNumber</th>
					<th>Actions on Row</th>
				</tr>

				<c:forEach items="${students}" var="student">
					<tr>
						<td><c:out value="${student.studentId}" /></td>
						<td><c:out value="${student.studentFullName}" /></td>
						<td><c:out value="${student.studentFatherName}" /></td>
						<td><c:out value="${student.studentMotherName}" /></td>
						<td><c:out value="${student.studentGender}" /></td>
							<td><c:out value="${student.birthDate}" /></td>
							<td><c:out value="${student.yearLevel}" /></td>
							<td><c:out value="${student.emailId}" /></td>
							<td><c:out value="${student.mobileNumber}" /></td>
						<td align="center"><a href="edit/${student.studentId}">Edit</a>
							| <a href="delete/${student.studentId}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

	</div>

</body>
</html>