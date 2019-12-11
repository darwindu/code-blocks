package org.code.blocks.designpattern.action.template;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
