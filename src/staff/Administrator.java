package staff;

public class Administrator extends Personal {

    public Administrator(String name, String position) {
        super(name, position);
    }

    public Administrator getTalon() {//получить у Администратора талоны к консультанту и менеджеру
        return null;
    }

    static { //static добавлен по требованию компилятора (говорит, Warning:(12, 6) Class initializer may be 'static')
        System.out.println("Вот ваши талоны, ожидайте своей очереди, следите за табло!");
    }
}



