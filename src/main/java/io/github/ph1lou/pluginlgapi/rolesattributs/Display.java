package io.github.ph1lou.pluginlgapi.rolesattributs;

import io.github.ph1lou.pluginlgapi.enumlg.Camp;

public interface Display {

    void setDisplayCamp(Camp camp);

    boolean isDisplayCamp(Camp camp);

    Camp getDisplayCamp() ;

    Roles getDisplayRole();

    void setDisplayRole(Roles roleLG);
}
