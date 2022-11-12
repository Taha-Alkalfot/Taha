package hotelProject;

public class Room3 extends Floor3 implements HotelPrintInterface {  //  كلاس الغرف interface يرث صفات كلاس الطوابق ويرث داله الطباعه الموجوده في الانترفيس

    private int room;             //  رقم الغرفه
    private  boolean Status;     // الغرفه حاله

    public Room3 () {
    }

    public Room3 ( int floor,int room , boolean Status ) {
        super ( floor );                        //  كنوستركتر يستقبل رقم الطابق مع رقم الغرفه مع حاله الغرفه
        this.room=room;
        this.Status=Status;
    }

    public int getRoom () {
        return room;
    }

    public void setRoom ( int room ) {
        this.room = room;
    }

    public boolean isStatus () {
        return Status;
    }

    public void setStatus ( boolean status ) {
        Status = status;
    }

    @Override
    public String toString () { // داله ال to string تطبع صفات كلاس الغرف وترث من كلاس الطوابق وتطبع الكل
        return super.toString ()+"."+ "Room3{" + "room=" + room + ", Status=" + Status + '}';
    }

    public void print(){   // اله طباعه interface

        System.out.println (super.toString ()+ "." + room + "Status =");
        if (Status==false)
            System.out.println ("empty}");
        else
            System.out.println ("not empty}");
    }


}
