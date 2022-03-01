package entity;

// Hal pertama yang perlu kita lakukan ketika adalah membuat Entity atau representasi datanya.
public class TodoList {

    // todo sebagai representasi data nya
    private String todo;

    // constructor tanpa parameter
    public TodoList() {
    }

    // constructor parameter
    public TodoList(String todo) {
        this.todo = todo;
    }

    // untuk mengambil data
    public String getTodo() {
        return todo;
    }

    // untuk mengubah data
    public void setTodo(String todo) {
        this.todo = todo;
    }
}
