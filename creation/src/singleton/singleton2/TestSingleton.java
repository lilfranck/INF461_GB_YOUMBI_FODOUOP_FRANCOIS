package singleton2;

public class TestSingleton{

    public static void main(String[] args){
        int som=Singleton.getInstance().somme(2,5,6);
        int x=8, y=3, z=2;
        System.out.println("la somme est : " +som);

        Singleton s1 = Singleton.getInstance(x,y,z);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(16,19);
        s2.affiche();
    }
}
