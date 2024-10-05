package org.javatirane42.creational.builder;

public class Weapon {
    private String type;
    private String name;
    private Integer damage;
    private Long durability;

    private Weapon(String type, String name, Integer damage, Long durability) {
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.durability = durability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Long getDurability() {
        return durability;
    }

    public void setDurability(Long durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", durability=" + durability +
                '}';
    }

    public static class Builder {
        private String type;
        private String name;
        private Integer damage;
        private Long durability;

        //configure methods
        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDamage(Integer damage) {
            this.damage = damage;
            return this;
        }

        public Builder withDurability(Long durability) {
            this.durability = durability;
            return this;
        }

        //creates the target object
        public Weapon build() {
            return new Weapon(type, name, damage, durability);
        }
    }
}
