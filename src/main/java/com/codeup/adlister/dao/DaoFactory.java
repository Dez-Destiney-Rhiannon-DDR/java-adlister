package com.codeup.adlister.dao;
<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
import com.codeup.adlister.Config;


public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao; //Added this to connect
<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

<<<<<<< HEAD
    public static Users getUsersDao() { //Configuring
        if(usersDao == null) {
=======

    public static Users getUsersDao() { //Configuring
        if(usersDao == null) {

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

<<<<<<< HEAD

=======
>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
}
