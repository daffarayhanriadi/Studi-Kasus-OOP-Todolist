package service;

public interface TodoListService {

    // disini tidak perlu mengembalikan data karena kita hanya ingin menampilkan saja
    void showTodoList();

    void addTodoList(String todo);

    void removeTodolist(Integer number);
}
