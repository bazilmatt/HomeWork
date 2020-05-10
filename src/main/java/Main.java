import java.util.NoSuchElementException;

/**
 * Класс описывающий логику создания и взаимодействия с картотекой
 */
public class Main {
        public static Blank blank = new Blank();

        public static void main(String[] args) {
                Pet pet1 = new Pet("Bobi1",10.2);
                Pet pet2 = new Pet("Barsik1",5.3);
                Pet pet3 = new Pet("Kira", 30.1);
                Person person1 = new Person();
                Person person2 = new Person("Vasya",27,"Male");
                blank.addPet(pet1);
                blank.addPet(pet2);
                blank.addPet(pet3);
                pet2.setOwner(person1);
                System.out.println(blank.toString());

                try {
                        System.out.println("Id этого животного = "+blank.searchName("Kira"));
                } catch (NoSuchElementException e){
                        System.out.println("Животного с такой кличкой нет");
                }

                blank.editOwner(2,person2);
                System.out.println(blank.getPet(2));

                try{ //Todo - вынести поиск животного в отдельный метод
                        blank.searchName("NET TAKOGO IMENI");
                } catch (NoSuchElementException e){
                        System.out.println("Нет животного с такой кличной");
                }
        }



}
