package eu.jangos.realm.model.characters;




/**
 * SpellId generated by hbm2java
 */
public class SpellId  implements java.io.Serializable {


     private int fkOwner;
     private int fkDbcSpell;

    public SpellId() {
    }

    public SpellId(int fkOwner, int fkDbcSpell) {
       this.fkOwner = fkOwner;
       this.fkDbcSpell = fkDbcSpell;
    }
   
    public int getFkOwner() {
        return this.fkOwner;
    }
    
    public void setFkOwner(int fkOwner) {
        this.fkOwner = fkOwner;
    }
    public int getFkDbcSpell() {
        return this.fkDbcSpell;
    }
    
    public void setFkDbcSpell(int fkDbcSpell) {
        this.fkDbcSpell = fkDbcSpell;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SpellId) ) return false;
		 SpellId castOther = ( SpellId ) other; 
         
		 return (this.getFkOwner()==castOther.getFkOwner())
 && (this.getFkDbcSpell()==castOther.getFkDbcSpell());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkOwner();
         result = 37 * result + this.getFkDbcSpell();
         return result;
   }   


}


