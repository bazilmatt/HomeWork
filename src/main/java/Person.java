import java.util.Random;

/**
 *
 * Класс описывающий человека - хозяина животного
 * */
public class Person implements Comparable<Person>{

    String name; //имя
    Integer age; //возраст
    String gender; //пол
    Random rnd = new Random();

    public Person(String name,Integer age, String gender){
        setAge(age);
        setGender(gender);
        setName(name);
    }
    public Person(){
        setAge(rnd.nextInt(100));
        setGender("Male");
        setName("Name"+rnd.nextInt(1000));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int compareTo(Person o) {
        if (o.name.compareTo(this.name)>0){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return  "Имя = '" + name + '\'' +
                ", Возраст = " + age +
                ", пол = " + gender + '\'';
    }
}
