package com.sezeraksoy.console;

public class AboutCommand implements Command {
    @Override
    public void execute() {
        System.out.println("This program developed as a laboratory work for IPP");
        System.out.println("Author : Sezer AKSOY(FAF-151)");
    }
}
