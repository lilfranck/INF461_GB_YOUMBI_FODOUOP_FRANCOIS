package singleton1;

public class TestSingleton{

    public static void main(String[] args){
        int som=Singleton.getInstance().somme(2,5);
        int x=8, y=3;
        System.out.println("la somme est : " +som);

        Singleton s1 = Singleton.getInstance(x,y);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(16,19);
        s2.affiche();
    }
}