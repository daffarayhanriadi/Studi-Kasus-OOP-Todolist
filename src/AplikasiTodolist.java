package daffa.belajarjavabasic.studycasetodolist;

public class AplikasiTodolist {

    public static String[] data = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * Menampilkan todo List
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (int i = 0; i < data.length; i++) {
            String todo = data[i];
            int no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    // TEST SHOW TODOLIST
    public static void testShowTodoList() {
        data[0] = "Belajar Java Dasar";
        data[1] = "Studi Kasus Java Dasar : Aplikasi TodoList";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo){
        // cek apakah data penuh?
        boolean isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                // data masih ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh, kita resize ukuran array 2x lipat
        if (isFull) {
            String[] temp = data;
            data = new String[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data array nya NULL
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todo;
                break;
            }
        }
    }

    // TEST ADD TODOLIST
    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo ke. " + i);
        }

        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number){ // number(2) = 2 + 1 - 1 = 2
        if ((number - 1) >= data.length) {
            return false;
        }

        if (data[number - 1] == null) {
            return false;
        } else {
//            data[number - 1] = null;
//            return true;
            for (int i = number - 1; i < data.length; i++) {
                if (i == (data.length) - 1) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }

    // TEST REMOVE TODOLIST
    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        boolean result = removeTodoList(6);
        System.out.println(result);

        result =removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    // TEST INPUT TODOLIST
    public static void testInput() {
        String name = input("Nama");
        System.out.println("Hi " + name);

        String channel = input("Channel");
        System.out.println(channel);
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){
        while (true) {
            showTodoList();

            System.out.println("MENU");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            String input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    // TEST VIEW SHOW TODOLIST
    public static void testViewShowTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();
    }

    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        String todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")) {
            //batal
        } else {
            addTodoList(todo);
        }
    }

    // TEST VIEW ADD TODOLIST
    public static void testViewAddTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();

        showTodoList();

    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("MENGHAPUS TODOLIST");

        String number = input("Nomor Yang Dihapus (x Jika Batal)");

        if (number.equals("x")) {
            //batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus todolist\t: " + number);
            }
        }
    }

    // TEST VIEW REMOVE TODOLIST
    public static void testViewRemoveTodolist() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
