package com.qt.apn_portal.dao;

import com.qt.apn_portal.database.Database;
import com.qt.apn_portal.modal.Academic;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcademicDao {

    // Insert academic record
    public String insertAcademic(Academic academic) {
        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;
        String query = "INSERT INTO academic (student_id, cap_round, merit_no, percent_10, percent_12, percent_diploma, " +
                       "year_of_admission, admission_type, enrollment_no, d1_d2, application_type, seat_type, university, extance_exam, " +
                       "eligibility_percent, fees_paid, all_semester_mark, roll_no, blocking, re_exam, re_exam_attemp, re_exam_subject, current_semister) " +
                       "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            cs = con.prepareCall(query);
            
            // Set the parameters from the Academic object
            cs.setInt(1, academic.getStudentId());
            cs.setString(2, academic.getCapRound());
            cs.setString(3, academic.getMeritNo());
            cs.setString(4, academic.getPercent10());
            cs.setString(5, academic.getPercent12());
            cs.setString(6, academic.getPercentDiploma());
            cs.setString(7, academic.getYearOfAdmission());
            cs.setString(8, academic.getAdmissionType());
            cs.setString(9, academic.getEnrollmentNo());
            cs.setString(10, academic.getD1D2());
            cs.setString(11, academic.getApplicationType());
            cs.setString(12, academic.getSeatType());
            cs.setString(13, academic.getUniversity());
            cs.setString(14, academic.getExtanceExam());
            cs.setString(15, academic.getEligibilityPercent());
            cs.setString(16, academic.getFeesPaid());
            cs.setString(17, academic.getAllSemesterMark());
            cs.setInt(18, academic.getRollNo());
            cs.setString(19, academic.getBlocking());
            cs.setString(20, academic.getReExam());
            cs.setInt(21, academic.getReExamAttempt());
            cs.setString(22, academic.getReExamSubject());
            cs.setString(23, academic.getCurrentSemester());
            
            // Execute the update
            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "Academic record inserted successfully.";
            }
        } catch (Exception e) {
            message = "Unable to insert due to: " + e.getMessage();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    // Handle SQLException during closing connection (optional)
                }
            }
        }
        return message;
    }

    // Select all academic records
    public ArrayList<Academic> selectAll() {
        ArrayList<Academic> academicList = new ArrayList<>();
        Connection con = Database.connectDB();
        CallableStatement cs = null;
        ResultSet rs = null;
        String query = "SELECT * FROM academic"; // SQL query to fetch all rows from the academic table
        
        try {
            cs = con.prepareCall(query);  // Prepare the statement
            rs = cs.executeQuery();  // Execute the query

            while (rs.next()) {
                // Add each row as an Academic object to the list
                academicList.add(
                        new Academic(
                                rs.getInt("id"),
                                rs.getInt("student_id"),
                                rs.getString("cap_round"),
                                rs.getString("merit_no"),
                                rs.getString("percent_10"),
                                rs.getString("percent_12"),
                                rs.getString("percent_diploma"),
                                rs.getString("year_of_admission"),
                                rs.getString("admission_type"),
                                rs.getString("enrollment_no"),
                                rs.getString("d1_d2"),
                                rs.getString("application_type"),
                                rs.getString("seat_type"),
                                rs.getString("university"),
                                rs.getString("extance_exam"),
                                rs.getString("eligibility_percent"),
                                rs.getString("fees_paid"),
                                rs.getString("all_semester_mark"),
                                rs.getInt("roll_no"),
                                rs.getString("blocking"),
                                rs.getString("re_exam"),
                                rs.getInt("re_exam_attemp"),
                                rs.getString("re_exam_subject"),
                                rs.getString("current_semister"),
                                rs.getString("created"),
                                rs.getString("updated")
                        )
                );
            }
        } catch (Exception e) {
            System.out.println("Error in selectAll(): " + e.getMessage());
        } finally {
            // Close the database connection
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    // Handle exception during connection close (optional)
                }
            }
        }
        return academicList;
    }

    // Select academic record by ID
    public Academic selectById(int id) {
        Academic academic = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;
        ResultSet rs = null;
        String query = "SELECT * FROM academic WHERE student_id = ?"; // SQL query to fetch record by ID
        
        try {
            cs = con.prepareCall(query);  // Prepare the statement
            cs.setInt(1, id);  // Set the ID parameter
            rs = cs.executeQuery();  // Execute the query

            if (rs.next()) {  // Check if a result was returned
                // Create a new Academic object from the result set
                academic = new Academic(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getString("cap_round"),
                        rs.getString("merit_no"),
                        rs.getString("percent_10"),
                        rs.getString("percent_12"),
                        rs.getString("percent_diploma"),
                        rs.getString("year_of_admission"),
                        rs.getString("admission_type"),
                        rs.getString("enrollment_no"),
                        rs.getString("d1_d2"),
                        rs.getString("application_type"),
                        rs.getString("seat_type"),
                        rs.getString("university"),
                        rs.getString("extance_exam"),
                        rs.getString("eligibility_percent"),
                        rs.getString("fees_paid"),
                        rs.getString("all_semester_mark"),
                        rs.getInt("roll_no"),
                        rs.getString("blocking"),
                        rs.getString("re_exam"),
                        rs.getInt("re_exam_attemp"),
                        rs.getString("re_exam_subject"),
                        rs.getString("current_semister"),
                        rs.getString("created"),
                        rs.getString("updated")
                );
            }
        } catch (Exception e) {
            System.out.println("Error in selectById(): " + e.getMessage());
        } finally {
            // Close the database connection
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    // Handle exception during connection close (optional)
                }
            }
        }
        return academic;  // Return the Academic object or null if not found
    }

    // Update academic record
    public String updateAcademic(Academic academic) {
        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;
        String query = "UPDATE academic SET student_id=?, cap_round=?, merit_no=?, percent_10=?, percent_12=?, percent_diploma=?, "
                + "year_of_admission=?, admission_type=?, enrollment_no=?, d1_d2=?, application_type=?, seat_type=?, university=?, extance_exam=?, "
                + "eligibility_percent=?, fees_paid=?, all_semester_mark=?, roll_no=?, blocking=?, re_exam=?, re_exam_attemp=?, re_exam_subject=?, current_semister=?, "
                + "updated=? WHERE id =?";

        try {
            cs = con.prepareCall(query);
            
            // Set the values for the query parameters
            cs.setInt(1, academic.getStudentId());
            cs.setString(2, academic.getCapRound());
            cs.setString(3, academic.getMeritNo());
            cs.setString(4, academic.getPercent10());
            cs.setString(5, academic.getPercent12());
            cs.setString(6, academic.getPercentDiploma());
            cs.setString(7, academic.getYearOfAdmission());
            cs.setString(8, academic.getAdmissionType());
            cs.setString(9, academic.getEnrollmentNo());
            cs.setString(10, academic.getD1D2());
            cs.setString(11, academic.getApplicationType());
            cs.setString(12, academic.getSeatType());
            cs.setString(13, academic.getUniversity());
            cs.setString(14, academic.getExtanceExam());
            cs.setString(15, academic.getEligibilityPercent());
            cs.setString(16, academic.getFeesPaid());
            cs.setString(17, academic.getAllSemesterMark());
            cs.setInt(18, academic.getRollNo());
            cs.setString(19, academic.getBlocking());
            cs.setString(20, academic.getReExam());
            cs.setInt(21, academic.getReExamAttempt());
            cs.setString(22, academic.getReExamSubject());
            cs.setString(23, academic.getCurrentSemester());
            cs.setString(24, academic.getUpdated());
            cs.setInt(25, academic.getId());  // Set the ID of the record to update

            int rows = cs.executeUpdate();  // Execute the update query
            if (rows >= 1) {
                message = "Academic record updated successfully.";
            }
        } catch (Exception e) {
            message = "Unable to update record because: " + e.getMessage();
        } finally {
            if (con != null) {
                try {
                    con.close();  // Close the connection
                } catch (SQLException ex) {
                    // Handle exception during connection close (optional)
                }
            }
        }
        return message;  // Return success or error message
    }
}
