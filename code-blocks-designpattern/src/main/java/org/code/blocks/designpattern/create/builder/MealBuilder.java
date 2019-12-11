package org.code.blocks.designpattern.create.builder;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * @author darwindu
 * @date 2019/12/9
 **/
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
