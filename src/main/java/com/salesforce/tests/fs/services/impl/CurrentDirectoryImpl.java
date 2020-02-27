package com.salesforce.tests.fs.services.impl;

import com.salesforce.tests.fs.services.IOperation;

import java.io.File;
import java.io.IOException;

public class CurrentDirectoryImpl implements IOperation {


    @Override
    public void execute() {
        String current = null;
        try {
            current = new File(".").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Current directory: " + current);
    }
}
