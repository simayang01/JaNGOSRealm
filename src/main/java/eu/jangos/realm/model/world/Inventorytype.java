package eu.jangos.realm.model.world;
// Generated 06-mai-2016 21:17:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Inventorytype generated by hbm2java
 */
@Entity
@Table(name="inventorytype"
    ,catalog="jangosworld"
)
public class Inventorytype  implements java.io.Serializable {


     private byte id;
     private String type;
     private Set<Spells> spellses = new HashSet<Spells>(0);
     private Set<Item> items = new HashSet<Item>(0);

    public Inventorytype() {
    }

	
    public Inventorytype(byte id, String type) {
        this.id = id;
        this.type = type;
    }
    public Inventorytype(byte id, String type, Set<Spells> spellses, Set<Item> items) {
       this.id = id;
       this.type = type;
       this.spellses = spellses;
       this.items = items;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public byte getId() {
        return this.id;
    }
    
    public void setId(byte id) {
        this.id = id;
    }

    
    @Column(name="type", nullable=false, length=20)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="spellinventorytype", catalog="jangosworld", joinColumns = { 
        @JoinColumn(name="fk_inventorytype", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="fk_spell", nullable=false, updatable=false) })
    public Set<Spells> getSpellses() {
        return this.spellses;
    }
    
    public void setSpellses(Set<Spells> spellses) {
        this.spellses = spellses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="inventorytype")
    public Set<Item> getItems() {
        return this.items;
    }
    
    public void setItems(Set<Item> items) {
        this.items = items;
    }




}


