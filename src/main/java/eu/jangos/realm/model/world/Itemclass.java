package eu.jangos.realm.model.world;
// Generated 27-f�vr.-2016 16:07:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Itemclass generated by hbm2java
 */
public class Itemclass  implements java.io.Serializable {


     private byte id;
     private String itemclass;
     private Set itemsubclasses = new HashSet(0);

    public Itemclass() {
    }

	
    public Itemclass(byte id) {
        this.id = id;
    }
    public Itemclass(byte id, String itemclass, Set itemsubclasses) {
       this.id = id;
       this.itemclass = itemclass;
       this.itemsubclasses = itemsubclasses;
    }
   
    public byte getId() {
        return this.id;
    }
    
    public void setId(byte id) {
        this.id = id;
    }
    public String getItemclass() {
        return this.itemclass;
    }
    
    public void setItemclass(String itemclass) {
        this.itemclass = itemclass;
    }
    public Set getItemsubclasses() {
        return this.itemsubclasses;
    }
    
    public void setItemsubclasses(Set itemsubclasses) {
        this.itemsubclasses = itemsubclasses;
    }




}


