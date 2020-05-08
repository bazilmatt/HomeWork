import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * Класс картотеки - содержит коллекцию данных - показывающих всех животных и их владельцев.
 * Позволяет искать животных по их кличке
 * изменять данные животного по его id
 * исключает добавление дубликатов животного
 * сортирует животных - хозяин, кличка, вес.
 */

public class Blank {

    public HashMap<Integer,Pet> cardMap = new HashMap<Integer, Pet>();


    public void addPet(Pet pet) {
        pet.setId(cardMap.size());
        cardMap.put(pet.getId(), pet);
    }

    public Pet getPet(Integer id){
        return cardMap.get(id);
    }

    public int getSize(){
        return cardMap.size();
    }

    @Override
    public String toString() {
        Pet curPet = null;
        String rez = "";
        for (Integer key : cardMap.keySet()) {
            curPet = cardMap.get(key);
            rez += ("Id = " + curPet.getId() +
                    "|| Кличка = " + curPet.getPetName() +
                    "|| Хозяин = " + curPet.getOwner()) +'\n';

        }
        return rez;
    }

  //  public void editPetName(Integer id, String newName){
  //      cardMap.get(id).setPetName(newName);
  //  }

    public void editPetVeight(Integer id, double veight){
        cardMap.get(id).setVeight(veight);
    }

    public void editOwner(Integer id, Person newOwner){
        cardMap.get(id).setOwner(newOwner);
    }

    public Integer searchName(String name) throws NoSuchElementException{
        String curName="";
        for (Integer key : cardMap.keySet()) {
            curName =cardMap.get(key).getPetName();
            if (curName.equals(name)){
               return (cardMap.get(key).getId());
            } else {
                continue;
            }
        }
        throw new NoSuchElementException();
    }



}
