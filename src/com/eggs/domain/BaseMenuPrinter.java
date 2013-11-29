package com.eggs.domain;

public abstract class BaseMenuPrinter implements MenuPrinter {

    protected MenuRepository menuRepository;

    public BaseMenuPrinter(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.eggs.MenuPrinter#printMenus()
     */
    public void printMenus() {
        for (Menu menu : menuRepository.getMenus()) {
            printSingleMenu(menu);
        }
    }

    protected abstract void printSingleMenu(Menu menu);
}
