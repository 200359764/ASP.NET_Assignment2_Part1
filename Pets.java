package pets;

/**
 *
 * @author seunghwankim
 */
public abstract class Pets {
    private String name;
    private String bread;
    

    public Pets(String name, String bread) {
        this.name = name;
        this.bread = bread;
        
    }
        
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bread
     */
    public String getBread() {
        return bread;
    }

    /**
     * @param bread the bread to set
     */
    public void setBread(String bread) {
        this.bread = bread;
    }
        
    public abstract String speak();
   
}
    

