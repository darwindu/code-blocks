package org.code.blocks.designpattern.action.observer;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
            + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
