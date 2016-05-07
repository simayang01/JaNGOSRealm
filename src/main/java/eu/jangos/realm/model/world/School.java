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
 * School generated by hbm2java
 */
@Entity
@Table(name="school"
    ,catalog="jangosworld"
)
public class School  implements java.io.Serializable {


     private byte id;
     private String school;
     private Set<Spells> spellses = new HashSet<Spells>(0);

    public School() {
    }

	
    public School(byte id, String school) {
        this.id = id;
        this.school = school;
    }
    public School(byte id, String school, Set<Spells> spellses) {
       this.id = id;
       this.school = school;
       this.spellses = spellses;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public byte getId() {
        return this.id;
    }
    
    public void setId(byte id) {
        this.id = id;
    }

    
    @Column(name="school", nullable=false, length=15)
    public String getSchool() {
        return this.school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="school")
    public Set<Spells> getSpellses() {
        return this.spellses;
    }
    
    public void setSpellses(Set<Spells> spellses) {
        this.spellses = spellses;
    }




}


