package com.hyugnmin.android.bbsbasic.interfaces;

/**
 * Created by besto on 2017-02-14.
 */


import com.hyugnmin.android.bbsbasic.domain.Memo;

import java.sql.SQLException;

/**
 * Created by pc on 2/14/2017.
 */

public interface DetailInterface {
    public void backToList();
    public void saveToList(Memo memo) throws SQLException;
}