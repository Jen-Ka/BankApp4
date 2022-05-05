package staff;


public class Administrator extends Personal implements InterfacePersonal{

    public Administrator(String name, String position) {
        super(name, position);
    }

    public void getTalon() {//получить у Администратора талоны к консультанту и менеджеру
        System.out.println("Вот ваши талоны, ожидайте своей очереди, следите за табло!");
    }

}



