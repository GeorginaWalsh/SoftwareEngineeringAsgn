public class Room {

    private String id;
    private String floor;
    private String accessible;

    /**
     * Room Constructor
     */
    public Room(String id, String floor, String accessible){

        this.id = id;
        this.floor=floor;
        this.accessible=accessible;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * Getters
     * @return ID, Floor and Accessibility Information
     */

    public String getId(){
        return id;
    }

    public String getFloor(){
        return floor;
    }

    public String getAccessible(){
        return accessible;
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * Setters - Sets values for ID, Floor and Accessibility
     */

    public void setId(String id){
        this.id = id;
    }

    public void setFloor(String floor){
        this.floor=floor;
    }

    public void setAccessible(String accessible){
        this.accessible=accessible;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Override
    public String toString() {
        return "Room:  " +
                "ID:  '" + id + '\'' +
                ", Floor:  '" + floor + '\'' +
                ", Accessibility:  '" + accessible + '\'' +
                '.';
    }
}
