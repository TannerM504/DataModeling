// TSQLx.java
public class TSQLx{
  public static void main(String [] args){
    
  }
  
  public static void createDatabase(String dataBaseName){
    File dataBaseName = new File();
    if(dataBaseName.exists(){
      System.out.println("Please stoperino before you make a duplicate filerino");
    }else dataBaseName.createNewFile();
  }

  public static void dropDatabase(String dataBaseName){
    if(dataBaseName.exists(){
        dataBaseName.delete();
        System.out.println(dataBaseName + " has been deleted");
    }else System.out.println("That doesn't exist my guy");    
  }

  public static void saveDatabase(String dataBaseName){
    
  }

  public static void loadDatabase(String dataBaseName){
    
  }

  public static void createTable(){
    
  }
}
