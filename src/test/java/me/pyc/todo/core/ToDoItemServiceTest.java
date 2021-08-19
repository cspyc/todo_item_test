package me.pyc.todo.core;

import me.pyc.todo.core.entity.ToDoItem;
import me.pyc.todo.core.service.ToDoItemService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author pi
 * @date 2021/08/18 22:58:21
 **/
public class ToDoItemServiceTest {

    private static ToDoItemService toDoItemService;

    @BeforeEach
    public void initialObject() {
        toDoItemService = new ToDoItemService();
    }

    @Test
    public void should_return_item_when_add_item() throws Exception {
        ToDoItemService toDoItemService = new ToDoItemService();
        ToDoItem toDoItem = new ToDoItem(1, "haha");
        ToDoItem item = toDoItemService.addToDoItem(toDoItem);
        Assertions.assertEquals(toDoItem.getName(), item.getName());
    }

    @Test
    public void should_return_boolean_result_when_done_item() throws Exception {
        ToDoItem first_thing_todo = new ToDoItem(1, "first_thing_todo");
        toDoItemService.addToDoItem(first_thing_todo);
        Boolean done = toDoItemService.doneToDoItem(1);
        ToDoItem queryResult = toDoItemService.queryItemByIndex(1);
        Assertions.assertEquals(EnumItemStatus.DONE.getCode(),queryResult.getStatue());
    }

    @Test
    public void should_return_todoitem_when_query_item_by_index() throws Exception {
        toDoItemService.addToDoItem(new ToDoItem(1, "haha"));
        ToDoItem item = toDoItemService.queryItemByIndex(1);
        Assertions.assertEquals(1,item.getIndex());
    }

    @Test
    public void should_return_result_of_item_status() throws Exception {
        ToDoItem test = new ToDoItem(0, "test");
        Integer itemDoneStatus = EnumItemStatus.DONE.getCode();
        test.done();
        Integer testStatus = test.getStatue();
        Assertions.assertEquals(itemDoneStatus, testStatus);
    }
}
