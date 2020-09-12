package com.vahe.back;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements Iterable<String> {

    private List<String> list = new ArrayList<>();

    public Menu() {

    }

    public void add(String item) {
        this.list.add(item);
    }


    @Override
    public Iterator<String> iterator() {
        return new MenuIterator(this);
    }

    public  class MenuIterator implements Iterator<String> {

        private int index = 0;
        private Menu menu;

        public MenuIterator(Menu menu) {
            this.menu = menu;
        }

        @Override
        public boolean hasNext() {
            return this.index <= menu.list.size() - 1;
        }

        @Override
        public String next() {
            String element = menu.list.get(this.index);
            this.index++;
            return element;

        }
    }
}
