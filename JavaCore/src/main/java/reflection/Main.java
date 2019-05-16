package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 *
 * Возвращают приватные и protected:
 * getDeclaredField
 * getDeclaredMethod
 * getDeclaredConstructor
 *
 * Возвращают только public:
 * getField
 * getMethod
 * getConstructor
 *
 */
public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {

        Person person = new Person();

        // Получаем значение поля у объекта person
        Field field = person.getClass().getDeclaredField("name");
        field.setAccessible(true);
        String name = (String) field.get(person);
        System.out.println(name);


        // Вызываем метод printData у объекта person
        Method method = person.getClass().getDeclaredMethod("printData");
        method.setAccessible(true);
        method.invoke(person);


        // Сетаем значение поля у объекта person
        Field field2 = person.getClass().getDeclaredField("name");
        field2.setAccessible(true);
        field2.set(person, "new value");
        String name2 = (String) field2.get(person);
        System.out.println(name2);


        // Создаем экземпляр класса Person
        Class clazz = Class.forName(Person.class.getName());
        person = (Person) clazz.newInstance();


        // Создаем экземпляр класса Person c параметрами
        Class clazz2 = Class.forName(Person.class.getName());
        Class[] params = {String.class, int.class };
        Constructor construct = clazz2.getDeclaredConstructor(params);
        construct.setAccessible(true);
        person = (Person) construct.newInstance("default2", 25);


        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
    }
}
