<%-- 
    Document   : newSudent
    Created on : 09-May-2023, 4:33:24 PM
    Author     : QaswaTech_1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add student</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
   
    </head>
    <body>
        <%@include file="menu.jsp" %>
        
        
        <div class="card mt-5 offset-2" style="width: 50rem">
            <div class="card-header text-primary text-center">
                Student Registration
            </div>
            <div class="card-body">
                <h2>  ${param.msg} </h2>

                <form action="StudentController" method="get">
                    <input type="hidden" name="action" value="insert">
                    <div>
                        <label class="form-label">Name : </label>
                        <input class='form-control' type="text" name="name" required>
                    </div>
                    <div>
                        <label class="form-label"> Email : </label>
                        <input class="form-control" type="email" name="email"><br>
                    </div>
                    <div>
                        <label class="form-label">Phone : </label>
                        <input class="form-control" type="number" name="phone">
                    </div>
                    <div>
                        <label class="form-label">Branch :  </label>
                        <input class="form-control" type="text" name="branch">
                        </div>
                    <div>
                        <label class="form-label">Degree :  </label>
                        <input class="form-control" type="text" name="degree">
                        </div>

                            <div>
                                <label class="form-label">Semester : </label>
                                <input type="number" name="semester" class="form-control">
                            </div>
                            <div>
                                <label class="form-label">College : </label>
                                <input type="text" name="college" class="form-control">
                            </div>

                            <div>
                                <label class="form-label">Address: </label>
                                <textarea name="address" class="form-control"></textarea>
                            </div>
                            <div>
                                <label class="form-label">City : </label>
                                <select name="city" class="form-control">
                                    <option>Nagpur</option>
                                    <option>pune</option>
                                    <option>mumbai</option>
                                </select>
                            </div>
                            <div>
                                <label class="form-label">State : </label>
                                <select name="state" class="form-control">
                                    <option>Maharashtra</option>
                                    <option>UP</option>
                                    <option>MP</option>
                                </select> 
                            </div>
                            <div>
                                <input type="submit" class="btn btn-primary" value="Save">
                                <input type="reset" value="Clear" class="btn btn-danger">
                            </div>
                            </form>

                        </div>

                        <h1>${param.msg}</h1>

                        </body>
                        </html>
