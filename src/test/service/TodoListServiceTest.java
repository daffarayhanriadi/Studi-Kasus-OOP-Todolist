package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Belajar Java Basic");
        todoListRepository.data[1] = new TodoList("Belajar Java OOP");
        todoListRepository.data[2] = new TodoList("Belajar Java Standard Classes");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();

        todoListService.removeTodolist(5);
        todoListService.removeTodolist(2);
        todoListService.showTodoList();
        todoListService.removeTodolist(2);
        todoListService.showTodoList();
        todoListService.removeTodolist(2);
        todoListService.showTodoList();
        todoListService.removeTodolist(1);
        todoListService.showTodoList();

    }

}
