import java.util.Objects;

/**
 * Класс описывающий животное
 */
public class Pet {
    private Integer id; //идентификационный номер. т.к. животных в картотеке будет не сильно много - ограничимся целым числом
    private String petName; //ккличка
    private Person owner; //владелец класса Person
    private double veight; //вес животного


    public Pet(String petName,double veight){
        setPetName(petName);
        setVeight(veight);
    }

    public Pet(String petName){
        setPetName(petName);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public double getVeight() {
        return veight;
    }

    public void setVeight(double veight) {
        this.veight = veight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Double.compare(pet.veight, veight) == 0 &&
                petName.compareTo(pet.petName)==0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(petName);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petName='" + petName + '\'' +
                ", owner=" + owner +
                ", veight=" + veight +
                '}';
    }
}
