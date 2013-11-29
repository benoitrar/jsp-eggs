package com.eggs.domain;

import java.util.ArrayList;
import java.util.List;

public class BaseMenuRepository implements MenuRepository {
    
    private List<Menu> menus = new ArrayList<>();

    public BaseMenuRepository() {
        menus.add(new MenuBuilder("Karcsi buffet").food("id1", "grilled cat", 1200).build());
        menus.add(new MenuBuilder("Marcsi buffet").food("id2", "grilled dog", 1200).build());
        menus.add(new MenuBuilder("Harcsi buffet").food("id3", "grilled harcs", 1200).build());
    }
    
    public void addMenu(Menu menu) {
        menus.add(menu);
    }
    
    public void removeMenu() {
        // TODO
    }

    @Override
    public List<Menu> getMenus() {
        return menus;
    }

}
