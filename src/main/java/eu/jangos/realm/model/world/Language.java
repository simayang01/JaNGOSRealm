package eu.jangos.realm.model.world;




/**
 * Language generated by hbm2java
 */
public class Language  implements java.io.Serializable {


     private int id;
     private String language;

    public Language() {
    }

	
    public Language(int id) {
        this.id = id;
    }
    public Language(int id, String language) {
       this.id = id;
       this.language = language;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }




}


