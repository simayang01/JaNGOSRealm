package eu.jangos.realm.model.characters;
// Generated 06-mai-2016 23:00:34 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Skills generated by hbm2java
 */
@Entity
@Table(name="skills"
    ,catalog="jangoscharacters"
)
public class Skills  implements java.io.Serializable {


     private SkillsId id;
     private Characters characters;
     private int value;
     private int max;

    public Skills() {
    }

    public Skills(SkillsId id, Characters characters, int value, int max) {
       this.id = id;
       this.characters = characters;
       this.value = value;
       this.max = max;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="fkGuid", column=@Column(name="fk_guid", nullable=false) ), 
        @AttributeOverride(name="fkDbcSkill", column=@Column(name="fk_dbc_skill", nullable=false) ) } )
    public SkillsId getId() {
        return this.id;
    }
    
    public void setId(SkillsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_guid", nullable=false, insertable=false, updatable=false)
    public Characters getCharacters() {
        return this.characters;
    }
    
    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    
    @Column(name="value", nullable=false)
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }

    
    @Column(name="max", nullable=false)
    public int getMax() {
        return this.max;
    }
    
    public void setMax(int max) {
        this.max = max;
    }




}


