package com.salesforce.tests.fs.services.impl;

import com.salesforce.tests.fs.services.IOperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ListContentsImpl implements IOperation {

    private String directoryToList;

    public ListContentsImpl(String directoryToList){
        this.directoryToList = directoryToList;
    }

    @Override
    public void execute() {
        try {
            Files.list(new File(directoryToList).toPath()).forEach(path -> System.out.println(path));
        } catch (IOException e) {
            System.out.println("File directory doesn't exist or can't be listed");
        }
    }
}
