package OOPS;

abstract class Persistance {
    abstract void persist();

}
class Filepersistence extends Persistance {
    void persist()
    {
        System.out.println("data is stored in files");
    }
}
class DatabasePersistence extends Persistance {
    void persist()
    {
        System.out.println("Data is stored in Database");
    }
}
class Data
{
    public static void main(String args[])
    {
        Filepersistence f=new Filepersistence();
        DatabasePersistence d=new DatabasePersistence();
        f.persist();
        d.persist();
    }
}