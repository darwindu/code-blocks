package org.code.blocks.designpattern.struct.filter.impl;

import java.util.List;

import org.code.blocks.designpattern.struct.filter.Criteria;
import org.code.blocks.designpattern.struct.filter.Person;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
