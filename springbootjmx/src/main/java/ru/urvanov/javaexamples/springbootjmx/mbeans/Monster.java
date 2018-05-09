package ru.urvanov.javaexamples.springbootjmx.mbeans;

public class Monster {
    
    private int level;
    
    private int health;
    
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + health;
        result = prime * result + level;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Monster other = (Monster) obj;
        if (health != other.health)
            return false;
        if (level != other.level)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Monster [level=" + level + ", health=" + health + "]";
    }
    
}
