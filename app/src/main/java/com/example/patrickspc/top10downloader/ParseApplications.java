package com.example.patrickspc.top10downloader;

import java.util.ArrayList;

/**
 * Created by Patricks PC on 10/28/2017.
 */

public class ParseApplications {

    private String xmlData;
    private ArrayList<Application> applications;

    public ParseApplications(String xmlData) {
        this.xmlData = xmlData;
        applications = new ArrayList<>();
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }
}

