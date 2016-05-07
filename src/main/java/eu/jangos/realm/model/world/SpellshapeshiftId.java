package eu.jangos.realm.model.world;
// Generated 06-mai-2016 21:17:32 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SpellshapeshiftId generated by hbm2java
 */
@Embeddable
public class SpellshapeshiftId  implements java.io.Serializable {


     private int fkSpell;
     private byte fkShapeshift;

    public SpellshapeshiftId() {
    }

    public SpellshapeshiftId(int fkSpell, byte fkShapeshift) {
       this.fkSpell = fkSpell;
       this.fkShapeshift = fkShapeshift;
    }
   


    @Column(name="fk_spell", nullable=false)
    public int getFkSpell() {
        return this.fkSpell;
    }
    
    public void setFkSpell(int fkSpell) {
        this.fkSpell = fkSpell;
    }


    @Column(name="fk_shapeshift", nullable=false)
    public byte getFkShapeshift() {
        return this.fkShapeshift;
    }
    
    public void setFkShapeshift(byte fkShapeshift) {
        this.fkShapeshift = fkShapeshift;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SpellshapeshiftId) ) return false;
		 SpellshapeshiftId castOther = ( SpellshapeshiftId ) other; 
         
		 return (this.getFkSpell()==castOther.getFkSpell())
 && (this.getFkShapeshift()==castOther.getFkShapeshift());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkSpell();
         result = 37 * result + this.getFkShapeshift();
         return result;
   }   


}


