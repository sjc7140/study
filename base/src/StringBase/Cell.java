package StringBase;

import java.util.Objects;

public class Cell {
    private int x;
    private int y;

    public Cell(){
        x = 0;
        y = 0;
    }
    public Cell(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cell)) return false;
        Cell cell = (Cell) o;
        return x == cell.x &&
                y == cell.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
