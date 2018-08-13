package org.akhsan.greendaotes;

import java.util.List;

public class Repository {

    UserDao userDao;
    List<User> list;

    public Repository(){
        DaoSession daoSession =  MyApp.getInstance().getDaoSession();
        userDao=daoSession.getUserDao();
    }



    public List<User> getAllData() {
        list=userDao.loadAll();

        return list;
    }

    public void updateData( User user) {
        userDao.update(user);
    }


    public void deleteData( long id) {
        userDao.deleteByKey(id);
    }


    public void addData( User user) {
        userDao.insert(user);
    }

}


