package hotelProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservations3 extends Room3 {  // كلاس الحجوزات يرث صفات كلاس العرف  رقم الطابق و رقم الغرفه وحاله الغرفه

    private String name;     //  اسم صاحب الحجز
    private long phone, idCard; // رقم الهاتف ورقم بطاقه صاحب الحجر
    private double price;      // سعر الحجز
    private int person;       // عدد الاشخاص ضمن الحجز
    private boolean ReservationsStatus;  // حاله الحجز
    private Date date; // تاريخ الحجز
    private SimpleDateFormat start = new SimpleDateFormat ( "hh:mm:ss a : yyyy / MM /dd" ); // تنسيق التاريخ و الوقت

    public Reservations3 ( int floor , int room , boolean Status ) {   //كونستركتر يستقبل رقم الطابق ورقم الغرفه وحاله الغرفه
        super ( floor , room , Status ); //يرسل لكلاس الغرف رقم طابق الحجز ورقم غرفه الحجز وحاله الغرفه عند الحجز
    }





    public  String getName(){
        return name;
    }

    public boolean isReservationsStatus(){
        return ReservationsStatus;
    }

    public void setReservationsStatus(boolean ReservationsStatus){
        this.ReservationsStatus=ReservationsStatus;
    }

   public void setName(String name){
        this.name = name;
   }

    public long getPhone () {
        return phone;
    }

    public void setPhone ( long phone ) {
        this.phone = phone;
    }

    public long getIdCard () {
        return idCard;
    }

    public void setIdCard ( long idCard ) {
        this.idCard = idCard;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice ( double price ) {
        this.price = price;
    }

    public int getPerson () {
        return person;
    }

    public void setPerson ( int person ) {
        this.person = person;
    }

    public Date getDate () {
        return date;
    }

    public void setDate ( Date date ) {
        this.date = date;
    }


    @Override
    public String toString () {
        return "Reservations3{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", idCard=" + idCard +
                ", price=" + price +
                ", person=" + person +
                ", ReservationsStatus=" + ReservationsStatus +
                '}';
    }

    public void print(){ //داله طباعه الانترفيس
        System.out.println ( "Reservations [ Room="+super.getFloor ()+"."+super.getRoom ()
        +", Customer Name ="+name
        +", phone ="+phone
        +", idCard ="+idCard
        +", price ="+price
        +", person ="+person
        +", Date and Time :"+start.format ( date )
        +", ReservationsStatus ="+ReservationsStatus+']'  );
    }

}