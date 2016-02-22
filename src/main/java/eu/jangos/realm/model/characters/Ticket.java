package eu.jangos.realm.model.characters;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ticket generated by hbm2java
 */
public class Ticket  implements java.io.Serializable {


     private int id;
     private Characters characters;
     private String body;
     private String response;
     private Date lastupdate;
     private Boolean solved;
     private Set whisperses = new HashSet(0);

    public Ticket() {
    }

	
    public Ticket(int id, Characters characters, Date lastupdate) {
        this.id = id;
        this.characters = characters;
        this.lastupdate = lastupdate;
    }
    public Ticket(int id, Characters characters, String body, String response, Date lastupdate, Boolean solved, Set whisperses) {
       this.id = id;
       this.characters = characters;
       this.body = body;
       this.response = response;
       this.lastupdate = lastupdate;
       this.solved = solved;
       this.whisperses = whisperses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Characters getCharacters() {
        return this.characters;
    }
    
    public void setCharacters(Characters characters) {
        this.characters = characters;
    }
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    public String getResponse() {
        return this.response;
    }
    
    public void setResponse(String response) {
        this.response = response;
    }
    public Date getLastupdate() {
        return this.lastupdate;
    }
    
    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
    public Boolean getSolved() {
        return this.solved;
    }
    
    public void setSolved(Boolean solved) {
        this.solved = solved;
    }
    public Set getWhisperses() {
        return this.whisperses;
    }
    
    public void setWhisperses(Set whisperses) {
        this.whisperses = whisperses;
    }




}


