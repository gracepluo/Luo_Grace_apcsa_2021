//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
public class ToyStore
{

    private final List<Toy> toys = new ArrayList<>();

    public ToyStore(String t)
    {
        loadToys(t);
    }

    public void loadToys(String ts)
    {
        String[] names = ts.split(" ");
        for (String name : names) {
            boolean toyExists = false;
            for (Toy toy : toys) {
                if (name.equals(toy.getName())) {
                    toy.setCount(toy.getCount() + 1);
                    toyExists = true;
                    break;
                }
            }
            if (!toyExists) {
                toys.add(new Toy(1, name));
            }
        }
    }

    public Toy getThatToy(String name) {
        for (Toy toy : toys) {
            if (name.equals(toy.getName())) {
                return toy;
            }
        }
        return null;
    }

    public String getMostFrequentToy()
    {
        int max = -1;
        String mostFrequentToy = "";
        for (Toy toy : toys) {
            if (max < toy.getCount()) {
                max = toy.getCount();
                mostFrequentToy = toy.getName();
            }
        }
        return mostFrequentToy;
    }

    public String toString()
    {
        return toys.toString();
    }

}
