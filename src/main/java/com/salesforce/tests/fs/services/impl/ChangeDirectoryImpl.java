package com.salesforce.tests.fs.services.impl;

import com.salesforce.tests.fs.services.IOperation;
import org.omg.CORBA.Current;

import java.io.File;
import java.io.IOException;

public class ChangeDirectoryImpl implements IOperation {

    private String destinyDirectory;

    public ChangeDirectoryImpl(String destinyDirectory){
        this.destinyDirectory = destinyDirectory;
    }

    @Override
    public void execute() {
        String current = null;
        try {
            current = new File(this.destinyDirectory).getCanonicalPath();
        } catch (IOException e) {
            System.out.println("Destiny folder does not exist");
        }
        System.out.println("Moved to directory: " + current);


    }
}
