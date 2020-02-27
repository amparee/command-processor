package com.salesforce.tests.fs.services.impl;

import com.salesforce.tests.fs.services.IOperation;

public class QuitImpl implements IOperation {

    @Override
    public void execute() {
        System.out.println("Executing quit");
        System.exit(1);
    }
}
