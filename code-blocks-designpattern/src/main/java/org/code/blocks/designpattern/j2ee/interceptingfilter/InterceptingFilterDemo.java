package org.code.blocks.designpattern.j2ee.interceptingfilter;

import org.code.blocks.designpattern.j2ee.interceptingfilter.impl.AuthenticationFilter;
import org.code.blocks.designpattern.j2ee.interceptingfilter.impl.DebugFilter;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class InterceptingFilterDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
