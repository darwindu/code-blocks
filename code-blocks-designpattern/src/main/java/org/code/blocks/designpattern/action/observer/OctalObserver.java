package org.code.blocks.designpattern.action.observer;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
            + Integer.toOctalString( subject.getState() ) );
    }
}
