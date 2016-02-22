package eu.jangos.realm.model.world;



import java.util.HashSet;
import java.util.Set;

/**
 * Itemsubclass generated by hbm2java
 */
public class Itemsubclass  implements java.io.Serializable {


     private ItemsubclassId id;
     private Itemclass itemclass;
     private String subclass;
     private Set items = new HashSet(0);

    public Itemsubclass() {
    }

	
    public Itemsubclass(ItemsubclassId id, Itemclass itemclass) {
        this.id = id;
        this.itemclass = itemclass;
    }
    public Itemsubclass(ItemsubclassId id, Itemclass itemclass, String subclass, Set items) {
       this.id = id;
       this.itemclass = itemclass;
       this.subclass = subclass;
       this.items = items;
    }
   
    public ItemsubclassId getId() {
        return this.id;
    }
    
    public void setId(ItemsubclassId id) {
        this.id = id;
    }
    public Itemclass getItemclass() {
        return this.itemclass;
    }
    
    public void setItemclass(Itemclass itemclass) {
        this.itemclass = itemclass;
    }
    public String getSubclass() {
        return this.subclass;
    }
    
    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }




}


