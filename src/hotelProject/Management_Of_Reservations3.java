package hotelProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Management_Of_Reservations3 {

    Scanner in = new Scanner ( System.in );
    private ArrayList <Reservations3> arryR =new ArrayList<> ();       //مصفوفه من نوع الحجوزات
    private  Reservations3 rese;
    private Room3[][] room = new Room3[3][3];//صفوفه من نوع غرف 9 غرفه 3*3
    Date date =new Date ();

    public Management_Of_Reservations3 ( ) throws FileNotFoundException {// ديفولت كونو ستركتر

    //  readHotelfile ();  // قراه من ملف

        for (int i = 0; i < room.length; i++) {

            for (int j = 0; j < room[i].length; j++) {

                room[i][j] =new Room3 (i+1,j+1,false);// ااسناد ارقام الادوار وارقام الغرف وحالات الغرف انها فارغه

            }

        }


    }


    public void printRoom(){ // داله طباعه الغرف
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room.length; j++) {

                room[i][j].print ();
            }

        }
    }

/*
    public void readHotelfile() throws FileNotFoundException { // داله قراه من ملف

        Scanner in =new Scanner (new File ( "E:\\Hotelfile.txt" ) );

        while (in.hasNextLine ()){

            int fl =in.nextInt ();

            int ro = in.nextInt ();
          Reservations3 t= new Reservations3 (fl,ro,true);
        }
        in.close ();


    }
*/




    public void addReservations( ) { //داله اظافه الحجوزات

        printRoom (); //  استدعا داله طباعه الغرف

        int f = 0, r = 0;

        System.out.println ( "Enter the floor number" );  // ادخل رفم الطباق
        f = in.nextInt ();
        if (f <= room.length && f > 0) //فحص رقم الطابق اذا كان صحيح
        {
            System.out.println ( "Enter the room number" );//اادخل رقم الغرفه
            r = in.nextInt ();
            if (r <= room[f - 1].length && r > 0)//فحث رقم الغرفه اذا كانت موجوده في الطاابق المطلوب
            {
                if (room[f - 1][r - 1].isStatus () == false) { //فحص اذا كانت الغرفه المطلوبه فارغه

                    rese = new Reservations3 ( f , r , true );
                    room[f - 1][r - 1].setStatus ( true );

                    System.out.println ( "Enter the guest name" ); //ادخال اسم النزيل

                    rese.setName ( in.next () );

                    System.out.println ( "Enter the guest's phone" ); //ادخال رقم النزيل

                    rese.setPhone ( in.nextInt () );

                    System.out.println ( "Enter the guest's card number" ); //ادخال قم بطاقه النزيل

                    rese.setIdCard ( in.nextInt () );

                    System.out.println ( "Enter the Room reservation price" ); //ادخال سعر حجز الغرفه

                    rese.setPrice ( in.nextDouble () );

                    System.out.println ( "Enter how many people" ); //ادخال  عدد الاشخاص الذي في الغرفه

                    rese.setPerson ( in.nextInt () );

                    rese.setReservationsStatus ( true );   // تغيير حاله الحجز الي فعال

                    rese.setDate ( date );   //وضع تارخ و وقت الحجز

                    arryR.add ( rese ); // اضافه بيانات الحجز الئ مصفوفه الحجوز

                    arryR.get ( arryR.size () - 1 ).print (); // استدعاء داله الطباعه لطباعه الحجز


                } else
                    System.out.println ( "The Room is already booked " );//طباعه بان الغرفه المطلوبه حجزها محجوزه من قبل
            } else
                System.out.println ( "The Room number entered is incorrect" );// طباعه بان رقم الغرفه المدخل غير صحيح
        } else
            System.out.println ( "The entrance floor number is incorrect" );//طباعه بان رقم الطابق غير صحيح
    }
     public void printReservations(){  //داله لطباعه كافه الحجوزات

        for (int i = 0; i < arryR.size (); i++) {

           // System.out.println (arryR.get ( i ));  نستخدم هذا الامر لطباعه ااو الذي يلي
            arryR.get ( i ).print ();
        }
    }

    public void cancelReservations(){  // اله الغاء الحجوزات

        int f =0 ,r = 0;
        System.out.println ("Enter the floor number"); //ادخل رقم الطابق

        f=in.nextInt ();

        if (f<=room.length)  //فحص رقم الطابق المدخل اذا كان صحيح
        {
            System.out.println ("Enter the Room number"); // ادحال رقم الغرفه

            r=in.nextInt ();

            if (r<room[f].length){   //فحص اذا كان رقم الغرفه المدخله صحيح

                if (room[f-1][r-1].isStatus ()==true){ //فحص اذا كانت الغرفه المطلوب الغاء حجزها محجوزه من قبل
                    for (int i = 0; i < arryR.size (); i++) {
                        if (arryR.get ( i ).getFloor ()==f) //البحث عن رقم الطابق داخل مصفوفه الحجوزات
                        {
                            if (arryR.get ( i ).getRoom ()==r)//  البحث عن رقم الغرفه داخل مصفوفه الحجوزات
                            {

                                arryR.get ( i ).setReservationsStatus ( false );// تغيير حاله الحجز من فعال الي غير فعال

                                arryR.get ( i ).setStatus ( false ); // تغيير حاله الغرفه داخل الحجز من فعال ال غير فعال

                                room[f-1][r-1].setStatus ( false );// تغيير حاله الغرفه من ممتلئة الئ  فارغه

                                arryR.get ( i ).setDate ( date );//اضافه تاريخ ووقت الغاء الحجز

                            }
                        }
                    }

                }

            }
            else
                System.out.println ("This Room is not already booked");//طباعه اذا كان رقم الغرفه المطلوب الغاء حجزها ليست محجوزه من قبل
        }
        else
            System.out.println ("The room number entered is incrrect");//  طباعه اذا رقم الطابق المدخل صحيح


    }

}


