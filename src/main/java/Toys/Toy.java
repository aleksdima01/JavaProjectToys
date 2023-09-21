package Toys;

public class Toy {
    String name;
    int id;
    int freq;

    public Toy(int id,String name,  int freq) {
        this.name = name;
        this.id = id;
        this.freq = freq;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getFreq() {
        return freq;
    }

    private void setFreq(int freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id=" + id +
                ", freq=" + freq;
    }
}
