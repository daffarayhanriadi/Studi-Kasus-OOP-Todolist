package repository;

import entity.TodoList;

// Repository adalah representasi dari resouce nya atau kumpulan dari todolist nya
public interface TodoListRepository {

    // kita import Todolistnya, kemudian balikannya adalah array karena kita ingin mendapatkan semuanya
    TodoList[] getAll(); // dengan nama getAll -> Tidak harus getAll -> karena ini representasi dari kita ingin mendapatkan semua nya.

    void add(TodoList todoList);

    boolean remove(Integer number);

}
