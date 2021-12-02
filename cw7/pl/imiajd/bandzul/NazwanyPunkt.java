package pl.imiajd.bandzul;

public class NazwanyPunkt extends Punkt {
    public NazwanyPunkt(int x, int y, String name)
    {
        super(x, y);
        this.name = name;
    }

    public void show()
    {
        System.out.println(name + ":<" + x() + ", " + y() + ">");
    }

    public String name;
}