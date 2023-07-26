public class Main {

    public static void main(String[] args) {
        Family family = new Family();

        Human human = new Human("Иван","Наташа","Ирина","Сергей");
        Human human1 = new Human("Борис","Света","Маша","Петр");
        family.addHuman(human);
        family.addHuman(human1);


        System.out.println(family.getHumanList());
    }
}
