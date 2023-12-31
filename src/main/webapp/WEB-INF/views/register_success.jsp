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
        <h2>Register Employee</h2>
        <form:form action="/jsp/registerEmployee" method="post" modelAttribute="employee">
            <div class="form-group">
                Employee ID:
                <form:input path="empId" type="text" placeholder="employee ID" />
            </div>
            <div class="form-group">
                Employee Name:
                <form:input path="empName" type="text" placeholder="employee name" />
            </div>
            <div class="form-group">
                Department ID:
                <form:input path="empDeptId" type="text" placeholder="department ID" />
            </div>
            <div class="form-group">
                In Time:
                <form:input path="inTime" type="text" placeholder="in time" />
            </div>
            <div class="form-group">
                Out Time:
                <form:input path="outTime" type="text" placeholder="out time" />
            </div>
            <div class="form-group">
                Face ID:
                <form:input path="faceId" type="text" placeholder="face ID" />
            </div>
            <div class="form-group">
                <form:button class="btn btn-success">Register</form:button>
            </div>
        </form:form>
        <br>
        <a href="/jsp/viewEmployees">Back to Employee List</a>
    </div>
    <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>
