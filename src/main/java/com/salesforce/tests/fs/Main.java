package com.salesforce.tests.fs;

import com.salesforce.tests.fs.factory.CommandFactory;
import com.salesforce.tests.fs.invoker.Invoker;

import java.util.Arrays;
import java.util.List;

/**
 * The entry point for the Test program
 */
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        List<String> arguments = Arrays.asList(args);
        CommandFactory commandFactory = new CommandFactory();


        arguments.stream().forEach( a -> {
            String[] comArgs = a.split(" ");
            String command = comArgs[0];
            String arg = comArgs[1];
            commandFactory.getCommand(command, arg);
        });


        Invoker inv = new Invoker();
        /*inv.receiveOperation(currentDirectory);
        inv.receiveOperation(changeDirectory);
        inv.receiveOperation(createFile);
        inv.receiveOperation(listContents);
        inv.receiveOperation(uc);
        inv.receiveOperation(quit);*/

        inv.doOperations();


    }
}
