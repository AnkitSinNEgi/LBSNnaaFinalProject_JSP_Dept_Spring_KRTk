<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Employee List</title>
    <style>
        body {
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Employee List</h2>
        <h6>Registered Employee Successfully</h6>
        <table border="1">
            <tr>
                <th>Employee ID</th>
                <th>Employee Name</th>
                <th>Department ID</th>
                <th>In Time</th>
                <th>Out Time</th>
                <th>Face ID</th>
            </tr>
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td>${employee.empId}</td>
                    <td>${employee.empName}</td>
                    <td>${employee.empDeptId}</td>
                    <td>${employee.inTime}</td>
                    <td>${employee.outTime}</td>
                    <td>${employee.faceId}</td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <a href="/jsp/registerEmployee">Register New Employee</a>
    </div>
</body>
</html>
