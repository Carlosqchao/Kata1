package software.ulpgc;

import java.util.Arrays;

public record Pokemon(String name, int generation, String[] abilities) {

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", generation=" + generation +
                ", abilities=" + Arrays.toString(abilities) +
                '}';
    }
}
