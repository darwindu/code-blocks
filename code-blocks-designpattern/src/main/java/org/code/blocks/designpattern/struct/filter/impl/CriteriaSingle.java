package org.code.blocks.designpattern.struct.filter.impl;

import java.util.ArrayList;
import java.util.List;

import org.code.blocks.designpattern.struct.filter.Criteria;
import org.code.blocks.designpattern.struct.filter.Person;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
