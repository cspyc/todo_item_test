package me.pyc.todo.core;

import me.pyc.todo.core.entity.ToDoItem;
import me.pyc.todo.core.service.ToDoItemService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author pi
 * @date 2021/08/18 22:58:21
 **/
public class ToDoItemServiceTest {
    @Test
    public void should_return_item_when_add_item() throws Exception {
        ToDoItemService toDoItemService = new ToDoItemService();
        ToDoItem toDoItem = new ToDoItem(1, "haha");
        ToDoItem item = toDoItemService.addToDoItem(toDoItem);
        Assertions.assertEquals(toDoItem.getName(), item.getName());
    }
}
