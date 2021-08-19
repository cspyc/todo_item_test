package me.pyc.todo.core.repository;

import me.pyc.todo.core.entity.ToDoItem;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pi
 * @date 2021/08/18 23:13:58
 **/
public class ToDoItemRepository {
    private static Map<Integer, ToDoItem> toDoItemRepository = new HashMap<Integer, ToDoItem>();

    public ToDoItem addToDoItem(ToDoItem item) {
        if (item != null && null != item.getIndex()) {
            toDoItemRepository.put(item.getIndex(), item);
        }
        return item;
    }

    public ToDoItem queryItemByIndex(Integer index) {
        return toDoItemRepository.get(index);
    }
}