package com.salesforce.tests.fs.services.impl;

import com.salesforce.tests.fs.services.IOperation;

public class UnrecognizedCommand implements IOperation {

    private String unrecognizedCommand;

    public UnrecognizedCommand (String unrecognizedCommand){
        this.unrecognizedCommand = unrecognizedCommand;
    }

    @Override
    public void execute() {
        System.out.println("Unrecognized command: " + this.unrecognizedCommand);
    }
}
