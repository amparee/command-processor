package com.salesforce.tests.fs.services.impl;

import com.salesforce.tests.fs.services.IOperation;

public class MakeDirectoryImpl implements IOperation {

    private String directoryToCreate;

    public MakeDirectoryImpl (String directoryToCreate) {
        this.directoryToCreate = directoryToCreate;
    }


    @Override
    public void execute() {

    }
}
