package org.code.blocks.common.util;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.protocol.base.Menu;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author darwindu
 * @date 2019/4/1
 **/
@Slf4j
public class ListUtilTest {

    @Test
    public void testJsonStrToObj1() {

        List<Menu> list = this.buildListMenu();
        log.info("list: {}", JsonUtils.objToJson(list));
        ListUtils.sort(list, true, "id");
        ListUtils.sort(list, true, "typeLevel");
        log.info("list: {}", JsonUtils.objToJson(list));
        list.forEach(menu -> System.out.println(menu.getId()));
        Assert.assertNotNull(list);
    }


    private List<Menu> buildListMenu() {

        List<Menu> list = new ArrayList<>();
        Menu menu = new Menu();
        menu.setId(1010);
        menu.setMenuName("一级菜单1");
        menu.setParentId(0);
        menu.setSort(1010);
        menu.setTypeLevel(1);
        list.add(menu);

        menu = new Menu();
        menu.setId(1012);
        menu.setMenuName("二级菜单2");
        menu.setParentId(1010);
        menu.setSort(1012);
        menu.setTypeLevel(2);
        list.add(menu);

        menu = new Menu();
        menu.setId(1011);
        menu.setMenuName("二级菜单1");
        menu.setParentId(1010);
        menu.setSort(1011);
        menu.setTypeLevel(2);
        list.add(menu);

        menu = new Menu();
        menu.setId(1013);
        menu.setMenuName("二级菜单3");
        menu.setParentId(1010);
        menu.setSort(1013);
        menu.setTypeLevel(2);
        list.add(menu);


        menu = new Menu();
        menu.setId(1110);
        menu.setMenuName("一级菜单2");
        menu.setParentId(0);
        menu.setSort(1010);
        menu.setTypeLevel(1);
        list.add(menu);

        menu = new Menu();
        menu.setId(1111);
        menu.setMenuName("二级菜单1");
        menu.setParentId(1110);
        menu.setSort(1111);
        menu.setTypeLevel(2);
        list.add(menu);

        menu = new Menu();
        menu.setId(1112);
        menu.setMenuName("二级菜单2");
        menu.setParentId(1110);
        menu.setSort(1112);
        menu.setTypeLevel(2);
        list.add(menu);

        menu = new Menu();
        menu.setId(1210);
        menu.setMenuName("一级菜单3");
        menu.setParentId(0);
        menu.setSort(1010);
        menu.setTypeLevel(1);
        list.add(menu);

        menu = new Menu();
        menu.setId(1211);
        menu.setMenuName("二级菜单1");
        menu.setParentId(1210);
        menu.setSort(1211);
        menu.setTypeLevel(2);
        list.add(menu);
        return list;
    }
}
