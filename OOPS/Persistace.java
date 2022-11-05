package OOPS;

abstract class Persistnce {
    abstract void persist();
}
class Filepersistnce extends Persistance{
    void persist()
    {
        System.out.println("data is stored in files");
    }
}
class DatabasePersistnce extends Persistance{
    void persist()
    {
        System.out.println("Data is stored in Database");
    }
}
class Datas {
    public static void main(String args[]) {
        Filepersistence f = new Filepersistence();
        DatabasePersistence d = new DatabasePersistence();
        f.persist();
        d.persist();
    }
}
