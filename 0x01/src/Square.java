public class Square extends MyAbstractclass {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    int calculateArea() {
        return this.side * this.side;
    }
}
