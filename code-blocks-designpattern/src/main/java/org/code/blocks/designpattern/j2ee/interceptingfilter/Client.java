package org.code.blocks.designpattern.j2ee.interceptingfilter;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
