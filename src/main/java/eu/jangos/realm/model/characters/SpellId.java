package eu.jangos.realm.model.characters;
// Generated 06-mai-2016 23:00:34 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SpellId generated by hbm2java
 */
@Embeddable
public class SpellId  implements java.io.Serializable {


     private long fkOwner;
     private int fkDbcSpell;

    public SpellId() {
    }

    public SpellId(long fkOwner, int fkDbcSpell) {
       this.fkOwner = fkOwner;
       this.fkDbcSpell = fkDbcSpell;
    }
   


    @Column(name="fk_owner", nullable=false)
    public long getFkOwner() {
        return this.fkOwner;
    }
    
    public void setFkOwner(long fkOwner) {
        this.fkOwner = fkOwner;
    }


    @Column(name="fk_dbc_spell", nullable=false)
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
         
         result = 37 * result + (int) this.getFkOwner();
         result = 37 * result + this.getFkDbcSpell();
         return result;
   }   


}


