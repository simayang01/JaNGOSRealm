package eu.jangos.realm.model.world;
// Generated 06-mai-2016 21:17:32 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ItemsubclassId generated by hbm2java
 */
@Embeddable
public class ItemsubclassId  implements java.io.Serializable {


     private byte fkItemclass;
     private byte id;

    public ItemsubclassId() {
    }

    public ItemsubclassId(byte fkItemclass, byte id) {
       this.fkItemclass = fkItemclass;
       this.id = id;
    }
   


    @Column(name="fk_itemclass", nullable=false)
    public byte getFkItemclass() {
        return this.fkItemclass;
    }
    
    public void setFkItemclass(byte fkItemclass) {
        this.fkItemclass = fkItemclass;
    }


    @Column(name="id", nullable=false)
    public byte getId() {
        return this.id;
    }
    
    public void setId(byte id) {
        this.id = id;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ItemsubclassId) ) return false;
		 ItemsubclassId castOther = ( ItemsubclassId ) other; 
         
		 return (this.getFkItemclass()==castOther.getFkItemclass())
 && (this.getId()==castOther.getId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkItemclass();
         result = 37 * result + this.getId();
         return result;
   }   


}


