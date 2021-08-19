package me.pyc.todo.core.entity;

/**
 * @author pi
 * @date 2021/08/18 23:03:10
 **/
public class ToDoItem {
    private String name;
    private Integer index;
    private Integer statue = 0;

    public ToDoItem(Integer index, String itemName) {
        this.index = index;
        this.name = itemName;
    }

    public String getName() {
        return this.name;
    }

    public Integer getIndex() {
        return index;
    }

    public Boolean done() {
        this.statue = 1;
        return true;
    }

    public Integer getStatue() {
        return this.statue;
    }
}
