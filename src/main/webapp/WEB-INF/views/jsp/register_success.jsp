<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Employee</title>
    <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
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
        .form-group {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Registered Employee Successfully</h2>
        <table border="1">
            <tr>
                <th>Employee ID</th>
                <th>Employee Name</th>
                <th>Department ID</th>
                <th>In Time</th>
                <th>Out Time</th>
                <th>Face ID</th>
            </tr>
            <tr>
                <td>${employee.empId}</td>
                <td>${employee.empName}</td>
                <td>${employee.empDeptId}</td>
                <td>${employee.inTime}</td>
                <td>${employee.outTime}</td>
                <td>${employee.faceId}</td>
            </tr>
        </table>
        <br>
        <a href="/jsp/viewEmployees">Back to Employee List</a>
    </div>
    <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>
