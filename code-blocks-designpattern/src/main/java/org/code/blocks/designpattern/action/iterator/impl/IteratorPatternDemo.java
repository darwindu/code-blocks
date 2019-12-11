package org.code.blocks.designpattern.action.iterator.impl;

import org.code.blocks.designpattern.action.iterator.Iterator;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
