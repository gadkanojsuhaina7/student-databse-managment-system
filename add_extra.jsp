

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Extra Carriculam Activities</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        
        <div class="card mt-5 offset-2" style="width: 50rem">
            <div class="card-header text-primary text-center">
                Add Extra Carriculam Activities
            </div>
            <div class="card-body">
                <h2>  ${param.msg} </h2>

                <form action="StudentController" method="post">
                    <input type="hidden" name="action" value="insertExtra">
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

                    <!-- Extra-Curricular Information Fields -->
                    <div>
                        <label class="form-label">Sports : </label>
                        <input class="form-control" type="text" name="sports">
                    </div>
                    <div>
                        <label class="form-label">Internship Name : </label>
                        <input class="form-control" type="text" name="internship_name">
                    </div>
                    <div>
                        <label class="form-label">Seminar Name : </label>
                        <input class="form-control" type="text" name="seminar_name">
                    </div>
                    <div>
                        <label class="form-label">Project Name : </label>
                        <input class="form-control" type="text" name="project_name">
                    </div>
                    <div>
                        <label class="form-label">Paper Presentation : </label>
                        <input class="form-control" type="text" name="paper_presentation">
                    </div>
                    <div>
                        <label class="form-label">Event Name : </label>
                        <input class="form-control" type="text" name="event_name">
                    </div>
                    <div>
                        <label class="form-label">Course Certificate : </label>
                        <input class="form-control" type="text" name="course_certificate">
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
