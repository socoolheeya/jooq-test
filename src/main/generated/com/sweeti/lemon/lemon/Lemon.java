/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.lemon;


import com.sweeti.lemon.DefaultCatalog;
import com.sweeti.lemon.lemon.tables.Accommodation;
import com.sweeti.lemon.lemon.tables.Amenity;
import com.sweeti.lemon.lemon.tables.Billing;
import com.sweeti.lemon.lemon.tables.Booking;
import com.sweeti.lemon.lemon.tables.BookingCancel;
import com.sweeti.lemon.lemon.tables.City;
import com.sweeti.lemon.lemon.tables.Country;
import com.sweeti.lemon.lemon.tables.Package;
import com.sweeti.lemon.lemon.tables.PackageOption;
import com.sweeti.lemon.lemon.tables.PackageOptionMeal;
import com.sweeti.lemon.lemon.tables.PackageRoom;
import com.sweeti.lemon.lemon.tables.Region;
import com.sweeti.lemon.lemon.tables.Room;
import com.sweeti.lemon.lemon.tables.RoomBed;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Lemon extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>lemon</code>
     */
    public static final Lemon LEMON = new Lemon();

    /**
     * The table <code>lemon.accommodation</code>.
     */
    public final Accommodation ACCOMMODATION = Accommodation.ACCOMMODATION;

    /**
     * The table <code>lemon.amenity</code>.
     */
    public final Amenity AMENITY = Amenity.AMENITY;

    /**
     * The table <code>lemon.billing</code>.
     */
    public final Billing BILLING = Billing.BILLING;

    /**
     * The table <code>lemon.booking</code>.
     */
    public final Booking BOOKING = Booking.BOOKING;

    /**
     * The table <code>lemon.booking_cancel</code>.
     */
    public final BookingCancel BOOKING_CANCEL = BookingCancel.BOOKING_CANCEL;

    /**
     * The table <code>lemon.city</code>.
     */
    public final City CITY = City.CITY;

    /**
     * The table <code>lemon.country</code>.
     */
    public final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>lemon.package</code>.
     */
    public final Package PACKAGE = Package.PACKAGE;

    /**
     * The table <code>lemon.package_option</code>.
     */
    public final PackageOption PACKAGE_OPTION = PackageOption.PACKAGE_OPTION;

    /**
     * The table <code>lemon.package_option_meal</code>.
     */
    public final PackageOptionMeal PACKAGE_OPTION_MEAL = PackageOptionMeal.PACKAGE_OPTION_MEAL;

    /**
     * The table <code>lemon.package_room</code>.
     */
    public final PackageRoom PACKAGE_ROOM = PackageRoom.PACKAGE_ROOM;

    /**
     * The table <code>lemon.region</code>.
     */
    public final Region REGION = Region.REGION;

    /**
     * The table <code>lemon.room</code>.
     */
    public final Room ROOM = Room.ROOM;

    /**
     * The table <code>lemon.room_bed</code>.
     */
    public final RoomBed ROOM_BED = RoomBed.ROOM_BED;

    /**
     * No further instances allowed
     */
    private Lemon() {
        super("lemon", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Accommodation.ACCOMMODATION,
            Amenity.AMENITY,
            Billing.BILLING,
            Booking.BOOKING,
            BookingCancel.BOOKING_CANCEL,
            City.CITY,
            Country.COUNTRY,
            Package.PACKAGE,
            PackageOption.PACKAGE_OPTION,
            PackageOptionMeal.PACKAGE_OPTION_MEAL,
            PackageRoom.PACKAGE_ROOM,
            Region.REGION,
            Room.ROOM,
            RoomBed.ROOM_BED
        );
    }
}
