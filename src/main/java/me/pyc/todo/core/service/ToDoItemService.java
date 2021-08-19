package me.pyc.todo.core.service;

import me.pyc.todo.core.entity.ToDoItem;
import me.pyc.todo.core.repository.ToDoItemRepository;

/**
 * @author pi
 * @date 2021/08/18 23:00:11
 **/
public class ToDoItemService {

    private ToDoItemRepository repository;

    public ToDoItemService() {
        this.repository = new ToDoItemRepository();
    }

    public ToDoItem addToDoItem(ToDoItem toDoItem) {
        ToDoItem result = repository.addToDoItem(toDoItem);
        return result;
    }

    public ToDoItem queryItemByIndex(Integer index) {
        ToDoItem item = repository.queryItemByIndex(index);
        return item;
    }

    public Boolean doneToDoItem(Integer index) {
        try {
            ToDoItem item = repository.queryItemByIndex(index);
            item.done();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
