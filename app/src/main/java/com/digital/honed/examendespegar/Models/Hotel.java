package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hotel {

    @SerializedName("industries")
    public List<String> industries;

    @SerializedName("company_name")
    public String company_name;

    @SerializedName("start_year")
    public String start_year;

    @SerializedName("end_year")
    public String end_year;

    @SerializedName("job_title_name")
    public String job_title_name;

    public int getIndustry_id() {
        return industries.size();
    }

    /*public void setIndustry_id(int industry_id) {
        this.industry_id = industry_id;
    }*/

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getStart_year() {
        return start_year;
    }

    public void setStart_year(String start_year) {
        this.start_year = start_year;
    }

    public String getEnd_year() {
        return end_year;
    }

    public void setEnd_year(String end_year) {
        this.end_year = end_year;
    }

    public String getJob_title_name() {
        return job_title_name;
    }

    public void setJob_title_name(String job_title_name) {
        this.job_title_name = job_title_name;
    }

    public List<String> getIndustriesName() {
        return this.industries;
    }
}
