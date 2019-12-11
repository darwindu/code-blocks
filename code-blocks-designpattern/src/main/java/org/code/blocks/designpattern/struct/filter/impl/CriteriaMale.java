package org.code.blocks.designpattern.struct.filter.impl;

import java.util.ArrayList;
import java.util.List;

import org.code.blocks.designpattern.struct.filter.Criteria;
import org.code.blocks.designpattern.struct.filter.Person;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
