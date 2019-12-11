package org.code.blocks.designpattern.action.chain;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
