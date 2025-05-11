/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qt.apn_portal.modal;

/**
 *
 * @author QaswaTech_1
 */
public class Academic {
    private int id;
    private int studentId;
    private String capRound;
    private String meritNo;
    private String percent10;
    private String percent12;
    private String percentDiploma;
    private String yearOfAdmission;
    private String admissionType;
    private String enrollmentNo;
    private String d1D2;
    private String applicationType;
    private String seatType;
    private String university;
    private String extanceExam;
    private String eligibilityPercent;
    private String feesPaid;
    private String allSemesterMark;
    private int rollNo;
    private String blocking;
    private String reExam;
    private int reExamAttempt;
    private String reExamSubject;
    private String currentSemester;
    private String created;  // Changed to String
    private String updated;  // Changed to String

    // Default constructor
    public Academic() {
    }

    // Constructor with all fields
    public Academic(int id, int studentId, String capRound, String meritNo, String percent10, String percent12,
                    String percentDiploma, String yearOfAdmission, String admissionType, String enrollmentNo,
                    String d1D2, String applicationType, String seatType, String university, String extanceExam,
                    String eligibilityPercent, String feesPaid, String allSemesterMark, int rollNo, String blocking,
                    String reExam, int reExamAttempt, String reExamSubject, String currentSemester, String created, 
                    String updated) {
        this.id = id;
        this.studentId = studentId;
        this.capRound = capRound;
        this.meritNo = meritNo;
        this.percent10 = percent10;
        this.percent12 = percent12;
        this.percentDiploma = percentDiploma;
        this.yearOfAdmission = yearOfAdmission;
        this.admissionType = admissionType;
        this.enrollmentNo = enrollmentNo;
        this.d1D2 = d1D2;
        this.applicationType = applicationType;
        this.seatType = seatType;
        this.university = university;
        this.extanceExam = extanceExam;
        this.eligibilityPercent = eligibilityPercent;
        this.feesPaid = feesPaid;
        this.allSemesterMark = allSemesterMark;
        this.rollNo = rollNo;
        this.blocking = blocking;
        this.reExam = reExam;
        this.reExamAttempt = reExamAttempt;
        this.reExamSubject = reExamSubject;
        this.currentSemester = currentSemester;
        this.created = created;
        this.updated = updated;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCapRound() {
        return capRound;
    }

    public void setCapRound(String capRound) {
        this.capRound = capRound;
    }

    public String getMeritNo() {
        return meritNo;
    }

    public void setMeritNo(String meritNo) {
        this.meritNo = meritNo;
    }

    public String getPercent10() {
        return percent10;
    }

    public void setPercent10(String percent10) {
        this.percent10 = percent10;
    }

    public String getPercent12() {
        return percent12;
    }

    public void setPercent12(String percent12) {
        this.percent12 = percent12;
    }

    public String getPercentDiploma() {
        return percentDiploma;
    }

    public void setPercentDiploma(String percentDiploma) {
        this.percentDiploma = percentDiploma;
    }

    public String getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(String yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public String getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(String enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getD1D2() {
        return d1D2;
    }

    public void setD1D2(String d1D2) {
        this.d1D2 = d1D2;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getExtanceExam() {
        return extanceExam;
    }

    public void setExtanceExam(String extanceExam) {
        this.extanceExam = extanceExam;
    }

    public String getEligibilityPercent() {
        return eligibilityPercent;
    }

    public void setEligibilityPercent(String eligibilityPercent) {
        this.eligibilityPercent = eligibilityPercent;
    }

    public String getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(String feesPaid) {
        this.feesPaid = feesPaid;
    }

    public String getAllSemesterMark() {
        return allSemesterMark;
    }

    public void setAllSemesterMark(String allSemesterMark) {
        this.allSemesterMark = allSemesterMark;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBlocking() {
        return blocking;
    }

    public void setBlocking(String blocking) {
        this.blocking = blocking;
    }

    public String getReExam() {
        return reExam;
    }

    public void setReExam(String reExam) {
        this.reExam = reExam;
    }

    public int getReExamAttempt() {
        return reExamAttempt;
    }

    public void setReExamAttempt(int reExamAttempt) {
        this.reExamAttempt = reExamAttempt;
    }

    public String getReExamSubject() {
        return reExamSubject;
    }

    public void setReExamSubject(String reExamSubject) {
        this.reExamSubject = reExamSubject;
    }

    public String getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(String currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    // Optionally override toString(), equals(), hashCode() as needed
    @Override
    public String toString() {
        return "Academic{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", capRound='" + capRound + '\'' +
                ", meritNo='" + meritNo + '\'' +
                ", percent10='" + percent10 + '\'' +
                ", percent12='" + percent12 + '\'' +
                ", percentDiploma='" + percentDiploma + '\'' +
                ", yearOfAdmission='" + yearOfAdmission + '\'' +
                ", admissionType='" + admissionType + '\'' +
                ", enrollmentNo='" + enrollmentNo + '\'' +
                ", d1D2='" + d1D2 + '\'' +
                ", applicationType='" + applicationType + '\'' +
                ", seatType='" + seatType + '\'' +
                ", university='" + university + '\'' +
                ", extanceExam='" + extanceExam + '\'' +
                ", eligibilityPercent='" + eligibilityPercent + '\'' +
                ", feesPaid='" + feesPaid + '\'' +
                ", allSemesterMark='" + allSemesterMark + '\'' +
                ", rollNo=" + rollNo +
                ", blocking='" + blocking + '\'' +
                ", reExam='" + reExam + '\'' +
                ", reExamAttempt=" + reExamAttempt +
                ", reExamSubject='" + reExamSubject + '\'' +
                ", currentSemester='" + currentSemester + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }
}
