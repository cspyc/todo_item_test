package me.pyc.todo.core.entity;

/**
 * @author pi
 * @date 2021/08/18 23:03:10
 **/
public class ToDoItem {
    private String name;
    private Integer id;

    public ToDoItem(Integer id, String itemName) {
        this.id = id;
        this.name = itemName;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return id;
    }
}
