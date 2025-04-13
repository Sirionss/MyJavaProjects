
public class l2 {
    

    public static void main(String[] args) {
        //int x;    // Объявление переменной    
        //x = 10;   // Присвоение переменной
        int x = 10; // Объявление и инициализация переменной
        System.out.println(x);
        //// Объявление нескольких переменных
        //int y, z;
        //y = 10;
        //z = 25;
        int y = 10, z = 10; 
        System.out.println(y);
        System.out.println(z);
        // Изменение переменной
        int w = 10;
        System.out.println(w);
        w = 25;
        System.out.println(w);
        // Автоопределение переменной
        var e = 10; 
        System.out.println(e);
        // Константы. Впервые присвоенное значение нельзя изменить
        final int LIMIT = 5;
        System.out.println(LIMIT);
    }
}
