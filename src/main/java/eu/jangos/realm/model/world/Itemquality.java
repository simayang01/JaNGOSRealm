package eu.jangos.realm.model.world;
// Generated 27-f�vr.-2016 16:07:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Itemquality generated by hbm2java
 */
public class Itemquality  implements java.io.Serializable {


     private byte id;
     private String quality;
     private Set items = new HashSet(0);

    public Itemquality() {
    }

	
    public Itemquality(byte id, String quality) {
        this.id = id;
        this.quality = quality;
    }
    public Itemquality(byte id, String quality, Set items) {
       this.id = id;
       this.quality = quality;
       this.items = items;
    }
   
    public byte getId() {
        return this.id;
    }
    
    public void setId(byte id) {
        this.id = id;
    }
    public String getQuality() {
        return this.quality;
    }
    
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }




}


