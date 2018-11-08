package by.epam.agency.model;

public abstract class Entity implements Comparable<Entity> {
    
	private int id;
	
	public Entity() {}
	
	public Entity(int id) {
		this.id = id;
	}
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
	
    public int compareTo(Entity entity) {
    	return entity.id - id;
    }
    
}
