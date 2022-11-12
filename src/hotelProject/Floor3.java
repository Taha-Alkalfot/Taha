package hotelProject;

public class Floor3 {
    private int floor;            // رقم الطابق

    public Floor3(){   //ديفولت كنوستركتر يعرف قيمه ابتائيه لرقم الطابق
        floor=0;
    }

    public Floor3 ( int floor ) { //كنوستركتر يستقبل رقم الطابق
        this.floor = floor;
    }

    public int getFloor () {
        return floor;
    }

    public void setFloor ( int floor ) {
        this.floor = floor;
    }

    @Override
    public String toString () {
        return "Floor3{" +
                "floor=" + floor +
                '}';
    }

}
