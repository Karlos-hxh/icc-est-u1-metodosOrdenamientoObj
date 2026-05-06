import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = {
            new Person("Juan", 20, new int[]{10,15,20}),
            new Person("Maria", 18, new int[]{15,15,20}),
            new Person("Pedro", 25, new int[]{20,15,20}),
            new Person("Ana", 22, new int[]{20,20,20}),
            new Person("Jorge", 15, new int[]{10,10,20}),
        } ;
        //Imprimimos
        //Instanciamos
        //Ordenamos por edad
        //Imprimimos

        for(Person person : personas){
            System.out.println(person);
        }
        PersonController pController = new PersonController();
        pController.sortPeopleByAge(personas);
        for(Person person: personas){
            System.out.println("------Orden por edad");
            System.out.println(person);
        }

        System.out.println("------Orden por nombre");
        pController.sortPeopleByName(personas);
        for(Person person: personas){
            System.out.println(person);
        }
        System.out.println("------Orden por promedio");
        pController.sortPeopleByAvr(personas);
        for(Person person: personas){
            System.out.println(person);
        }
        
    }
}
