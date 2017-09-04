package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/4.
 */

public class Province extends DataSupport{
    private int id;
    private String provincName ;
    private String provincCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincName() {
        return provincName;
    }

    public void setProvincName(String provincName) {
        this.provincName = provincName;
    }

    public String getProvincCode() {
        return provincCode;
    }

    public void setProvincCode(String provincCode) {
        this.provincCode = provincCode;
    }
}
