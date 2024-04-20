package DesignPatterns;

import javax.xml.crypto.Data;

public class Singleton {

    private static Singleton instance;


    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }

        return instance;
    }




    
}


class Main{
    public static void main(String[] args) {
        
        Singleton singleton=Singleton.getInstance();

        System.out.println(singleton);

        
        DataSource dataSource=DataSource.getInstance();
        
        DataSource dataSource2=DataSource.getInstance();
        
        System.out.println(DataSource.instance);

        System.out.println(dataSource);

        System.out.println(dataSource2);

    }
}


class DataSource{


    public static DataSource instance;
    private String url;
    private String username;
    private String password;

    private DataSource(String url,String username,String password){
        this.url=url;
        this.username=username;
        this.password=password;
    }

    public static DataSource getInstance(){
        if(instance==null){
            instance=new DataSource("http:localhost:8080", "harish", "kumar");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "DataSource [url=" + url + ", username=" + username + ", password=" + password + "]";
    }

    



}