<%-- 
    Document   : newPersonal
    Created on : 28-Jan-2025, 4:33:24 PM
    Author     : QaswaTech_1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Personal Record</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        
        <div class="card mt-5 offset-2" style="width: 50rem">
            <div class="card-header text-primary text-center">
                Personal Record Registration
            </div>
            <div class="card-body">
                <h2>  ${param.msg} </h2>

                <form action="StudentController" method="get">
                    <input type="hidden" name="action" value="insertPersonal">
                    
                    <!-- Personal Information Fields -->
                    <div>
                        <label class="form-label">Name : </label>
                        <input class="form-control" type="text" name="name" required>
                    </div>
                    <div>
                        <label class="form-label">Father's Name : </label>
                        <input class="form-control" type="text" name="father" required>
                    </div>
                    <div>
                        <label class="form-label">Mother's Name : </label>
                        <input class="form-control" type="text" name="mother" required>
                    </div>
                    <div>
                        <label class="form-label">Surname : </label>
                        <input class="form-control" type="text" name="surname">
                    </div>
                    <div>
                        <label class="form-label">Gender : </label>
                        <select name="gender" class="form-control">
                            <option>Male</option>
                            <option>Female</option>
                            <option>Other</option>
                        </select>
                    </div>
                    <div>
                        <label class="form-label">Date of Birth : </label>
                        <input class="form-control" type="date" name="dob">
                    </div>
                    <div>
                        <label class="form-label">Religion : </label>
                        <input class="form-control" type="text" name="religion">
                    </div>
                    <div>
                        <label class="form-label">Email : </label>
                        <input class="form-control" type="email" name="email">
                    </div>
                    <div>
                        <label class="form-label">Phone : </label>
                        <input class="form-control" type="text" name="phone">
                    </div>
                    <div>
                        <label class="form-label">Parent's Phone : </label>
                        <input class="form-control" type="text" name="parentPhone">
                    </div>
                    <div>
                        <label class="form-label">Address : </label>
                        <textarea class="form-control" name="address"></textarea>
                    </div>
                    <div>
                        <label class="form-label">Permanent Address : </label>
                        <textarea class="form-control" name="permanentAddress"></textarea>
                    </div>
                    <div>
                        <label class="form-label">City : </label>
                        <input class="form-control" type="text" name="city">
                    </div>
                    <div>
                        <label class="form-label">State : </label>
                        <input class="form-control" type="text" name="state">
                    </div>
                    <div>
                        <label class="form-label">Pincode : </label>
                        <input class="form-control" type="text" name="pincode">
                    </div>
                    <div>
                        <label class="form-label">ABC ID : </label>
                        <input class="form-control" type="text" name="abcId">
                    </div>
                    <div>
                        <label class="form-label">Driving License Number : </label>
                        <input class="form-control" type="text" name="drivingLicenceNo">
                    </div>
                    <div>
                        <label class="form-label">Voter ID : </label>
                        <input class="form-control" type="text" name="voterId">
                    </div>
                    <div>
                        <label class="form-label">Aadhaar Number : </label>
                        <input class="form-control" type="text" name="aadhaarNo">
                    </div>
                    
                    <!-- Hidden fields for created and updated (could be managed by the backend) -->
                    <div>
                        <input type="hidden" name="created" value="${currentTimestamp}">
                        <input type="hidden" name="updated" value="${currentTimestamp}">
                    </div>

                    <!-- Form Buttons -->
                    <div>
                        <input type="submit" class="btn btn-primary" value="Save">
                        <input type="reset" value="Clear" class="btn btn-danger">
                    </div>
                </form>
            </div>

            <h1>${param.msg}</h1>
        </div>
    </body>
</html>
