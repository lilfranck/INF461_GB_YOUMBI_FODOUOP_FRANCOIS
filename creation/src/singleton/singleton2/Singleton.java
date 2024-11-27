package singleton2;

public final class Singleton {
    private static Singleton instance=null;
    public int x;
    public int y;
    public int z;

    private Singleton() {
    super();
    }
    private Singleton(int x2, int y2){
        this.x=x2;
        this.y=y2;
    }
    private Singleton(int x2, int y2, int z2){
        this.x=x2;
        this.y=y2;
        this.z=z2;
    }
    public static Singleton getInstance() {
        if (instance==null) {
        instance = new Singleton();
        }
        return instance;
    }
    
    public static Singleton getInstance(int x, int y) {
        if (instance==null) {
        instance = new Singleton(x,y);
        }
        return instance;
    }
    public static Singleton getInstance(int x, int y, int z) {
        if (instance==null) {
        instance = new Singleton(x,y,z);
        }
        return instance;
    }

    public int somme(int x, int y, int z){
        return x+y+z;
    }

    public float moyenne(int x, int y, int z){
        return somme(x,y,z)/2;
    }

    public void affiche(){
        System.out.println("\n je suis une instance et mes valeurs sont: x= "+this.x+", y = " +this.y+ "et z = " +this.z);

    }

    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}

