package eu.jangos.realm.model.world;




/**
 * ItemsubclassId generated by hbm2java
 */
public class ItemsubclassId  implements java.io.Serializable {


     private byte fkItemclass;
     private byte id;

    public ItemsubclassId() {
    }

    public ItemsubclassId(byte fkItemclass, byte id) {
       this.fkItemclass = fkItemclass;
       this.id = id;
    }
   
    public byte getFkItemclass() {
        return this.fkItemclass;
    }
    
    public void setFkItemclass(byte fkItemclass) {
        this.fkItemclass = fkItemclass;
    }
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


