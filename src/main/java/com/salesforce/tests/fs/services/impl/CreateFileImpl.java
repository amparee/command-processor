package com.salesforce.tests.fs.services.impl;

import com.salesforce.tests.fs.services.IOperation;

import java.io.File;
import java.io.IOException;

public class CreateFileImpl implements IOperation {

    private String newFileName;

    public CreateFileImpl(String newFileName) {
        this.newFileName = newFileName;
    }

    @Override
    public void execute() {
        File file = new File(this.newFileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("File can't be created");
        }
        System.out.println("Creating file: " + file.getName());
    }
}
