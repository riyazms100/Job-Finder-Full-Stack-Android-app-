package com.example.studystint;

import android.widget.Filterable;
import android.widget.Filter;
import java.util.List;
import java.util.ArrayList;

public class DataClass{

    private String name;
    private String jobposting;

    private String compensation;

    private String workdetails;

    private String contact;


    public String getName() {
        return name;
    }

    public String getJobposting() {
        return jobposting;
    }

    public String getCompensation() {
        return compensation;
    }

    public String getWorkdetails() {
        return workdetails;
    }

    public String getContact() {
        return contact;
    }


    public DataClass(String name, String jobposting, String workdetails, String compensation, String contact) {
        this.name = name;
        this.jobposting = jobposting;
        this.compensation = compensation;
        this.workdetails = workdetails;
        this.contact = contact;

    }




    public DataClass() {
        // Empty constructor required for Firebase
    }
}


