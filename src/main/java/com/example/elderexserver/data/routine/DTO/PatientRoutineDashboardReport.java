package com.example.elderexserver.data.routine.DTO;

public class PatientRoutineDashboardReport {
    private Integer patient_id;
    private String first_name;
    private String last_name;
    private Integer age;
    private Integer gender;
    private String period_start;
    private String period_end;
    private Integer total_reps;
    private Integer rep_goal;
    private Float percentage_done;

    public PatientRoutineDashboardReport(Integer patient_id, String first_name, String last_name, Integer age, Integer gender, String period_start, String period_end, Integer total_reps, Integer rep_goal, Float percentage_done) {
        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.period_start = period_start;
        this.period_end = period_end;
        this.total_reps = total_reps;
        this.rep_goal = rep_goal;
        this.percentage_done = percentage_done;
    }

    public Integer getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Integer patient_id) {
        this.patient_id = patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPeriod_start() {
        return period_start;
    }

    public void setPeriod_start(String period_start) {
        this.period_start = period_start;
    }

    public String getPeriod_end() {
        return period_end;
    }

    public void setPeriod_end(String period_end) {
        this.period_end = period_end;
    }

    public Integer getTotal_reps() {
        return total_reps;
    }

    public void setTotal_reps(Integer total_reps) {
        this.total_reps = total_reps;
    }

    public Integer getRep_goal() {
        return rep_goal;
    }

    public void setRep_goal(Integer rep_goal) {
        this.rep_goal = rep_goal;
    }

    public Float getPercentage_done() {
        return percentage_done;
    }

    public void setPercentage_done(Float percentage_done) {
        this.percentage_done = percentage_done;
    }
}
