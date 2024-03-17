package com.example.studystint;

public class hrhelper {

    String companyname, jobposting, workdetails, compensation, contact;

    public hrhelper() {

    }

    public hrhelper(String companyname, String jobposting, String workdetails, String compensation, String contact) {
        this.companyname = companyname;
        this.jobposting = jobposting;
        this.workdetails = workdetails;
        this.compensation = compensation;
        this.contact = contact;
    }

    public String getName() {
        return companyname;
    }

    public void setName(String companyname) {
        this.companyname = companyname;
    }

    public String getJobposting() {
        return jobposting;
    }

    public void setJobposting(String jopposting) {
        this.jobposting = jobposting;
    }

    public String getWorkdetails() {
        return workdetails;
    }

    public void setWorkdetails(String workdetails) {
        this.workdetails = workdetails;
    }

    public String getCompensation() {
        return compensation;
    }

    public void setCompensation(String compensation) {
        this.compensation = compensation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = compensation;
    }


}

