package com.salesforce.tests.fs.factory;

import com.salesforce.tests.fs.services.IOperation;
import com.salesforce.tests.fs.services.impl.*;

public class CommandFactory {

    public IOperation getCommand(String command, String arg){
        IOperation operation;

        switch(command.toLowerCase()){
            case "cd":
                operation = new ChangeDirectoryImpl(arg);
            case "mkdir":
                operation = new MakeDirectoryImpl(arg);
            case "quit":
                operation = new QuitImpl();
            case "pwd":
                operation = new CurrentDirectoryImpl();
            case "ls":
                operation = new ListContentsImpl(arg);
            case "touch":
                operation = new CreateFileImpl(arg);
            case "":
            default:
                operation = new UnrecognizedCommand(arg);
        }

        return operation;
    }
}
