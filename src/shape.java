import java.util.*;
public abstract class shape {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected shape(){
        dateCreated = new Date();
    }

    protected shape(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public  void setFilled(boolean filled){
        this.filled = filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "creat on " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
    }

    public abstract double getArea();

}

