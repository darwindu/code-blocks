package org.code.blocks.designpattern.action.memento;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
