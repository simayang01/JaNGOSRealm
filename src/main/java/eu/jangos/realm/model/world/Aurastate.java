package eu.jangos.realm.model.world;
// Generated 06-mai-2016 21:17:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Aurastate generated by hbm2java
 */
@Entity
@Table(name="aurastate"
    ,catalog="jangosworld"
)
public class Aurastate  implements java.io.Serializable {


     private byte id;
     private String state;
     private Set<Spells> spellsesForFkTargetAuraState = new HashSet<Spells>(0);
     private Set<Spells> spellsesForFkCasterAuraState = new HashSet<Spells>(0);

    public Aurastate() {
    }

	
    public Aurastate(byte id) {
        this.id = id;
    }
    public Aurastate(byte id, String state, Set<Spells> spellsesForFkTargetAuraState, Set<Spells> spellsesForFkCasterAuraState) {
       this.id = id;
       this.state = state;
       this.spellsesForFkTargetAuraState = spellsesForFkTargetAuraState;
       this.spellsesForFkCasterAuraState = spellsesForFkCasterAuraState;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public byte getId() {
        return this.id;
    }
    
    public void setId(byte id) {
        this.id = id;
    }

    
    @Column(name="state", length=45)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aurastateByFkTargetAuraState")
    public Set<Spells> getSpellsesForFkTargetAuraState() {
        return this.spellsesForFkTargetAuraState;
    }
    
    public void setSpellsesForFkTargetAuraState(Set<Spells> spellsesForFkTargetAuraState) {
        this.spellsesForFkTargetAuraState = spellsesForFkTargetAuraState;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aurastateByFkCasterAuraState")
    public Set<Spells> getSpellsesForFkCasterAuraState() {
        return this.spellsesForFkCasterAuraState;
    }
    
    public void setSpellsesForFkCasterAuraState(Set<Spells> spellsesForFkCasterAuraState) {
        this.spellsesForFkCasterAuraState = spellsesForFkCasterAuraState;
    }




}


