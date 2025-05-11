<%-- 
    Document   : newAcademic
    Created on : 28-Jan-2025, 4:33:24 PM
    Author     : QaswaTech_1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Academic Record</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        
        <div class="card mt-5 offset-2" style="width: 50rem">
            <div class="card-header text-primary text-center">
                Academic Record Registration
            </div>
            <div class="card-body">
                <h2>  ${param.msg} </h2>

                <form action="StudentController" method="post">
                    <input type="hidden" name="action" value="insertAcademic">
                     <%
                    String studentId = request.getParameter("student_id");
                    String name = request.getParameter("name");
                    %>
                    <!-- Academic Information Fields -->
                    <div>
                        <label class="form-label">Student ID : </label>
                      <input class="form-control" type="number" name="student_id" value="<%= studentId != null ? studentId : "" %>" required readonly>
                    </div>
                    <div>
                        <label class="form-label">Student Name : </label>
                      <input class="form-control" type="text" name="" value="<%=name%>" required readonly>
                    </div>
                    <div>
                        <label class="form-label">CAP Round : </label>
                        <input class="form-control" type="text" name="cap_round">
                    </div>
                    <div>
                        <label class="form-label">Merit No : </label>
                        <input class="form-control" type="text" name="merit_no">
                    </div>
                    <div>
                        <label class="form-label">10th Percent : </label>
                        <input class="form-control" type="text" name="percent_10">
                    </div>
                    <div>
                        <label class="form-label">12th Percent : </label>
                        <input class="form-control" type="text" name="percent_12">
                    </div>
                    <div>
                        <label class="form-label">Diploma Percent : </label>
                        <input class="form-control" type="text" name="percent_diploma">
                    </div>
                    <div>
                        <label class="form-label">Year of Admission : </label>
                        <input class="form-control" type="text" name="year_of_admission">
                    </div>
                    <div>
                        <label class="form-label">Admission Type : </label>
                        <input class="form-control" type="text" name="admission_type">
                    </div>
                    <div>
                        <label class="form-label">Enrollment No : </label>
                        <input class="form-control" type="text" name="enrollment_no">
                    </div>
                    <div>
                        <label class="form-label">D1/D2 : </label>
                        <input class="form-control" type="text" name="d1_d2">
                    </div>
                    <div>
                        <label class="form-label">Application Type : </label>
                        <input class="form-control" type="text" name="application_type">
                    </div>
                    <div>
                        <label class="form-label">Seat Type : </label>
                        <input class="form-control" type="text" name="seat_type">
                    </div>
                    <div>
                        <label class="form-label">University : </label>
                        <input class="form-control" type="text" name="university">
                    </div>
                    <div>
                        <label class="form-label">Entrance Exam : </label>
                        <input class="form-control" type="text" name="extance_exam">
                    </div>
                    <div>
                        <label class="form-label">Eligibility Percent : </label>
                        <input class="form-control" type="text" name="eligibility_percent">
                    </div>
                    <div>
                        <label class="form-label">Fees Paid : </label>
                        <input class="form-control" type="text" name="fees_paid">
                    </div>
                    <div>
                        <label class="form-label">All Semester Marks : </label>
                        <input class="form-control" type="text" name="all_semester_mark">
                    </div>
                    <div>
                        <label class="form-label">Roll No : </label>
                        <input class="form-control" type="number" name="roll_no">
                    </div>
                    <div>
                        <label class="form-label">Blocking : </label>
                        <input class="form-control" type="text" name="blocking">
                    </div>
                    <div>
                        <label class="form-label">Re-exam : </label>
                        <input class="form-control" type="text" name="re_exam">
                    </div>
                    <div>
                        <label class="form-label">Re-exam Attempt : </label>
                        <input class="form-control" type="number" name="re_exam_attemp">
                    </div>
                    <div>
                        <label class="form-label">Re-exam Subject : </label>
                        <input class="form-control" type="text" name="re_exam_subject">
                    </div>
                    <div>
                        <label class="form-label">Current Semester : </label>
                        <input class="form-control" type="text" name="current_semister">
                    </div>

                    <!-- Form Buttons -->
                    <div>
                        <input type="submit" class="btn btn-primary" value="Save">
                        <input type="reset" value="Clear" class="btn btn-danger">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
