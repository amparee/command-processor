package com.salesforce.tests.fs.invoker;

import com.salesforce.tests.fs.services.IOperation;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<IOperation> operations = new ArrayList();

    public void receiveOperation(IOperation operation){
        this.operations.add(operation);
    }

    public void doOperations(){
        this.operations.forEach( o -> o.execute());
        this.operations.clear();
    }

}
