<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form class="container" action="usercomfirm" method = "get">
     <label class="form-label">First Name:</label>
     <input type="text" class="form-control" name="FirstName" required><br>
     <label class="form-label">Last Name:</label>
     <input type="text" class="form-control" name="LastName" required><br>
     <label class="form-label">Date born:</label>
     <input type="date" class="form-control" id="DoB" name="ngaysinh">
     <br>
     <label for="country">Select a country:</label><br>
     <select class="form-select" id="poB" name ="poB">
        <option value="Đà Nẵng" selected> Da Nang </option>
        <option value="Quảng Nam"> Quảng Nam </option>
        <option value="Sài Gòn"> Sài Gòn </option>
        <option value="Gia Lai"> Gia Lai </option>
     </select>
     <br>
     <label for="sex">Choose your sex:</label>
     <input type ="radio" class="form-check-input" id="Man" name="Sex" value="Man" required>
     <label class="form-check-label" for="Man">Man</label>
     <input type ="radio" class="form-check-input" id="Women" name="Sex" value="Women" required>
     <label class="form-check-label" for="Women">Women</label>
     <input type ="radio" class="form-check-input" id="Orther" name="Sex" value="Other" required>
     <label class="form-check-label" for="Orther">Other</label>
     <br>
     Day to go school:
     <input class="form-check-input" type="checkbox" id="Day1" name="freeDay" value="Monday">
     <label class="form-check-label" for="Monday">Monday</label>
     <input class="form-check-input" type="checkbox" id="Day2" name="freeDay" value="Tuesday">
     <label class="form-check-label" for="Tuesday">Tuesday</label>
     <input class="form-check-input" type="checkbox" id="Day3" name="freeDay" value="Wednesday">
     <label class="form-check-label" for="Wednesday">Wednesday</label>
     <input class="form-check-input" type="checkbox" id="Day4" name="freeDay" value="Thursday">
     <label class="form-check-label" for="Thursday">Thursday</label>
     <input class="form-check-input" type="checkbox" id="Day5" name="freeDay" value="Friday">
     <label class="form-check-label" for="Friday">Friday</label>
     <input class="form-check-input" type="checkbox" id="Day6" name="freeDay" value="Saturday">
     <label class="form-check-label" for="Saturday">Saturday</label>
     <input class="form-check-input" type="checkbox" id="Day7" name="freeDay" value="Sunday">
     <label class="form-check-label" for="Sunday">Sunday</label>
     <br>
     <input type="submit" class="btn btn-primary" value="Submit"> 
</form>

</body>
</html>