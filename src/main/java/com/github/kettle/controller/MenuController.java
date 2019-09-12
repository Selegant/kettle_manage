package com.github.kettle.controller;

import com.github.kettle.model.Menu;
import com.github.kettle.model.Menu.ChildrenBean.MetaBeanX;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author WangTao
 * @CreateTime 2019-09-10 09:36
 */
@RestController
@RequestMapping("menu")
public class MenuController {


    @GetMapping("list")
    public List<Menu> getList(String userId){
        List<Menu> list = new ArrayList<>();
        Menu.ChildrenBean childrenBean = new Menu.ChildrenBean();
        childrenBean.setIcon("");
        childrenBean.setName("test_page");
        childrenBean.setPath("test_page");
        childrenBean.setMeta(new MetaBeanX().setTitle("测试页面").setIcon("md-funnel"));
        List<Menu.ChildrenBean> childList = new ArrayList<>();
        childList.add(childrenBean);
        Menu one = new Menu()
                .setPath("")
                .setIcon("md-funnel")
                .setName("测试").setMeta(new Menu.MetaBean().setTitle("测试页面").setIcon("md-funnel"))
                .setChildren(childList);
        list.add(one);
        return list;
    }

}
